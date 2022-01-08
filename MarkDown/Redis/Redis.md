# Redis
## 关于Redis 

redi是一个开源的使用C语言编写的一个kv存储系统，是一个速度非常快的非关系型数据库。它支持包括String List Set Zset Hash五种数据结构。



### 五种数据结构

#### 字符串 （String）

String是redis最基本的类型，一个key对应一个value。String类型是二进制安全的，那就代表redis的String可以包含任何数据，比如jpg图片或者序列化对象。（String是Redis最基本的数据类型，一个键最大能存储512MB）



#### 列表（List）

在Redis中List类型是按照插入顺序排序的字符串链表（相当于Java的LinkedList）和数据结构中普通的链表一样，Redis可以的在头部（left）或者尾部（right）进行插入新的元素。在插入时，如果该键并不存在，Redis将会为该键创建一个新的链表。与此相反，如果链表中所有元素都均被删除了，则Redis会移除该键。



#### 哈希（Hash）

我们可以把Redis中的Hash看成具有 <key, <ky1, value>>，其中一个key可以包含多个不同key值的 <key, value>。所以该类型非常适合于存储值对象的信息。如：Username、Password和Age等。如果Hash中包含很少的字段，则该类型也进仅占很少的磁盘空间。



#### 集合（Set）

Set类型看作<b>没有排序</b>的字符集合，如果多次添加相同的元素，则Set中只会保存<b>一份该元素</b>的拷贝。



#### 有序集合（Zset）

Sorted-Set 中的每一个成员都会关联一个<b>分数（score）</b> ，Redis正是通过这个分数来为集合中每个成员进行排序。成员是唯一的，但是分数（score）是可以重复的。分数最低的索引为0。（ZSet的底层数据结构是 <b>跳表</b> ）



## Redis的持久化

### 常见的过期策略

如果一个键（key）过期了，那么它什么时候会被删除呢？（有三种不同的删除策略）



































