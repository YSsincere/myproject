package cn.shine.ssmpro.controller;

import cn.shine.ssmpro.entity.UserInfo;
import cn.shine.ssmpro.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Desc
 * @Author yuanshuai
 * @Company 深圳般若计算机系统股份有限公司
 * @Date 2018/11/20 18:53
 */
@Controller
@RequestMapping(value = "/user")
public class UserController{
    @Autowired
    private IUserInfoService userInfoService;
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public UserInfo getUserInfo(HttpServletRequest request, HttpServletResponse response){
        String uid = request.getParameter("uid");
        UserInfo userInfo = userInfoService.getUserInfoById(uid);
        return userInfo;
    }
}
