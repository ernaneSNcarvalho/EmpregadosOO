package entities;

import java.util.ArrayList;
import java.util.List;

public class Departament {
	private String name;
	private Integer payDay;
	private Address adress;
	private List<Employee> employees = new ArrayList<>();
	
	public Departament() {
	}

	public Departament(String name, Integer payDay, Address adress) {
		this.name = name;
		this.payDay = payDay;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public List<Employee> getEmployee() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public double payRoll() {
		double sum = 0.0;
		for(Employee emp : employees) {
			sum += emp.getSalary();
		}
		
		return sum;
	}
}
