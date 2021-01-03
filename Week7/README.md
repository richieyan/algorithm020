# 高级主题

## 字典树

### 定义

字典树又称单词查找树，是一种树形结构，是一种哈希树的变种。典型应用是用于统计，排序和保存大量的字符串（但不仅限于字符串），所以经常被搜索引擎系统用于文本词频统计。它的优点是：利用字符串的公共前缀来减少查询时间，最大限度地减少无谓的字符串比较，查询效率比哈希树高。

### Trie Tree 的性质

根节点不包含字符，除根节点外每一个节点都只包含一个字符； 从根节点到某一节点，路径上经过的字符连接起来，为该节点对应的字符串； 每个节点的所有子节点包含的字符都不相同。


### 代码模板

```java
class Trie {
  private boolean isEnd;
  private Trie[] next;

  /**
    * Initialize  your  data  structure  here.
    */
  public Trie() {
      isEnd = false;
      next = new Trie[26];
  }

  /**
    * Inserts  a  word  into  the  trie.
    */
  public void insert(String word) {
      if (word == null || word.length() == 0) return;
      Trie curr = this;
      char[] words = word.toCharArray();
      for (int i = 0; i < words.length; i++) {
          int n = words[i] - 'a';
          if (curr.next[n] == null) curr.next[n] = new Trie();
          curr = curr.next[n];
      }
      curr.isEnd = true;
  }

  /**
    * Returns  if  the  word  is  in  the  trie.
    */
  public boolean search(String word) {
      Trie node = searchPrefix(word);
      return node != null && node.isEnd;
  }

  /**
    * Returns  if  there  is  any  word  in  the  trie  that  starts  with  the  given  prefix.
    */
  public boolean startsWith(String prefix) {
      Trie node = searchPrefix(prefix);
      return node != null;
  }

  private Trie searchPrefix(String word) {
      Trie node = this;
      char[] words = word.toCharArray();
      for (int i = 0; i < words.length; i++) {
          node = node.next[words[i] - 'a'];
          if (node == null) return null;
      }
      return node;
  }
}
```



## 并查集

### 定义

并查集是一种树型的数据结构，用于处理一些不交集（Disjoint Sets）的合并及查询问题。有一个联合-查找算法（union-find algorithm）定义了两个用于此数据结构的操作

* Find：确定元素属于哪一个子集。这个确定方法就是不断向上查找找到它的根节点，它可以被用来确定两个元素是否属于同一子集。
* Union：将两个子集合并成同一个集合。

　　由于支持这两种操作，一个不相交集也常被称为联合-查找数据结构（union-find data structure）或合并-查找集合（merge-find set）。其他的重要方法，MakeSet，用于建立单元素集合。有了这些方法，许多经典的划分问题可以被解决，比如说朋友圈，集合合并。

### 代码模板

```java
class UnionFind {
    private int count = 0;
    private int[] parent;

    public UnionFind(int n) {
        count = n;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    public int find(int p) {
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;
        parent[rootP] = rootQ;
        count--;
    }
}
```
## 高级搜索

### 剪枝

常用的搜索有 Dfs 和 Bfs。

Bfs 的剪枝通常就是判重，因为一般 Bfs 寻找的是步数最少，重复的话必定不会在之前的情况前产生最优解。

深搜，它的进程近似一颗树(通常叫 Dfs 树)。

而剪枝就是一种生动的比喻：把不会产生答案的，或不必要的枝条“剪掉”。

剪枝的关键就在于剪枝的判断：什么枝该剪，什么枝不该剪，在什么地方减。

常用的剪枝有：可行性剪枝、最优性剪枝、记忆化搜索、搜索顺序剪枝。

### 双向 BFS

双向 BFS 算法的实质还是 BFS，只不过两边同时开始BFS而已。还是可以利用队列来实现：可以设置两个队列，一个用于向前的BFS，另一个用于向后的BFS，利用这两个队列，同时从前、后开始层次遍历搜索树。


### 启发式搜索（A*）

启发式搜索(Heuristically Search)又称为有信息搜索(Informed Search)，它是利用问题拥有的启发信息来引导搜索，达到减少搜索范围、降低问题复杂度的目的，这种利用启发信息的搜索过程称为启发式搜索。

代码模板

```python
def AstarSearch(graph, start, end):
  pq = collections.priority_queue() # 优先级 —> 估价函数
  pq.append([start]) 
  visited.add(start)	
  while pq: 		
    node = pq.pop() # can we add more intelligence here ?		
    visited.add(node)

		process(node) 		
    nodes = generate_related_nodes(node) 
    unvisited = [node for node in nodes if node not in visited]
    pq.push(unvisited)
```


## 红黑树和 AVL 树

* AVL 树：删除等修改操作复杂度较高
* 红黑树：近似平衡二叉树，读取性能低于 AVL 树，但是删除等操作较快，很多语言的 Map 实现使用的红黑树。

## 参考资料

* [并查集](https://zhuanlan.zhihu.com/p/93647900)
* [估价函数选择](https://dataaspirant.com/2015/04/11/five-most-popular-similarity-measures-implementation-in-python/)
* [8 Puzzles – Bidirectional A* vs Bidirectional BFS](https://zxi.mytechroad.com/blog/searching/8-puzzles-bidirectional-astar-vs-bidirectional-bfs/)