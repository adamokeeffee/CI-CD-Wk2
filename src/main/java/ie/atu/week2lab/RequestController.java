package ie.atu.week2lab;

import org.springframework.web.bind.annotation.*;

import java.util.Map;


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

    @GetMapping("/person")
    public Person getPerson(){
        return new Person("Adam", 25);
    }

    @GetMapping("/calculate")
    public Object calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation){
        Calculator calculator = new Calculator();
        return Map.of("operation", operation, "total",calculator.calculate(num1, num2, operation));
    }

}
