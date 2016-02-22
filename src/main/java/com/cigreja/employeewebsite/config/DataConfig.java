
package com.cigreja.employeewebsite.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 * DataConfig
 * @author Carlos Igreja
 * @since  Feb 21, 2016
 */
@Configuration
//@EnableJpaRepositories("com.cigreja.employeewebsite.data")
public class DataConfig {

    @Bean
    public DataSource datasource(){
        
        String driverClassName = "com.mysql.jdbc.Driver";
        String username = "root";
        String password = "";
        String host = "localhost";
        String port = "3306";
        String database = "hibernateDB";
        String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
        
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(driverClassName);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        
        return ds;
    }
    
//    @Bean
//    public LocalSessionFactoryBean sessionFactory(DataSource dataSource){
//        
//        String[] packagesToScan = {"com.cigreja.employeewebsite.business",
//                                   "com.cigreja.employeewebsite.data"};  
//        
//        String hibernateDialect = "org.hibernate.dialect.MySQL5Dialect";
//        
//        Properties hibernateProperties = new Properties();
//        hibernateProperties.setProperty("dialect", hibernateDialect);
//        
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setPackagesToScan(packagesToScan);
//        sessionFactory.setHibernateProperties(hibernateProperties);
//
//        return sessionFactory;
//    }
    
//    @Bean
//    // exception handling
//    public BeanPostProcessor persistenceTranslation(){
//        return new PersistenceExceptionTranslationPostProcessor();
//    }
    
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter(){
//        
//        Database database = Database.MYSQL;
//        String databasePlatform = "org.hibernate.dialect.MySQL5Dialect";
//        
//        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//        adapter.setDatabase(database);
//        adapter.setDatabasePlatform(databasePlatform);
//        adapter.setShowSql(true);
//        adapter.setGenerateDdl(false);
//        return adapter;
//    }
    
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//    DataSource dataSource, JpaVendorAdapter jpaVendorAdapter){
//        
//        String[] packagesToScan = {"com.cigreja.employeewebsite.business",
//                                   "com.cigreja.employeewebsite.data"}; 
//        
//        LocalContainerEntityManagerFactoryBean entityManagerFactory;
//        entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactory.setDataSource(dataSource);
//        entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter);
//        entityManagerFactory.setPackagesToScan(packagesToScan);
//        return entityManagerFactory;
//    }
}
