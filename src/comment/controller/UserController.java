package comment.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import comment.service.UserService;

@Controller("userController")
public class UserController {
	@Resource
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void doStr() {
        userService.out();
        System.out.println("专注于分享优质编程教程。");
    }
}
