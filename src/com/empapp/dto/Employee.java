package com.empapp.dto;

public class Employee {
	private Integer id;
	private String name;
	private String job;
	private double salary;
	private Integer dno;
	private String mail;
	private String passward;
	private String createAt;
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {  
	   this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getDno() {
		return dno;
	}
	  public void setDno(Integer dno) {       
	        this.dno = dno;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
		
	
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", salary=" + salary + ", dno=" + dno
				+ ", mail=" + mail + ", passward=" + passward + ", createAt=" + createAt + "]";
	}
	}
