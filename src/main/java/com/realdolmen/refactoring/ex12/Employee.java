package com.realdolmen.refactoring.ex12;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_id_generator")
    @SequenceGenerator(name="emp_id_generator", sequenceName = "employee_id")
    @Column(name = "ID")
    private int id;
    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "SALARY_LEVEL")
    private int salaryLevel;
    @Column(name = "LAST_PROMOTION_REASON")
    private String promotionReason;


    protected Employee() {
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(int salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public void setLastPromotionReason(String promotionReason) {
        this.promotionReason = promotionReason;
    }
}
