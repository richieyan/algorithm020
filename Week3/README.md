# 学习笔记

## 递归

### 要点

* 不要人肉递归，烧脑且容易出错
* 找最近重复性
* 数学归纳法的思想：初始条件, N -> N+1


### 本质

* 利用函数重复
* 重复过程中的状态变化
* 必须存在终止状况


### 模板代码

熟练掌握和实践模板代码，深刻理解递归解决问题的套路。

```python
def recursion(level, param1, param2, ...):
  # 1. terminator
  if level > MAX_LEVEL:
    # process_result
    return
  
  # 2. process logic
  process(level, data, ...)
  
  # 3. drill down
  self.recursion(level+1, param1, param2,...)

  # 4. clear status if needed
```

### 题型

* 爬楼梯
* 括号生成

## 分治与回溯

###	重复性(递归）

* 最近重复性 - 普通递归，分治与回溯
* 最优重复性 - 动态规划，贪心算法

### 思想
*	特殊的递归
*	Divide/Conquer

###	代码模板
```python
def divide_conquer(problem, param1, param2, ...): 
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

###	回溯(Backtracing)

#### 思想

*	分步试错
*	取消一定步数，在开始
*	归去来兮的感觉

### 题型

*	pow(x,n)
*	子集
*	多数元素
*	电话号码的组合
*	N 皇后问题




