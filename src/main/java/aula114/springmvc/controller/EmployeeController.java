package aula114.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import aula114.springmvc.service.EmployeeService;
import aula114.springmvc.domain.Contact;

import java.util.List;
import java.util.ArrayList;

@Controller
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;
  String _nombre="";


  @RequestMapping("/employee")
  public String consultaEmployee(Model model) {
     List<Contact> list = new ArrayList<Contact>();
     //List<String> list = new ArrayList<String>();
     //list = employeeService.listIdEmployee();
     list = employeeService.listAllEmployee();
     model.addAttribute("list", list);
     System.out.println("tttttttttttt");
     System.out.println(list.get(0).getName());
     System.out.println("tttttttttttt");
     return "consulta";
  }

  @RequestMapping("/show/{nombre}")
	public String saludar(@PathVariable("nombre") String nombre, Model model) {
    List<Contact> empleado = new ArrayList<Contact>();
    _nombre=nombre;
    empleado = employeeService.listEmployee(nombre);
      System.out.println(empleado.get(0).getName());
     	model.addAttribute("empleado", empleado);
		return "saludar";
	}

  @RequestMapping("/cambiarNombre")
  public String cambiarNombre(@RequestParam("nombre") String nombre, Model model) {
    employeeService.setName(nombre, _nombre);
    model.addAttribute("_nombre", _nombre);
    model.addAttribute("nombre", nombre);
    return "confirmar";
  }

  @RequestMapping("/cambiarEmail")
  public String cambiarEmail(@RequestParam("email") String email, Model model) {
    employeeService.setEmail(email, _nombre);
    model.addAttribute("_nombre", _nombre);
    model.addAttribute("nombre", email);
    return "confirmar";
  }

  @RequestMapping("/cambiarDireccion")
  public String cambiarDireccion(@RequestParam("address") String address, Model model) {
    employeeService.setAddress(address, _nombre);
    model.addAttribute("_nombre", _nombre);
    model.addAttribute("nombre", address);
    return "confirmar";
  }

  @RequestMapping("/cambiarTelefono")
  public String cambiarTelefono(@RequestParam("telephone") String telephone, Model model) {
    employeeService.setTelephone(telephone, _nombre);
    model.addAttribute("_nombre", _nombre);
    model.addAttribute("nombre", telephone);
    return "confirmar";
  }

  @RequestMapping("/delete")
  public String delete(Model model) {
    employeeService.delete(_nombre);
    model.addAttribute("_nombre", _nombre);
    return "confirmar";
  }

  @RequestMapping("/insertar")
  public String insertar(Model model) {
    return "insertar";
  }

  @RequestMapping(value = "basicForm", method = RequestMethod.POST)
    public String basicForm(@RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("address") String address,
            @RequestParam("telephone") String telephone) {
  System.out.println(id);
  System.out.println(name);
  System.out.println(email);
  System.out.println(address);
  System.out.println(telephone);
  employeeService.insert(id, name, email, address, telephone);
  return "confirmar";
    
  }
}
