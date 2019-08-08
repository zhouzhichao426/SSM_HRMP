package com.oasis.mvc.action;

import com.oasis.mvc.commons.Result;
import com.oasis.mvc.dao.pojo.User;
import com.oasis.mvc.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserAction {

    @Autowired
    UserService userService;
    @RequestMapping("userExist.do")
    @ResponseBody
    public String userExist(@RequestParam String username){
        String msg = userService.userExist(username);
        return msg;
    }
    @RequestMapping("userRegistry.do")
    @ResponseBody
    public String registry(String username,String pwd1,String pwd2 ){
        String msg = Result.ERROR;
        if (pwd1.equals(pwd2)){
            User user = new User(username,pwd1);
            msg = userService.registry(user);
        }
        return msg;
    }
    @RequestMapping("userLogin.do")
    @ResponseBody
    public String login(User user){
        User u = userService.login(user);
        return u!=null?Result.SUCCESS:Result.ERROR;
    }
}
