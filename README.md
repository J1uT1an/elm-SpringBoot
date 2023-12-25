### Mybatis
Mybatis 写 SQL 语句的时候可以用注解的形式，也可以写在映射文件里面。

在本工程中，我们约定
1. 简单的 SQL 语句写在注解里面
2. 复杂的 SQL 语句写在映射文件里面

映射文件放在 src/main/resources/mapper/ 里面。

> 实际上，工程编译后，main/java/com/luxintong/elmboot/mapper 和 src/main/resources/mapper 是同一个文件夹
> 这样的话，工程的映射文件和 mapper 接口会处在同一个文件夹下

