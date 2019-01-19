package com.mallika.bankjdbc;

import java.util.List;



import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAO {

	//private DataSource dataSource;
	   private JdbcTemplate jdbcTemplate;
	   // BankDemo bankDemo;
	   
	   public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
	
	
	/*public void setDataSource(DataSource dataSource) 
	   {
	      this.dataSource = dataSource;
	      this.jdbcTemplate = new JdbcTemplate(dataSource);
	   }*/
	
public void createTable(){
	
	jdbcTemplate.execute("create table employeeps(empId number(10),empName varchar2(10))");
}

public String insertRow(int empId,String empName){
	jdbcTemplate.update("insert into employeeps values("+empId+","+"'"+empName+"')");
	return empName;
	
}
public List <BankDemo> fetchRecords(){
	String selectQuery = "select * from employeeps";
	List <BankDemo> employees = jdbcTemplate.query(selectQuery, new EmployeeMapper());
	return employees;
}
}
