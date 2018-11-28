package cn.shine.ssmpro.entity;

/**
 * @Desc
 * @Author yuanshuai
 * @Company 深圳般若计算机系统股份有限公司
 * @Date 2018/11/21 14:56
 */
public class UserInfo {
    private String uid;
    private String loginName;
    private String loginPwdmd5;
    private String realName;
    private String idCard;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwdmd5() {
        return loginPwdmd5;
    }

    public void setLoginPwdmd5(String loginPwdmd5) {
        this.loginPwdmd5 = loginPwdmd5;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
