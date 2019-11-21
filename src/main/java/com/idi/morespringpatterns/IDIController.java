package com.idi.morespringpatterns;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api")
public class IDIController {


//    public static void main(String[] args) throws Exception {
//        ObjectMapper mapper = new ObjectMapper();
//        Person person = new Person("Ariel", 36);
//        String json = mapper.writeValueAsString(person);
//        System.out.println("json = " + json);
//        Person person1 = mapper.readValue(json, Person.class);
//
//        System.out.println("person1 = " + person1);
//    }


    @PostMapping("/person")
    public Person person(@RequestBody Person person) {
        person.setAge(person.getAge()+1);
        person.setName(person.getName().toUpperCase());
        return person;
    }

    @GetMapping("/hello")
    public String greet(){
        return "Hello";
    }

     @GetMapping("/hello/{name}")
    public String greet2(@PathVariable("name") String name){
        return "Hello "+name.toUpperCase();
    }



    @GetMapping("/howlongwillilive")
    public int yearsToLive(@RequestParam("age") int age){
        return 120-age;
    }
























}
