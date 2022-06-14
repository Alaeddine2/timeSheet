package tn.esprit.spring.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.services.EmployeServiceImpl;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RestControlEmployeTest {
    @Autowired
    private EmployeServiceImpl employeeService;

    @Test
    public void getNombreEmployeJPQL() {
       int result = employeeService.getNombreEmployeJPQL();
        assertEquals(0, result);
    }

    @Test
    public void ajouterEmploye() {
    }

    @Test
    public void getEmployePrenomById() {
    }

    @Test
    public void getAllEmployeNamesJPQL() {
    }

    @Test
    public void getAllEmployes() {
    }
}