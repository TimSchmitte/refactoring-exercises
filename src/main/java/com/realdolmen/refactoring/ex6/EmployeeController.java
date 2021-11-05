package com.realdolmen.refactoring.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.util.List;

@RequestMapping("/employees")
@RestController
public class EmployeeController {
    @Autowired
    private EntityManager entityManager;

    @PostMapping
    @ResponseBody()
    @Transactional
    public int hire(Employee employee) {

        long count = entityManager.createQuery("select count(e) from Employee e", Long.class).getSingleResult();
        if(count > 10){
            throw new TooManyEmployeesException();
        }
        List<Employee> resultList = entityManager.createQuery("select e from Employee e where e.fullName  =  " + employee.getFullName(), Employee.class)
            .getResultList();

        if (!resultList.isEmpty()) {
            throw new IllegalStateException("Employee with same name already exists");
        }

        entityManager.persist(employee);

        return employee.getId();
    }

    @PostMapping("{id}/promote")
    public void promote(@RequestParam("id") int employeeId, @RequestBody Promotion promotion) {
        Employee employee = entityManager.createQuery("select e from Employee where e.id = " + employeeId, Employee.class).getSingleResult();
        if(employee.getSalaryLevel() <= promotion.getSalaryLevel()){
            throw new IllegalStateException("The new salary level should be higher than the old one," +
                " old salary level was " + employee.getSalaryLevel() + ", new Salary level is " + promotion);
        }

        employee.setSalaryLevel(promotion.getSalaryLevel());
        employee.setLastPromotionReason(promotion.getReason());
        entityManager.merge(employee);

    }
}
