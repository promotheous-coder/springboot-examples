package com.luv4code.springdatajpa.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PostgresqlDatasourceConfiguration {

    @ConfigurationProperties("spring.datasource.postgres")
    @Bean
    public DataSourceProperties postgreSqlDatasourceProperties() {
        return new DataSourceProperties();
    }

//    @Primary
    @Bean
    public DataSource postgreSqlDatasource() {
        return postgreSqlDatasourceProperties().initializeDataSourceBuilder().build();
    }

}
