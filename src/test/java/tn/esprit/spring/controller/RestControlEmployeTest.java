package tn.esprit.spring.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.services.EmployeServiceImpl;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RestControlEmployeTest {
    @Autowired
    private EmployeServiceImpl employeeService;

    @Test
    public void getNombreEmployeJPQL() {
       int result = employeeService.getNombreEmployeJPQL();
        assertNotEquals(-1, result);
    }

    @Test
    @Rollback(false)
    public void ajouterEmploye() {
        int savedEmployeeId = employeeService.ajouterEmploye(new Employe("mehrez", "folen", "folen@folen.com", true, "INGENIEUR"));
        assertThat(savedEmployeeId).isGreaterThan(-1);
    }

    @Test
    public void getAllEmployes() {
        List<Employe> employees = employeeService.getAllEmployes();
        System.out.println(employees);
    }
}