dubbo的使用：
--|dubbo-parent
	--|dubbo-api : 服务声明
	--|dubbo-provider: 服务提供者
	--|dubbo-consumer: 服务消费者
	--|dubbo-admin-0.0.1-SNAPSHOT.jar ： 编译后的dubbo管理中心，里面的dubbo.properies要修改zookeeper的地址
	--|dubbo-monitor-simple-2.0.0.jar : dubbo简单监控中心，直接运行jar包（修改zookeeper的地址）
	--|dubbo-monitor-simple-2.0.0-assembly.tar.gz ： dubbo简单监控中心，需要解压，找到start.sh文件运行（如果报错：-> vi start.sh -> :set ff=unix -> :wq）

1. maven module搭建工程，在父类中引入公用依赖。需要注意的是maven插件，要使用原生maven的插件。
   &可以查看我的博客： https://blog.csdn.net/weixin_38289303/article/details/97100339

2. 导入依赖：
	<dependency>
            <groupId>com.alibaba.boot</groupId>
            <artifactId>dubbo-spring-boot-starter</artifactId>
            <version>0.2.0</version>
        </dependency>

3. 集成使用dubbo：
   a. @Server (服务提供者，且是dubbo的注解)
   b. @Reference  (服务消费者，引用服务)
   c. 配置服务基本扫描路径： dubbo.scan.basePackages
   &详细可以查看博客：https://blog.csdn.net/nangeali/article/details/82527039