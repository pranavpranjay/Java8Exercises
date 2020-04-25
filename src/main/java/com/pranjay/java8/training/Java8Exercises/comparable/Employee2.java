package com.pranjay.java8.training.Java8Exercises.comparable;

public class Employee2 implements Comparable<Employee2>{
	
	private String name;
	private Integer id;
	private int age;
	private double salary;
	
	public Employee2(String name, Integer id, int age, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee2 o) {
		if (this.name.compareTo(o.name)==0) {
			return o.id.compareTo(this.id);
		};
		return this.name.compareTo(o.name);
	}
	
}
