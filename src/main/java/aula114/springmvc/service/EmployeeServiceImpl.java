package aula114.springmvc.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;


import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aula114.springmvc.domain.Contact;

@Service
public class EmployeeServiceImpl implements EmployeeService {
        @Autowired
        private JdbcTemplate jdbcTemplate;
        //private Jedis conn;
        //public EmployeeServiceImpl() {
          //conn = new Jedis("localhost");
          //conn.select(12);
        //}

	@Override
	public List<Contact> listAllEmployee() {
           List<Contact> laList = new ArrayList<Contact>();
           String sql0 = "select name,telephone,address from contact";
           laList = jdbcTemplate.query(sql0, new BeanPropertyRowMapper<Contact>(Contact.class));
          /*
           List<String> list1 = new ArrayList<String>();
           Set<String> list = conn.smembers("nombreUsuarios");
           for(String st : list) { 
             list1.add(st);
           }
           return list1;
          */
        //  return null;
           return laList;
	}

  @Override
  public List<Contact> listEmployee(String nombre) {
           List<Contact> empleado = new ArrayList<Contact>();
           String sql1 = "select name,email,telephone,address from contact where name='"+nombre+"'";
           empleado = jdbcTemplate.query(sql1, new BeanPropertyRowMapper<Contact>(Contact.class));
           return empleado;
  }

  @Override
  public List<Contact> setEmployee(String nombre, String ant) {
           List<Contact> empleado = new ArrayList<Contact>();
           String sql1 = "update contact set name='"+nombre+"' where name='"+ant+"'";
           empleado = jdbcTemplate.query(sql1, new BeanPropertyRowMapper<Contact>(Contact.class));
           return empleado;
  }

  @Override
  public void setName(String nombre, String ant) {
        this.jdbcTemplate.update("update contact set name='"+nombre+"' where name='"+ant+"'");
    }

  @Override
  public void setEmail(String email, String ant) {
        this.jdbcTemplate.update("update contact set email='"+email+"' where name='"+ant+"'");
    }

    @Override
  public void setAddress(String address, String ant) {
        this.jdbcTemplate.update("update contact set address='"+address+"' where name='"+ant+"'");
    }


    @Override
  public void setTelephone(String telephone, String ant) {
        this.jdbcTemplate.update("update contact set telephone='"+telephone+"' where name='"+ant+"'");
    }

    @Override
  public void delete(String name) {
        this.jdbcTemplate.update("delete from contact where name='"+name+"'");
    }

    @Override
  public void insert(int id, String name, String email, String address, String telephone) {
        this.jdbcTemplate.update("insert into contact (contact_id, name, email, address, telephone) values ('"+id+"','"+name+"','"+email+"','"+address+"','"+telephone+"')");
    }

}
