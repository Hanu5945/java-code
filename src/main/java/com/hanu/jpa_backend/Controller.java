package com.hanu.jpa_backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://43.201.132.91:3000")
@RestController
public class Controller {

    @GetMapping("/api/test")
    public String test(){
        return "test";
    }

    @GetMapping("/api/test2")
    public String test2(){
        return "test2";
    }

}
