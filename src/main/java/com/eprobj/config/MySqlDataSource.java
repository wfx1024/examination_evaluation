package com.eprobj.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by WFX1024 on 2019/6/11.
 */

@Configuration
@PropertySource(value= {"classpath:db.properties"})
public class MySqlDataSource {
    @Value("${mysql.jdbc.url}")
    private String jdbcUrl;
    @Value("${mysql.jdbc.driver}")
    private String jdbcDriverClassName;
    @Value("${mysql.jdbc.username}")
    private String jdbcUserName;
    @Value("${mysql.jdbc.password}")
    private String jdbcPassword;
    @Value("${dataSource.filters}")
    private String jdbcFilters;

    @Value("${dataSource.maxActive}")
    private int maxActive;
    @Value("${dataSource.initalSize}")
    private int initalSize;
    @Value("${dataSource.maxWait}")
    private int maxWait;
    @Value("${dataSource.poolPrepareStatements}")
    private boolean poolPrepareStatements;
    @Value("${dataSource.connectionProperties}")
    private String connectionProperties;
    @Value("${dataSource.minIdle}")
    private int minIdle;
    @Value("${dataSource.poolPrepareStatementPerConnectionSize}")
    private int poolPrepareStatementPerConnectionSize;
    @Value("${dataSource.timeBetweenEvictionRunsMills}")
    private int timeBetweenEvictionRunsMills;
    @Value("${dataSource.minEvictableIdleTimeMills}")
    private int minEvictableIdleTimeMills;
    @Value("${dataSource.breakAfterAcquireFailure}")
    private  boolean breakAfterAcquireFailure;
    @Value("${dataSource.asyncInit}")
    private boolean asyncInit;
    @Value("${dataSource.connectionErrorRetryAttempts}")
    private int connectionErrorRetryAttempts;
    @Value("${dataSource.validationQuery}")
    private String validationQuery;
    @Value("${dataSource.testWhileIdle}")
    private boolean testWhileIdle;
    @Value("${dataSource.testOnBorrow}")
    private boolean testOnBorrow;
    @Value("${dataSource.testOnReturn}")
    private boolean testOnReturn;



    @Bean(name = "dataSourceMysql",initMethod = "init")
    public DataSource dataSource() throws SQLException {

        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(jdbcUrl);
        datasource.setDriverClassName(jdbcDriverClassName);
        datasource.setUsername(jdbcUserName);
        datasource.setPassword(jdbcPassword);
        datasource.setKeepAlive(true);
        datasource.setMaxActive(maxActive);
        datasource.setInitialSize(initalSize);
        datasource.setMaxWait(maxWait);
        datasource.setPoolPreparedStatements(poolPrepareStatements);
        datasource.setConnectionProperties(connectionProperties);
        datasource.setMinIdle(minIdle);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(poolPrepareStatementPerConnectionSize);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMills);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMills);
        datasource.setBreakAfterAcquireFailure(breakAfterAcquireFailure);
        datasource.setAsyncInit(asyncInit);
        datasource.setOnFatalErrorMaxActive(connectionErrorRetryAttempts);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setFilters(jdbcFilters);
        return datasource;
    }

    //事务管理器
    @Bean(name = "mysqlTransactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager(@Qualifier("dataSourceMysql") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
