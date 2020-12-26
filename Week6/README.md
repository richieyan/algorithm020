# 学习笔记

## 算法模板

### 递归模板

```python
def recursion(level,param):
  # terminator
  if level > MAX_LEVEL:
    # process result
    return;
  
  # process current logic
  process(level, param)

  # drill down
  recursion(level+1, newParam)

  # restore status
  # ....

  # end
}
```

### 分治模板

```python
def divide_conquer(problem, param1, param2):
     # terminator
  if problem is None:
    print_result
    return
  
  # perpare data
  data = prepare_data(problem)
  subproblems = split_problem(problem, data) 

  # conquer subproblems 
  subresult1 = self.divide_conquer(subproblems[0], p1, ...) 
  subresult2 = self.divide_conquer(subproblems[1], p1, ...) 
  subresult3 = self.divide_conquer(subproblems[2], p1, ...)
  
  # process and generate the final result 
  result = process_result(subresult1, subresult2, subresult3, …)
	
  # revert the current level states
  
```

### 感触

* 人肉递归效率低,很累
* 找到最近的最减方法，拆解为可重复解决的问题
* 数学归纳法思维（抵制人肉递归思维）

*本质: 寻找重复性 -> 计算机指令集*


### 递归树

不要偷懒，用笔画出来，不要人脑练习。
方便理解，掌握树形结构。

## 动态规划

### 定义

* [wiki 定义](https://en.wikipedia.org/wiki/Dynamic_programming)
* "Simplifying a complicated problem by breaking it down into simpler sub-problems" (in a recursive manner)
* Divide & Conquer + Optimal substructure 分治+最优子结构

### 关键理解

* 动态规划 和 递归或分治*没有根本上的区别*（关键看有无最优子结构）
* **共性：找到重复的子问题**
* 差异性：最优子结构、中途可以*淘汰*次优解

### 解题思路

* 最优子结构
* 状态数组
* 状态转移方程(递推公式)


### 实战例题

#### 斐波那契数列

##### 自顶向下，递归法

递归状态树是指数级，2^n 指数复杂度, 利用记忆化搜索，降低大量状态计算，O(n)

本质还是递归，从fib(n)--->fib(0)

```java
int fib(int n, int[] memo){
  if(n < 2){
    return n;
  }

  if(memo[n] == 0){
    memo[n] = fib(n-1)+fib(n-2);
  }
  return memo[n];
}
```

##### 自底向上，递推法
DP 优先使用递推法，竞赛通常直接使用递推。
```java
int fib(int n){
  if(n <= 1){
    return n;
  }
  int a=0, b=1, c=0;
  for(int i=2;i<=n;i++){
    c=a+b;
    a=b;
    b=c;
  }
  return c;
}
```

#### 复杂 DP
* 多个维度
* 最优子结构的取舍
