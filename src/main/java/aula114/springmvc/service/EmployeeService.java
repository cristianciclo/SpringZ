package aula114.springmvc.service;

import java.util.List;

import aula114.springmvc.domain.Contact;

public interface EmployeeService {

	public List<Contact> listAllEmployee();
	public List<Contact> listEmployee(String nombre);
	public List<Contact> setEmployee(String nombre, String ant);
	public void setName(String nombre, String ant);
	public void setEmail(String email, String ant);
	public void setAddress(String address, String ant);
	public void setTelephone(String telephone, String ant);
	public void delete(String nombre);
	public void insert(int id, String name, String email, String address, String telephone);
	//public List<String> listIdEmployee();
	//public Contact show(String id);
}
