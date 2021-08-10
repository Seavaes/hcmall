package com.hc.hcmall.model;

import javax.validation.constraints.NotNull;

/**
 * @author hc
 * @Version UserVo 2021-08-09 21:42:05
 */
public class UserVo {
    @NotNull(message = "age不能为空")
    private Integer age;
    @NotNull(message = "name不能为空")
    private String username;
}
