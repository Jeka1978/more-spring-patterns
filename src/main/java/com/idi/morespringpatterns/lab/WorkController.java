package com.idi.morespringpatterns.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/idi")
public class WorkController {

    @GetMapping("/work")
    public void doWork(){
        // just call to doWork method of our service
    }

    @GetMapping("/switchdb")
    public void switchDB(@RequestParam("db")String db){
        // change to requested database
    }







}
