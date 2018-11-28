package cn.shine.ssmpro.service.impl;

import cn.shine.ssmpro.dao.UserInfoDao;
import cn.shine.ssmpro.entity.UserInfo;
import cn.shine.ssmpro.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc
 * @Author yuanshuai
 * @Company 深圳般若计算机系统股份有限公司
 * @Date 2018/11/21 15:49
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserInfoById(String uid) {
        return userInfoDao.getUserInfoById(uid);
    }
}
