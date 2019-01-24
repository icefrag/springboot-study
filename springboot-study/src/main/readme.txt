1.@ConfigurationProperties 读取配置文件里面的属性到Bean.
2.@value可以直接读取application.property里面的配置
3.@propertySource导入.properties的配置文件到项目,通过@value去使用
4.@importResource导入xml中的配置到ioc


@EnableConfigurationProperties   autoconfig从application.properties中读取属性.



