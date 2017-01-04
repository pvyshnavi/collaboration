package com.collab.portal.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.collab.portal.model.BlogComment;
import com.collab.portal.model.BlogPost;
import com.collab.portal.model.Event;
import com.collab.portal.model.Friend;
import com.collab.portal.model.Job;
import com.collab.portal.model.UploadFile;
import com.collab.portal.model.User;

@Configuration
@EnableTransactionManagement
public class DBConfig {
	
	@Bean
	public SessionFactory sessionFactory() 
	{
		LocalSessionFactoryBuilder lsf=new LocalSessionFactoryBuilder(getDataSource());
		Properties hibernateProperties=new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		lsf.addProperties(hibernateProperties);
		Class classes[]={User.class,Job.class,Friend.class,UploadFile.class,BlogPost.class,BlogComment.class,Event.class};
		return lsf.addAnnotatedClasses(classes).buildSessionFactory();
	}
	
	@Bean
	public DataSource getDataSource() 
	{
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
	    dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	    dataSource.setUsername("collabdb");
	    dataSource.setPassword("1234");
	    return dataSource;
	}
	
	@Bean
	public HibernateTransactionManager hibTransManagement()
	{
		return new HibernateTransactionManager(sessionFactory());
	}

}
