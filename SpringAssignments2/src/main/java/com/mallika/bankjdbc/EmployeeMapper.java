package com.mallika.bankjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<BankDemo> {

	 public BankDemo mapRow(ResultSet rs, int rowNum) throws SQLException {
		 BankDemo bankemp = new BankDemo();
		 bankemp.setEmpId(rs.getInt("empId"));
		 bankemp.setEmpName(rs.getString("empName"));
	     
	      return bankemp;
	   }
	

}
