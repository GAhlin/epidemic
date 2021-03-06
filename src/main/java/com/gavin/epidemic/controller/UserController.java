package com.gavin.epidemic.controller;

import com.gavin.epidemic.beans.UserInfo;
import com.gavin.epidemic.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    public static Logger loggeer = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(UserInfo userInfo, Model model, HttpSession session) {
        loggeer.debug("login()方法 account=" + userInfo.getAccount() + ",password:" + userInfo.getPassword());
        //通过业务逻辑层的bean获取该账号对应的用户信息
        UserInfo user = this.userService.findByAccount(userInfo.getAccount());
        if (user == null) {
            //账号不正确
            model.addAttribute("msg", "账号不正确！");
            return "login";
        }
        if (user.getPassword().equals(userInfo.getPassword())) {
            //登录成功
            //将当前用户的信息保存到Session中
            session.setAttribute("loginedUser",user);
            return "redirect:/main.jsp";
        }
        //密码不正确
        model.addAttribute("msg", "密码不正确！");
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        //清理Session
        session.invalidate();
        return "redirect:/epidemic.jsp";
    }
}
