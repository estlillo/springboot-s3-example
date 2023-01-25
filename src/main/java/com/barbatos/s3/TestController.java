package com.barbatos.s3;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/prueba2")
    public String test2(){
        return "prueba2";
    }

    @GetMapping("/feature")
    public String getFeatureName(){
        return "feature";
    }

    @GetMapping("/uuid")
    public String UUIDGenerator(){
        
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        System.out.println("Your UUID is: " + uuidAsString);

        return uuidAsString;
    }

}
