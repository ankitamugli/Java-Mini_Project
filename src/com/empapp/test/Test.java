package com.empapp.test;
//passward are ankita=1234,abhishek=9686,3=1234,arpita=1234

import java.util.List;
import java.util.Scanner;

import com.empapp.dao.EmployeeDAO;
import com.empapp.dao.impl.EmployeeDaoimpl;
import com.empapp.dto.Employee;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   
      //  Employee e = new Employee();
        EmployeeDAO edao = new EmployeeDaoimpl();

//        
//    
//        System.out.println("Enter the emp name:");
//        e.setName(sc.next());
//        
//        System.out.println("Enter the Salary:");
//        e.setSalary(sc.nextDouble());
//        
//        
//        System.out.println("Enter the job:");
//        e.setJob(sc.next());
//
//        System.out.println("Enter the Dept Number:");
//        e.setDno(sc.nextInt());
//
//        System.out.println("Enter the Mail Id:");
//        e.setMail(sc.next());
//
//        System.out.println("Enter the Passward:");
//        e.setPassward(sc.next());   
//
//        edao.addEmployee(e);
//        System.out.println("Data added successfully!");

     
        
//        sc.close();
//        System.out.println("enter employee id:");
//        e=edao.findBYId(sc.nextInt());
//        System.out.println(e);
//        
//          System.out.println("enter employee mail and passward:");
//          e=edao.findByMailPassward(sc.nextLine(),sc.nextLine());
//          System.out.println(e);
//
//        
//        List<Employee> empList=edao.findAll();
//        for(Employee e1:empList) {
//        	System.out.println(e1);
//        }
//        
//        System.out.println("Enter employee id to delete:");
//        int id = sc.nextInt();
//        edao.deleteEmployee(id);
        
        System.out.println("enter the emp id:");
        Integer id=sc.nextInt();
        Employee e=edao.findBYId(id);
        System.out.println("before update");
        System.out.println(e);
        
        System.out.println("1.name");
        System.out.println("2.job");
        System.out.println("3.salary");
        System.out.println("4.dno");
        System.out.println("5.mail");
        System.out.println("6.passward");
        
        
        Integer choice=sc.nextInt();
        switch(choice){
     
        case 1:System.out.println("1.name");
        e.setName(sc.next());
        break;
        
        case 2:System.out.println("2.job");
        e.setJob(sc.next());
        break;
        
        case 3:System.out.println("3.salary");
        e.setSalary(sc.nextDouble());
        break;
        
        case 4:System.out.println("4.dno");
        e.setDno(sc.nextInt());
        break;
        
        case 5:System.out.println("5.mail");
        e.setMail(sc.next());
        break;
        
        case 6:System.out.println("6.passward");
        e.setPassward(sc.next());
        break;
        
        default:
            System.out.println("invalid choice");
            return;
        }
        
        edao.updateEmployee(e);
        System.out.println("Updated successfully!");
        System.out.println(e);       
 

        }
        
      

    }
