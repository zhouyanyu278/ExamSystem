package com.xiaomue.common.kit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class DatetablesKit
{

	/**
	 * 解析Json数据获取必要参数值
	 * 
	 * @param jsonStr
	 * @return
	 */
	public static Map<String, Object> parseJson(String jsonStr)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		JSONArray jsonArray = JSONArray.parseArray(jsonStr);
		JSONObject obj = null;
		int orderColunmValue = -1;
		for (int i = jsonArray.size() - 1; i >= 0; i--)
		{
			obj = (JSONObject) jsonArray.get(i);
			if (obj.get("name").equals("iDisplayStart"))
			{
				map.put("iDisplayStart", obj.getIntValue("value"));// 起始位置下标
			}
			else if (obj.get("name").equals("iDisplayLength"))
			{
				map.put("iDisplayLength", obj.getIntValue("value"));// 长度
			}
			else if (obj.get("name").equals("sEcho"))
			{
				map.put("sEcho", obj.getIntValue("value"));// 操作次数-原样返回即可
			}
			else if (obj.get("name").equals("iSortCol_0"))
			{
				orderColunmValue = (int)obj.getIntValue("value");
				map.put("iSortCol_0", orderColunmValue);// 后台需要排序的列，跟前端datatables显示的列相同，下标从0开始，可以设置默认排序列
			}
			else if (obj.get("name").equals("sSortDir_0"))
			{
				map.put("sSortDir_0", obj.getString("value"));// 需要排序的列的排序方式：desc、asc
			}
			else if (obj.get("name").equals("mDataProp_"+orderColunmValue))
			{
				map.put("sortColunm", obj.getString("value"));
			}
			else if (obj.get("name").equals("sSearch"))
			{
				map.put("sSearch", obj.getString("value"));
			}
			
		}
		return map;
	}

	/**
	 * 对应的datatables返回值
	 * 
	 * @param <T>
	 * 
	 * @param sEcho
	 * @param iTotalRecords
	 * @param iTotalDisplayRecords
	 * @param aaData
	 * @return
	 */
	public static <T> Map<String, Object> generateResultMap(int sEcho, int iTotalRecords, int iTotalDisplayRecords,
			List<T> aaData)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sEcho", sEcho);
		map.put("iTotalDisplayRecords", iTotalDisplayRecords);
		map.put("iTotalRecords", iTotalRecords);
		map.put("aaData", aaData);
		return map;
	}
}
