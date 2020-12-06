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



