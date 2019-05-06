mybatis 用到的设计模式

设计模式类
工厂        SqlSessionFactory、ObjectFactory、MapperProxyFactory
建造者      XMLConfigBuilder、XMLMapperBuilder、XMLStatementBuidler
单例模式    SqlSessionFactory、Configuration、ErrorContext
代理模式    绑定：MapperProxy 
            延迟加载：ProxyFactory（CGLIB、JAVASSIT） 
            插件：Plugin 
			Spring集成MyBaits：SqlSessionTemplate 的内部类SqlSessionInterceptor 
		    MyBatis自带连接池：PooledDataSource 管理的PooledConnection
            日志打印：ConnectionLogger、StatementLogger
适配器模式  logging 模块，对于Log4j、JDK logging 这些没有直接实现slf4j 接口的日志组件，需要适配器
模板方法    BaseExecutor 与子类SimpleExecutor、BatchExecutor、ReuseExecutor
装饰器模式  LoggingCache、LruCache 等对PerpetualCache的装饰 CachingExecutor 对其他Executor 的装饰
责任链模式  InterceptorChain