1、resultType（属性）和resultMap（标签引用）的区别？
   resultType不支持自定义返回结果  对于查询数据库返回的结果，如果是一般数据类型，通过mybatis自带typeHandler将数据库类型转为java支持的类型，比如 varchar->String 如果resultType指定的是一个Java类（别名或者类路径），将查询到的结果赋给resultType中java对象的同名的属性，对象中的属性名必须和数据库的字段一致。   

   resultMap 支持自定义返回结果
   提前配置类和表，类的属性名和表的列名的对应关系，数据库的查询到的结果根据配置的关系
   将列的值赋给类的属性

2、collection和association的区别？

   collection是处理一对多的关系，外层查询中某列作为外键关联内嵌对象集合的某列
   
   association是处理一对一或者多对一的关系，外层查询结果集的某列关联内嵌对象的某列 
   

3、Statement和PreparedStatement的区别？

	Statement是将完整的sql发送给数据库，并且生成执行计划，没有cache，对于一条数据的执行力会大于PreparedStatement，但是会有sql注入的问题。
	PreparedStatement会将带占位符的sql预编译成有或者无参的存储过程，只预编译一次，生成一次执行计划，采用了cache机制，对于批量操作来说因为只预编译了一次，每次用到直接从cache里面取出sql并且传入变量，所以批量性能和对数据库内存的开销远远小于Statement，并且没有sql注入。


