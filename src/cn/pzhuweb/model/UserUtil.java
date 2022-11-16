package cn.pzhuweb.model;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import cn.pzhuweb.proj.Message;
import cn.pzhuweb.proj.userInfo;

public class UserUtil {
//1,判断username是否合法
	public static Message check(userInfo userInfo){
		if (userInfo == null) {
			return new Message(false,"用户数据不合法！");
			
		}
		if (userInfo.getUsername().equals("")) {
			return new Message(false,"用户名不能为空！");
		}
		//补充age，hobby。

		if (userInfo.getHobby() == null) {
			return  new Message(false,"没有登记有效的爱好！");
		}
		return new Message(true,"数据合法");
	}
	//2，判断username是否被登记
//存在返回true，否则返回false
	public static boolean isSave(String username,ArrayList<userInfo> list){
		if(list!=null){
			for (userInfo s : list) {
				String name=s.getUsername();
				if(name.equals(username)){
					return true;
				}
			}
		}
		return false;
	}

	//3，将username放入登记表中
	public static ArrayList<userInfo> add(userInfo userInfo,ArrayList<userInfo> oldlist){
		ArrayList<userInfo> newlist = new ArrayList<userInfo>();
		if (oldlist != null) {
			newlist.addAll(oldlist);
		}
		newlist.add(userInfo);
		return newlist;
	}


}
