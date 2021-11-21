package org.winker.winweb.winblog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/")
public class IndexController {



    @RequestMapping("pages/**")
    public String index2(HttpServletRequest res){
        System.out.println(res.getRequestURI());;
        return res.getRequestURI().replaceAll(".html","");
    }

    @RequestMapping("/")
    public String index(){


//        return "/pages/index";
        return "/pages/index";
    }

}
