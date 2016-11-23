package com.niit.collaborationbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.niit.collaborationbackend.model.Blog;
import com.niit.collaborationbackend.model.Event;
//import com.niit.collaborationbackend.model.Friend;
import com.niit.collaborationbackend.model.UserDetails;

@EnableWebMvc
@ComponentScan("com.niit.collaborationbackend")
@Configuration
@EnableTransactionManagement
public class ApplicationContextConfig extends WebMvcConfigurerAdapter{
	
	@Bean(name = "datasource")
	public DataSource getOracleDatasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		datasource.setUsername("COLL_DB1");
		datasource.setPassword("abc");
	
	
		/*Properties connectionProperties = new Properties();
		
		connectionProperties.put("hibernate.show_sql", "true");
		connectionProperties.put("hibernate.format_sql", "true");
		connectionProperties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		connectionProperties.put("hibernate.hbm2ddl.auto", "update");
		System.out.println("ddddddddddddddddddddddddddddddddd");
		
		datasource.setConnectionProperties(connectionProperties);*/
		return datasource;
	}
	
	private Properties getHibernateProperties() {
		Properties properties = new Properties();

		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		System.out.println("working");
		properties.put("hibernate.hbm2ddl.auto", "update");
		System.out.println("working");
		return properties;

	}
	

	
	@Bean
	public SessionFactory getSessionFactory(DataSource datasource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(datasource);
		/*sessionBuilder.addProperties(getHibernateProperties());*/
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Blog.class);
		//sessionBuilder.addAnnotatedClass(BlogComment.class);
		//sessionBuilder.addAnnotatedClass(Chat.class);
		//sessionBuilder.addAnnotatedClass(Job.class);
		sessionBuilder.addAnnotatedClass(UserDetails.class);
		//sessionBuilder.addAnnotatedClass(Friend.class);
		sessionBuilder.addAnnotatedClass(Event.class);
		//sessionBuilder.addAnnotatedClass(Role.class);
		return sessionBuilder.buildSessionFactory();
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransctionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;

	}
}
