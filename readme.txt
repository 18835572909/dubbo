dubbo��ʹ�ã�
--|dubbo-parent
	--|dubbo-api : ��������
	--|dubbo-provider: �����ṩ��
	--|dubbo-consumer: ����������
	--|dubbo-admin-0.0.1-SNAPSHOT.jar �� ������dubbo�������ģ������dubbo.properiesҪ�޸�zookeeper�ĵ�ַ
	--|dubbo-monitor-simple-2.0.0.jar : dubbo�򵥼�����ģ�ֱ������jar�����޸�zookeeper�ĵ�ַ��
	--|dubbo-monitor-simple-2.0.0-assembly.tar.gz �� dubbo�򵥼�����ģ���Ҫ��ѹ���ҵ�start.sh�ļ����У��������-> vi start.sh -> :set ff=unix -> :wq��

1. maven module����̣��ڸ��������빫����������Ҫע�����maven�����Ҫʹ��ԭ��maven�Ĳ����
   &���Բ鿴�ҵĲ��ͣ� https://blog.csdn.net/weixin_38289303/article/details/97100339

2. ����������
	<dependency>
            <groupId>com.alibaba.boot</groupId>
            <artifactId>dubbo-spring-boot-starter</artifactId>
            <version>0.2.0</version>
        </dependency>

3. ����ʹ��dubbo��
   a. @Server (�����ṩ�ߣ�����dubbo��ע��)
   b. @Reference  (���������ߣ����÷���)
   c. ���÷������ɨ��·���� dubbo.scan.basePackages
   &��ϸ���Բ鿴���ͣ�https://blog.csdn.net/nangeali/article/details/82527039