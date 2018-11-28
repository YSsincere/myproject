package cn.shine.ssmpro.controller;

import cn.shine.ssmpro.entity.UserInfo;
import cn.shine.ssmpro.service.IUserInfoService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET,produces = {"application/json; charset=utf-8"})
    @ResponseBody
    public String getUserInfo(HttpServletRequest request, HttpServletResponse response){
        String uid = request.getParameter("uid");
        UserInfo userInfo = userInfoService.getUserInfoById(uid);
        Object userObj = JSONObject.toJSON(userInfo);
        System.out.println(userObj.toString());
        return userObj.toString();
    }
}
