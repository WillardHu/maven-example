package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.service.UserServiceI;

/**
 * @author Dong
 * @since 1.0.0
 */

@Controller
@RequestMapping("/")
public class BaseController {

    @Autowired
    UserServiceI userServiceI;

    @GetMapping("test1")
    @ResponseBody
    public String getHello(){
        return "Test Success";
    }

    @GetMapping("test2")
    @ResponseBody
    public String getUserList(){
        return userServiceI.getAllUser().toString();
    }
}
