package com.hc.hcmall.controller;


import com.hc.hcmall.model.User;
import com.hc.hcmall.model.UserVo;
import com.hc.hcmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2021-07-26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping("/getuser")
    public User getUser(){
        return userService.getById(1);
    }

    @RequestMapping("adduser")
    public String addUser(@Validated UserVo uservo, BindingResult bresult){
        List<FieldError> fieldErrors = bresult.getFieldErrors();
        System.out.println(fieldErrors);

        if(!fieldErrors.isEmpty()){
            System.out.println(fieldErrors.get(0).getDefaultMessage());
            return fieldErrors.get(0).getDefaultMessage();
        }
        return "ok";
    }



}
