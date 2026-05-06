	package com.empapp.test;
//	import java.util
	import java.util.List;
	import java.util.Scanner;

	import com.empapp.dao.EmployeeDAO;
	import com.empapp.dao.DeptDao;                  
	import com.empapp.dto.Dept;
    import com.empapp.dto.Employee;
    import com.empapp.dao.impl.DeptDaoimpl;
import com.empapp.dao.impl.EmployeeDaoimpl; 


	public class Test1 {
	
	    public static void main(String[] args) {
	
	        Scanner sc = new Scanner(System.in);
	
	        Dept d = new Dept();
	        DeptDao ddao = new DeptDaoimpl();
	
	        Employee e = null;
	        EmployeeDAO edao = new EmployeeDaoimpl();
	
	        System.out.println("Enter employee mail:");
	        String mail = sc.next();
	
	        System.out.println("Enter the password:");
	        String password = sc.next();
	
	        e = edao.findByMailPassward(mail, password);	        
	
	        if (e != null) {
	            System.out.println("Login successfully");
	
	            if (e.getId() == 5) {
	
	                System.out.println("1. Add employee\n2. View all\n3. Delete\n4. Add Dept\n5. Update Dept\n6. Delete Dept\n7. View Dept\n8. Exit");
	
	                int choice = sc.nextInt();
	
	                switch (choice) {
	
	                    case 1:
	                        Employee newEmp = new Employee();
	
	                        System.out.println("Enter id:");
	                        newEmp.setId(sc.nextInt());
	
	                        System.out.println("Enter name:");
	                        newEmp.setName(sc.next());
	
	                        System.out.println("Enter job:");
	                        newEmp.setJob(sc.next());
	
	                        System.out.println("Enter mail:");
	                        newEmp.setMail(sc.next());
	
	                        System.out.println("Enter dno:");
	                        newEmp.setDno(sc.nextInt());
	
	                        System.out.println("Enter salary:");
	                        newEmp.setSalary(sc.nextDouble());
	
	                        edao.addEmployee(newEmp);
	                        break;
	
	                    case 2:
	                        List<Employee> list = edao.findAll();
	                        for (Employee emp : list) {
	                            System.out.println(emp);
	                        }
	                        break;
	
	                    case 3:
	                        System.out.println("Enter id:");
	                        edao.deleteEmployee(sc.nextInt());
	                        break;
	
	                    case 4:
	                        System.out.println("Enter dept id:");
	                        d.setDno(sc.nextInt());
	
	                        System.out.println("Enter dept name:");
	                        d.setDname(sc.next());
	
	                        System.out.println("Enter location:");
	                        d.setLocation(sc.next());
	
	                        ddao.addDept(d);
	                        break;
	
	                    case 5:
	                        System.out.println("Enter dept id:");
	                        d = ddao.findById(sc.nextInt());
	
	                        System.out.println("1.Dno 2.Dname 3.Location");
	                        int dc = sc.nextInt();
	
	                        if (dc == 1) d.setDno(sc.nextInt());
	                        else if (dc == 2) d.setDname(sc.next());
	                        else if (dc == 3) d.setLocation(sc.next());
	
	                        ddao.updateDept(d);
	                        break;
	
	                    case 6:
	                        System.out.println("Enter dept id:");
	                        ddao.deleteDept(sc.nextInt());
	                        break;
	
	                    case 7:
	                        List<Dept> dlist = ddao.findAll();
	                        for (Dept dept : dlist) {
	                            System.out.println(dept);
	                        }
	                        break;
	
	                    case 8:
	                        System.out.println("Exit");
	                        break;
	                }
	
	            } else {
	
	                System.out.println("1.View\n2.Update\n3.Exit");
	
	                int ch = sc.nextInt();
	
	                switch (ch) {
	
	                    case 1:
	                        System.out.println("Enter id:");
	                        e = edao.findBYId(sc.nextInt());
	                        System.out.println(e);
	                        break;
	
	                    case 2:
	                        System.out.println("Enter id:");
	                        e = edao.findBYId(sc.nextInt());
	
	                        System.out.println("1.Name 2.Job 3.Salary");
	                        int uc = sc.nextInt();
	
	                        if (uc == 1) e.setName(sc.next());
	                        else if (uc == 2) e.setJob(sc.next());
	                        else if (uc == 3) e.setSalary(sc.nextDouble());
	
	                        edao.updateEmployee(e);
	                        break;
	
	                    case 3:
	                        System.out.println("Exit");
	                        break;
	                }
	            }
	
	        } 
	        else {
	            System.out.println("Login failed");
	        }
	
	        sc.close();
	    }
	}