package com.oasis.mvc.action;

import com.oasis.mvc.commons.Result;
import com.oasis.mvc.commons.ResultJSON;
import com.oasis.mvc.dao.pojo.Emp;
import com.oasis.mvc.service.iservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmpAction {
    @Autowired
    EmpService empService;

    @RequestMapping(value = "emp", method = RequestMethod.POST)
    public @ResponseBody
    ResultJSON<Emp> save(Emp emp) {
        String msg = empService.save(emp);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResultJSON<Emp>(code, msg);
    }

    @RequestMapping(value = "emp/{empno}", method = RequestMethod.PUT)
    public @ResponseBody
    ResultJSON<Emp> update(Emp emp) {
        String msg = empService.update(emp);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResultJSON<Emp>(code, msg);
    }

    @RequestMapping(value = "delete/{empno}", method = RequestMethod.DELETE)
    public @ResponseBody
    ResultJSON<Emp> delete(@PathVariable("empno") Integer empno) {
        String msg = empService.delete(empno);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResultJSON<Emp>(code, msg);
    }

    @RequestMapping(value = "emps")
    public @ResponseBody
    ResultJSON<List<Emp>> findByPage(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "3") int size) {
        List<Emp> emps = empService.findByPage(page, size);
        if (emps != null && emps.size() > 0) {
            return new ResultJSON<List<Emp>>(200, Result.SUCCESS, emps);
        } else {
            return new ResultJSON<List<Emp>>(404, Result.ERROR);
        }
    }
    @RequestMapping("findByName/{ename}")
    public @ResponseBody
    ResultJSON<List<Emp>> findByName(@PathVariable("ename") String ename) {
        List<Emp> emps = empService.findByName(ename);
        if (emps != null && emps.size() > 0) {
            return new ResultJSON<List<Emp>>(200, Result.SUCCESS, emps);
        } else {
            return new ResultJSON<List<Emp>>(404, Result.ERROR);
        }
    }
    @RequestMapping("emps/{empno}")
    public @ResponseBody
    ResultJSON<Emp> findById(@PathVariable("empno") Integer empno) {
        Emp emp = empService.findById(empno);
        if (emp != null) {
            return new ResultJSON<Emp>(200, Result.SUCCESS, emp);
        } else {
            return new ResultJSON<Emp>(404, Result.ERROR);
        }
    }

}
