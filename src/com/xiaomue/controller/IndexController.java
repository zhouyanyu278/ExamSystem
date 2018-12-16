package com.xiaomue.controller;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import com.xiaomue.common.kit.BaseResponse;
import com.xiaomue.common.kit.ResultCodeEnum;

public class IndexController extends Controller {
	public void index()
	{
		JSONObject a = new JSONObject();
		a.put("date", "aaaa");
		BaseResponse bs =new BaseResponse();
		bs.setData(a);
		bs.setResult(ResultCodeEnum.ADOPTACCOUNTFAIL);
		renderJson(bs.toString());
	}
}
