package com.oasis.mvc.service.impl;

import com.oasis.mvc.dao.pojo.Emp;
import com.oasis.mvc.service.iservice.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class EmpServiceImplTest {
@Autowired
    EmpService empService;
    @Test
    public void save() {

    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {

    }

    @Test
    public void findByPage() {
        List<Emp> emps = empService.findByPage(1,3);
        for (Emp emp : emps) {
            System.err.println(emp);
        }
    }

    @Test
    public void findByName() {
        for (Emp emp : empService.findByName("a")){
            System.err.println(emp);
        }
    }

    @Test
    public void findById() {
        System.err.println(empService.findById(1001));
    }
}