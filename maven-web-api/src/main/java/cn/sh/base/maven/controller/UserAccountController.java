package cn.sh.base.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sh.base.maven.entity.UserAccount;
import cn.sh.base.maven.service.UserAccountService;

@Controller
public class UserAccountController {
	@Autowired
	private UserAccountService userAccountService;

	@RequestMapping(value = "/testPage")
	public String testPage() {
		System.out.println("哈哈哈哈");
		return "index";
	}

	@RequestMapping(value = "/validateAccount")
	@ResponseBody
	public boolean validateAccount() {

		UserAccount condition = new UserAccount();
		condition.setUsername("AAAA");
		condition.setPassword("BBBB");
		UserAccount userAccount = userAccountService.login(condition);
		if (userAccount != null) {
			return true;
		} else {
			return false;
		}
	}

}
