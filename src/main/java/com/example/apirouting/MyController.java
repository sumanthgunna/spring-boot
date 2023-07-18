/*
 * You can use the following import statements
 */
package com.example.apirouting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apirouting.MyService;


// Write your code here.
@RestController
public class MyController{

    MyService service = new MyService();
    
    @GetMapping("/")
    public String HomePage(){
        return service.HomePage();
    }

    @GetMapping("/about")
    public String AboutPage(){
        return service.AboutPage();
    }
}