package com.oasis.mvc.service.impl;

import com.github.pagehelper.PageHelper;
import com.oasis.mvc.commons.Result;
import com.oasis.mvc.dao.EmpDao;
import com.oasis.mvc.dao.pojo.Emp;
import com.oasis.mvc.service.iservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empService")
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpDao empDao;

    @Override
    public String save(Emp emp) {
        int result = empDao.insertSelective(emp);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String update(Emp emp) {
        int result = empDao.updateByPrimaryKeySelective(emp);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String delete(Integer empno) {
        int result = empDao.deleteByPrimaryKey(empno);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public List<Emp> findByPage(int page, int size) {
        PageHelper.startPage(page,size);
        return empDao.findAll();
    }

    @Override
    public List<Emp> findByName(String ename) {
        return empDao.findByName(ename);
    }

    @Override
    public Emp findById(int empno) {
        return empDao.selectByPrimaryKey(empno);
    }
}
