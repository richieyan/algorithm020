# 学习笔记

## 高效学习法

### 三分视频，七分练习

光看不练，没长进，比如健身，不运动看再多也没用。

视频播放：1.5~2.0 倍速， 本人两倍速，重要的内容暂停再过一遍，不要看一遍就结束。

利用思维导图记录视频内容，梳理关键点。


### 摒弃「旧」习惯

不要死磕，不要死磕，不要死磕。算法是拿来用的，发明一个新算法是很难的，不要企图发明算法来解决问题。

不要不屑于看解答。高手代码就算你看一遍，也未必能看懂，就算看懂了，也未必能默写出来。

五毒神掌：五遍刷题，敢放手看别人题解，敢死记硬背代码。掌握套路，应用套路解决问题，不需要发明套路。

最佳刷题法：5~10 分钟尝试解答，多个解法尝试。如果处于懵逼状态，看高票解答，看暴力解答。别以为暴力简单，有时候暴力也不容易写出来。感觉菜很正常，借力理解，借势而起，把套路变成自己的，把高手的代码变成的自己，未来才能解决更多的问题。

最差方式：单挑，不借助外部力量。盲目估计解决时间，死磕几小时也可能没进展，代码完成情况很差，最终时间不够，无法完成刷题目标，最终放弃（大部分的结局）。



### 学习方法

不要怕重复，刻意练习本身就是简单的重复。

重复一下：改变「旧」习惯，不要死磕(AC)，看懂别人的题解也是学习。

五毒神掌：刷 5 遍，后面会介绍如何刷 5 遍。

最大误区：LeetCode 题目只做一遍，追求 AC。应该追求套路理解，追求对各类数据结构的掌握，对结构与算法在不同问题的应用。


### 精通领域三步法

来自「异类」这本书，如何精通一个领域领域
* Chunk it up: 知识树构建，脉络化，系统化知识才更容易掌握和记忆
* Deliberate Practice：刻意练习，针对性训练某个套路，某个方法
* Feedback：反馈，主动反馈（主动找看题解，主动咨询），被动反馈（靠别人的指点，反馈）


## 预备知识与学习准备

### 数据结构

维度划分法，按数据结构的特点分为一维，二维和特殊数据结构

* 一维 
  * 基础型 array, linkedlist 
  * 高级型 stack, queue, deque, set, map(hash/set), skiplist
* 二维
  * 基础型 tree, graph
  * 高级型 binary search tree(BST), red-black tree, AVL, heap， disjoin tree(并查集)，trie(字典树)，etc
* 特殊
  * 位运算 bitwise，bloomfilter
  * LRU 缓存


### 算法

算法中寻找重复性是非常重要工作，计算机的优势是可以毫不费力完成大量重复逻辑。

算法训练目标是能够通过快速回忆各种算法思想目标（套路）后，应用算法解决问题。

算法训练目标不是发明新算法，记住现有算法套路一样有用。

  * 基础
    * 分支 if-else
    * 迭代 for, while loop
    * 递归 Divider & Conquer, Backtrace
  * 高级
    * 搜索
    * 动态规划 DP
    * 二分查找
    * 贪心 Greedy
    * 数学 Math & 几何 Geometry
  

### 方法学（第二遍）

方法学多来几遍，随时灌输，随时操练。

* 职业化训练 成为职业人士与业余选手的区别就在训练。拆分知识点，专项训练。
* 刻意练习 
  * 五毒神掌（五遍刷题法）
  * 练习自己的弱项和缺陷（自己找自己茬）
  * 不舒服和枯燥很正常， 克服之后才能登顶。
* 反馈 
  * 即时反馈，AC 失败
  * 主动反馈，找题解，高手代码，源代码
  * 被动反馈 CR，教练指导

* 切题四件套
  * Clarification 审题，弄清题目，注意边界
  * Possible Solution 方案，要多个，不要排斥暴力。暴力干出来也行，能够比较方案优劣。
  * Coding 多写，暴力写，能够默写高票答案
  * Test cases 利用测试数据，验证

* 五毒神掌
  * 第一遍 5~15 分钟：读题+思考；没思路：看解法，注意！多解法，比较优劣；背诵、默写好的算法
  * 第二遍 马上自己写：闭卷考试 -> leetcode 提交；多种解法比较，体会 -> 优化! 关注执行时间；
  * 第三遍 过一天后，重复做题；不同解法的熟练程度 -> 专项练习
  * 第四遍 过一周；反复回来练习相同的题目
  * 第五遍 面试前一周：恢复性训练

### 工具

* Google
* Mac iTerm2 + zsh
* LeetCode 插件
* IDE vscode/intelliJ/pyCharm
* Code Style
* 编程指法 各种编辑器快捷键，加速编码/ Top tips for IDE
* 自顶而下编程 先主干逻辑在细节逻辑



### 时间复杂度

大 O 表示法， O(1), O(n)， O(n^2)

递归分析
  * 递归状态树
  * 主定理

四种递归场景
  * Binary Search T(n)=T(n/2)+O(1) => O(log n)
  * Binary Tree Traversal T(n)=2T(n/2)+O(1) => O(n) 速记：每个节点只会访问一次
  * Optimal sorted matrix search T(n)=2T(n/2)+O(log n) => O(n)
  * Merge Sort T(n)=T(n/2)+O(n) => O(nlog n)


### 空间复杂度

* 数组长度
* 递归深度


## 数组，链表和跳表

数组、链表比较基础，关注下增删改查的时间复杂度即可。

跳表是一个比较新的数据结构，对标平衡树与二分查找，可以在特定场景下替换平衡树或二分查找。

### 数组题

掌握索引操作，索引遍历代码.

i,j 两层遍历，夹逼遍历

### 链表题

掌握链表指针的修改操作，难度在于代码清晰度，算法本身难度不大。

### 参考资料

  * [Java 源码分析（ArrayList）](http://developer.classpath.org/doc/java/util/ArrayList-source.html)
  * [Linked List 的标准实现代码](http://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/)
  * [Linked List 示例代码](http://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/code/LinkedList.java)
  * [Java 源码分析（LinkedList）](http://developer.classpath.org/doc/java/util/LinkedList-source.html)
  * [LRU Cache - Linked list](http://www.zhihu.com/question/20202931)

## 栈，队列，优先队列，双端队列

通过 Java 的源码学习，了解其实现方案，可以动手试试写简化版本。

### 栈题

最近相关性问题：最外层和最内层存在关系，且这个关系有助于解题，比如洋葱的结构

[有效的括号](https://leetcode-cn.com/problems/valid-parentheses/)
[最小栈](https://leetcode-cn.com/problems/min-stack/)



