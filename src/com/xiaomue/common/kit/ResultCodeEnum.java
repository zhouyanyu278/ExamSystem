package com.xiaomue.common.kit;

public enum ResultCodeEnum
{
	// 全局
    FAIL_REGISTER("10000", "未注册"),    
    REGISTER_SUCCESS("10001", "注册成功"),
    REGISTER_ACCOUNT_REPEAT("10003", "账号已注册"),
    REGISTER_MOBILE_REPEAT("10004", "手机号码已注册"),
    
    LOG_FAIL("10000","密码错误"),
	LOG_SUCCESS("10001","登录成功"),
	NOUSER("10002","用户不存在"),
	
	LOGOUT_FAIL("10000","退出失败"),
	LOGOUT_SUCCESS("10001","退出成功"),
    
	USERADDSUCCESS("18001","用户添加成功"),
	USERADDFAIL("18002","用户添加失败"),
	
	USERINFOUPDATESUCCESS("19001","用户信息修改成功"),
	USERINFOUPDATEFAIL("19002","用户信息修改失败"),
	ADOPTACCOUNTSUCCESS("19003","审核账户批准成功"),
	ADOPTACCOUNTFAIL("19004","审核账户批准失败"),
	AUDITEDACCOUNTSUCCESS("19005","审核账户拒绝成功"),
	AUDITEDACCOUNTFAIL("19006","审核账户拒绝失败"),
	
	PARA_MISSING("20000", "内容不完整"),
    PARA_PATTERN_ERROR("20001", "数据格式错误"),
    
    ERROR("30000", "服务器故障"),
    NOACCESS("40000", "用户无权限"),
    
    OPERATE_SUCCESS("50000", "操作成功"),
    LOGIN_FAIL("50001","账号或密码错误"),
    NOLOGIN("50002","用户未登录"),
    WRONG_OLDPASS("50003","旧密码错误"),
    OPERATE_FAIL("50004", "操作失败"),
    
    UPDATE_SUCCESS("10001", "修改成功"),
    UPDATE_FAIL("10002", "修改失败"),
    
    SHOWINFO_SUCCESS("10001", "显示成功"),
    SHOWINFO_FAIL("10002", "显示失败"),
    
    DELETE_SUCCESS("10001","删除成功"),
    DELETE_FAIL("10002","删除失败"),
    
    SUBMIT_SUCCESS("10001", "提交成功"),
    SUBMIT_FAIL("10002", "提交失败"),
    
    GET_SUCCESS("10001", "获取成功"),
    GET_FAIL("10002","获取失败"),
    
    LOADING_SUCCESS("80001","页面加载成功"),
    LOADING_FAIL("80000","页面加载失败"),
    
    SAVE_SUCCESS("10001", "保存成功"),
    SAVE_FAIL("10002","保存失败");
	
    private String code;
    private String desc;

    ResultCodeEnum(String code, String desc)
    {
        this.code = code;
        this.desc = desc;
    }

    public String getCode()
    {
        return code;
    }

    public String getDesc()
    {
        return desc;
    }

}
