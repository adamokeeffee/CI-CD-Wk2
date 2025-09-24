package ie.atu.week2lab;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping

public class  RequestController {

    // Getmapping maps the hello URL
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    //Pathvariable pulls part of the URL into your method parameter
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello " + name + " !";
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age){
        return "Name: " + name + ", Age:" + age;
    }
}
