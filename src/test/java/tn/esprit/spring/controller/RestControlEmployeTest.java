package tn.esprit.spring.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private static final Logger logger = LogManager.getLogger(RestControlEmployeTest.class);

    @Autowired
    private EmployeServiceImpl employeeService;

    @Test
    public void getNombreEmployeJPQL() {
        logger.info("starting NBr employees test");
       int result = employeeService.getNombreEmployeJPQL();
        assertNotEquals(-1, result);
    }

    @Test
    @Rollback(false)
    public void ajouterEmploye() {
        logger.info("starting adding employees test");
        int savedEmployeeId = employeeService.ajouterEmploye(new Employe("mehrez", "folen", "folen@folen.com", true, "INGENIEUR"));
        assertThat(savedEmployeeId).isGreaterThan(-1);
    }

    @Test
    public void getAllEmployes() {
        logger.info("starting getting all employees test");
        List<Employe> employees = employeeService.getAllEmployes();
        assertNotEquals(-1, employees.size());
        System.out.println(employees);
    }
}