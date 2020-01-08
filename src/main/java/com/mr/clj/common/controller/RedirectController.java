package com.mr.clj.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName RedirectController
 * @Description: TODO
 * @Author 9
 * @Date 2020/1/6
 * @Version V1.0
 **/
@Controller
public class RedirectController {

    @GetMapping(value = "/")
    public String toIndex(){

        return "index";
    }
}