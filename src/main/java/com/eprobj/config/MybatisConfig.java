package com.eprobj.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Created by WFX1024 on 2019/6/11.
 */
@Configuration
@MapperScan(basePackages = {"com.eprobj.dao"}, sqlSessionFactoryRef = "sqlSessionFactory")
public class MybatisConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(MybatisConfig.class);

    public MybatisConfig() {
        LOGGER.info("ORM配置完成！");
    }

    @Autowired
    @Qualifier("dataSourceMysql")
    private DataSource dataSource;

    @Bean("sqlSessionFactory")
    public SqlSessionFactory mySqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        factoryBean.setDataSource(dataSource);
        return factoryBean.getObject();
    }
    @Bean
    public SqlSessionTemplate sqlSessionTemplateMysql() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(mySqlSessionFactory()); // 使用上面配置的Factory
        return template;
    }
}