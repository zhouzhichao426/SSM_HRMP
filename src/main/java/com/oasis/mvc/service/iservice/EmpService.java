package com.oasis.mvc.service.iservice;

import com.oasis.mvc.dao.pojo.Emp;

import java.util.List;

public interface EmpService {
    String save(Emp emp);
    String update(Emp emp);
    String delete(Integer empno);
    List<Emp> findByPage(int page,int size);
    List<Emp> findByName(String ename);
    Emp findById(int empno);
}
