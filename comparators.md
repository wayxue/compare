# Comparable & Comparator
- Comparable 和 Comparator 都是用来实现集合中元素的比较、排序的。
- Comparable 是在集合内部定义的方法实现排序，需要排序的元素实现Comparable 接口，位于 java.util 下。
- Comparator 是在集合外部实现的排序，需要有一个实现了Comparator 接口的类，位于 java.lang 下。
- Comparable 是一个对象本身就已经支持自比较所需要实现的接口，可完成比价大小操作。如String、 Integer 自己就实现了 Comparable 接口。自定义的类实现Comparable 接口，并加入list容器中，能够通过Collections 中的sort方法排序，默认按照接口提供的compareTo 方法排序。
- Comparator 是一个专用的比较器，当这个对象不支持字比较或者字比较函数不能满足要求时，可写一个比较器来完成两个对象之间大小的比较。Comparator 体现了一种策略模式，就是不改变对象自身，而用一个策略对象来改变它的行为。
- Comparable 是自己完成比较，Comparator 是外部程序实现比较。
- Comparator 实现了算法和数据分离，Comparable 是支持字比较的，当字比较不能满足需求时，可以使用Comparator 来扩展比较规则。
- Colllections.sort() 方法参数不同，Comparator 排序时，需要调价一个比较器对象，该对象实现了Comparator 接口。