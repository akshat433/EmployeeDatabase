package com.em_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    //List<Employee> employees=new ArrayList<>();
    @Override
    public String createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);
       employeeRepository.save(employeeEntity);
        // employees.add(employee);
        return "Saved successfull";
    }
    @Override
    public List<Employee> readEmployees() {
        List<EmployeeEntity> employeesList = employeeRepository.findAll();
        List<Employee> employees=new ArrayList<>();
        for(EmployeeEntity employeeEntity:employeesList){
            Employee emp=new Employee();
                emp.setId(employeeEntity.getId());
                emp.setName(employeeEntity.getName());
                emp.setPhone(employeeEntity.getPhone());
                emp.setEmail(employeeEntity.getEmail());
                employees.add(emp);
        }
        return employees;
    }
    
    @Override
    public boolean deleteEmployee(Long id) {
       // employees.remove(id);
       EmployeeEntity emp=employeeRepository.findById(id).get();
     employeeRepository.delete(emp);
     return true;
    }
    @Override
    public String updateEmployee(Long id, Employee employee) {
        EmployeeEntity newEmployee=employeeRepository.findById(id).get();
        newEmployee.setEmail(employee.getEmail());
        newEmployee.setName(employee.getName());
        newEmployee.setPhone(employee.getPhone());
        employeeRepository.save(newEmployee);
        return "Updated Successfull";
    }

   
    
}
