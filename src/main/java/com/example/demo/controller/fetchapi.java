package com.example.demo.controller;

import com.example.demo.dto.Newrequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class fetchapi {

    @GetMapping("/home")
    public ResponseEntity<String> home(){
        return ResponseEntity.status(200).body("good morning sourav");
    }

    @PostMapping("/fetchdata")
    public ResponseEntity<String> home1(@RequestParam String name, @RequestParam String dob){
        String msg="Hello Sourav Appka Gaad acha h" + name + "Todays date " + dob;
        return ResponseEntity.status(200).body(msg);
    }

    @PostMapping("/newrequest")
    public ResponseEntity<String> home2(@RequestBody Newrequest test){
        String msg = "My name " + test.getName1() + " and my friend name " + test.getName2();
        return ResponseEntity.status(200).body(msg);
    }
}
