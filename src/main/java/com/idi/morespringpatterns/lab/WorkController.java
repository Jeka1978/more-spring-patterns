package com.idi.morespringpatterns.lab;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private WorkService workService;


    @GetMapping("/work")
    public void doWork(){
        workService.doWork();
        // just call to doWork method of our service
    }

    @GetMapping("/switchdb")
    public void switchDB(@RequestParam("db")String db,@RequestParam("flag")boolean flag){
        workService.setDbStatus(db,flag);
    }







}
