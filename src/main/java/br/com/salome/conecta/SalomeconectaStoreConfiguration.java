package br.com.salome.conecta;

import io.jmix.core.JmixModules;
import io.jmix.core.Resources;
import io.jmix.data.impl.JmixEntityManagerFactoryBean;
import io.jmix.data.impl.JmixTransactionManager;
import io.jmix.data.persistence.DbmsSpecifics;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import jakarta.persistence.EntityManagerFactory;

import javax.sql.DataSource;

@Configuration
public class SalomeconectaStoreConfiguration {

    @Bean
    @ConfigurationProperties("salomeconecta.datasource")
    DataSourceProperties salomeconectaDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "salomeconecta.datasource.hikari")
    DataSource salomeconectaDataSource(@Qualifier("salomeconectaDataSourceProperties") DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().build();
    }

    @Bean
    LocalContainerEntityManagerFactoryBean salomeconectaEntityManagerFactory(
            @Qualifier("salomeconectaDataSource") DataSource dataSource,
            JpaVendorAdapter jpaVendorAdapter,
            DbmsSpecifics dbmsSpecifics,
            JmixModules jmixModules,
            Resources resources
    ) {
        return new JmixEntityManagerFactoryBean("salomeconecta", dataSource, jpaVendorAdapter, dbmsSpecifics, jmixModules, resources);
    }

    @Bean
    JpaTransactionManager salomeconectaTransactionManager(@Qualifier("salomeconectaEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JmixTransactionManager("salomeconecta", entityManagerFactory);
    }
}
