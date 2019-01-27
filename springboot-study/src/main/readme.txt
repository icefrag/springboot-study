1.@ConfigurationProperties 读取配置文件里面的属性到Bean.
2.@value可以直接读取application.property里面的配置
3.@propertySource导入.properties的配置文件到项目,通过@value去使用
4.@importResource导入xml中的配置到ioc


@EnableConfigurationProperties   autoconfig从application.properties中读取属性.



springboot autoconfig原理
核心使用 spring-boot-autoconfigure jar
1.@SpringBootApplication中注解@EnableAutoConfiguration
2.@EnableAutoConfiguration中导入@Import(AutoConfigurationImportSelector.class)
3.
AutoConfigurationImportSelector 类中的getCandidateConfigurations方法读取META-INF/spring.factories
	protected List<String> getCandidateConfigurations(AnnotationMetadata metadata,
			AnnotationAttributes attributes) {
		List<String> configurations = SpringFactoriesLoader.loadFactoryNames(
				getSpringFactoriesLoaderFactoryClass(), getBeanClassLoader());
		Assert.notEmpty(configurations,
				"No auto configuration classes found in META-INF/spring.factories. If you "
						+ "are using a custom packaging, make sure that file is correct.");
		return configurations;
	}
4.
    META-INF/spring.factories中使用org.springframework.boot.autoconfigure.EnableAutoConfiguration导入自动配置类.
	# Auto Configure
    org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
