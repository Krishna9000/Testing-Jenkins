package com.krishnamraju.sampleproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {

    @GetMapping("/test")
    public String testCall(){
        return "Success";
    }

    @GetMapping("/jenkins")
    public String testJenkins(){
        return "Jenkins";
    }
}
