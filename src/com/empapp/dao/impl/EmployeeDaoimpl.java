	package com.empapp.dao.impl;
	
	import java.sql.Connection;
    import java.util.ArrayList;
    import java.util.List;
	
	import com.empapp.dao.EmployeeDAO;
	import com.empapp.dto.Employee;
	import com.empapp.utility.Connector;
	
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	
	public class EmployeeDaoimpl implements EmployeeDAO {
	
	    private Connection con;
		private List<Employee> eList;
	
	    public EmployeeDaoimpl() {
	        this.con = Connector.requestConnection();
	    }
	
	    @Override
	    public void addEmployee(Employee e) {
	    	        try {
	    	     String query = "insert into employee (name, sal, job, dno, mail, passward, created_at) values (?,?,?,?,?,?,now())";    	            
	            PreparedStatement ps = con.prepareStatement(query);
	
	            ps.setString(1, e.getName());
	            ps.setString(3, e.getJob());
	            ps.setDouble(2, e.getSalary());   
	            ps.setInt(4, e.getDno());        
	            ps.setString(5, e.getMail());
	            ps.setString(6, e.getPassward()); 
	            ps.executeUpdate();
	
	        } 
	        catch (SQLException e1) {
	            e1.printStackTrace();
	            System.out.println("failed to add the data");   
	        }
	         
	    }
	
		@Override
	    public Employee findBYId(Integer id) {
	    	String query="select * from employee where id=?";
	    	Employee e=null;
	    	try {
	        	PreparedStatement ps=con.prepareStatement(query);
	        	ps.setInt(1, id);
	        	ResultSet rs=ps.executeQuery();
	        	while(rs.next()) {
	        		e=new Employee();
	        		e.setId(rs.getInt("id"));
	        		e.setName(rs.getString("name"));
	        		e.setJob(rs.getString("job"));
	        		e.setSalary(rs.getDouble("sal"));
	        		e.setDno(rs.getInt("dno"));
	        		 e.setMail(rs.getString("mail"));
		                e.setPassward(rs.getString("passward"));
	        		
	        	}
	        		
	        	}
	        	catch (SQLException e1) {
	                e1.printStackTrace();
	                System.out.println("failed to fetch the data");   
	            }
	            
	    	return e;
	        }
	        
	    
	
	    @Override
	    public List<Employee> findAll() {
	        List<Employee> list = new ArrayList<>();
	        Employee e = null;
	        String query = "select * from employee";

	        try {
	            PreparedStatement ps = con.prepareStatement(query);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                e = new Employee();
	                e.setId(rs.getInt("id"));
	                e.setName(rs.getString("name"));
	                e.setJob(rs.getString("job"));
	                e.setSalary(rs.getDouble("sal"));
	                e.setDno(rs.getInt("dno"));
	                e.setMail(rs.getString("mail"));
	                e.setPassward(rs.getString("passward"));

	                list.add(e);   
	            }

	        } catch (SQLException e1) {
	            e1.printStackTrace();
	        }
	        return list;
    	}
	
	    @Override
	    public Employee findByMailPassward(String mail, String passward) {
	        Employee e = null;

	        try {
	            String sql = "SELECT * FROM employee WHERE mail=? AND passward=?";
	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, mail);
	            ps.setString(2, passward);

	            ResultSet rs = ps.executeQuery();

	            while  (rs.next()) {
	                e = new Employee();
	                e.setId(rs.getInt("id"));
	                e.setName(rs.getString("name"));
	                e.setJob(rs.getString("job"));
	                e.setSalary(rs.getDouble("sal"));
	                e.setDno(rs.getInt("dno"));
	                e.setMail(rs.getString("mail"));
	                e.setPassward(rs.getString("passward"));
	            }

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    	    return e;
	    	}
	
	    @Override
	    public void updateEmployee(Employee e) {

	    	    String query = "UPDATE employee SET name=?, job=?, sal=?, dno=?, mail=?, passward=? WHERE id=?";

	    	    try {
	    	        PreparedStatement ps = con.prepareStatement(query);

	    	        ps.setString(1, e.getName());
	    	        ps.setString(2, e.getJob());
	    	        ps.setDouble(3, e.getSalary());
	    	        ps.setInt(4, e.getDno());
	    	        ps.setString(5, e.getMail());
	    	        ps.setString(6, e.getPassward());
	    	        ps.setInt(7, e.getId());   

	    	        ps.executeUpdate();

	    	        System.out.println("Updated successfully");

	    	    } catch (Exception e1) {
	    	        e1.printStackTrace();
	    	    }
	    	}
	
	    public void deleteEmployee(Integer id) {
	    		try {
	                String query = "DELETE FROM employee WHERE id=?";
	                PreparedStatement ps = con.prepareStatement(query);
	                ps.setInt(1, id);

	                ps.executeUpdate();

	                System.out.println("Deleted successfully");

	            } catch (Exception e) {
	                e.printStackTrace();
	            }

	    		
	    }
	}