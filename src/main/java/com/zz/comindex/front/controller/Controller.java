package com.zz.comindex.front.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * 路由实体类
 * @author Alan
 * @date 2019.6.1
 */
@RestController
public class Controller {

    @RequestMapping("/")
    public ModelAndView goIndex(){
        ModelAndView mv = new ModelAndView();
        System.out.print("index");
        mv.setViewName("front/index");
        return mv;
    }

}
