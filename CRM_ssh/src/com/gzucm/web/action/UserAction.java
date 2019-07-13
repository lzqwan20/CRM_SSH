package com.gzucm.web.action;

import com.gzucm.domain.User;
import com.gzucm.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User();
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	public String login(){
		User existUser = userService.login(user);
		if(existUser == null){
			//登录失败
			this.addActionError("用户名或者密码错误");
			return ERROR;
		}else {
			ActionContext.getContext().put("existUser", existUser);
			//3 重定向到项目首页
			return "toHome";
		}
		
	}
	public String regist(){
		System.out.println(user.toString());
		return null;
		
	}

}
