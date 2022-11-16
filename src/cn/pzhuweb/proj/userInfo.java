package cn.pzhuweb.proj;

import java.util.Arrays;

public class userInfo {
private String username;
private Integer age;
private String[] hobby;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String[] getHobby() {
	return hobby;
}
public void setHobby(String[] hobby) {
	this.hobby = hobby;
}
public userInfo() {
	super();
	// TODO Auto-generated constructor stub
}
public userInfo(String username, Integer age, String[] hobby) {
	super();
	this.username = username;
	this.age = age;
	this.hobby = hobby;
}

	@Override
	public String toString() {
		return username;
	}



}
