mybatis �õ������ģʽ

���ģʽ��
����        SqlSessionFactory��ObjectFactory��MapperProxyFactory
������      XMLConfigBuilder��XMLMapperBuilder��XMLStatementBuidler
����ģʽ    SqlSessionFactory��Configuration��ErrorContext
����ģʽ    �󶨣�MapperProxy 
            �ӳټ��أ�ProxyFactory��CGLIB��JAVASSIT�� 
            �����Plugin 
			Spring����MyBaits��SqlSessionTemplate ���ڲ���SqlSessionInterceptor 
		    MyBatis�Դ����ӳأ�PooledDataSource �����PooledConnection
            ��־��ӡ��ConnectionLogger��StatementLogger
������ģʽ  logging ģ�飬����Log4j��JDK logging ��Щû��ֱ��ʵ��slf4j �ӿڵ���־�������Ҫ������
ģ�巽��    BaseExecutor ������SimpleExecutor��BatchExecutor��ReuseExecutor
װ����ģʽ  LoggingCache��LruCache �ȶ�PerpetualCache��װ�� CachingExecutor ������Executor ��װ��
������ģʽ  InterceptorChain