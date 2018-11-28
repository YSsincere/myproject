package cn.shine.ssmpro.dao;

import cn.shine.ssmpro.entity.UserInfo;

/**
 * @Desc
 * @Author yuanshuai
 * @Company 深圳般若计算机系统股份有限公司
 * @Date 2018/11/21 15:28
 */
public interface UserInfoDao {

    UserInfo getUserInfoById(String uid);
}
