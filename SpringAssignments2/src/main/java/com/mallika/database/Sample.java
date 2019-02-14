package com.mallika.database;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class Sample {
	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplate;
	   
	   public void setDataSource(DataSource dataSource) 
	   {
	      this.dataSource = dataSource;
	      this.jdbcTemplate = new JdbcTemplate(dataSource);
	   }
public void createTable(){
	
	jdbcTemplate.execute("create table employeeparthi(empId number(10))");
}
public void insertRow(){
	jdbcTemplate.update("insert into employeemallika values(101)");
	
}
}
