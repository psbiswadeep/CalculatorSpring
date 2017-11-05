package com.example.calculator;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    @GetMapping("/add")
    public int add(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        Calculator calculator = new Calculator();
        System.out.println("Instance id" + calculator);
        return calculator.add(a, b);
    }

    @GetMapping("/sub")
    public int sub(@RequestParam(name="a")int a,@RequestParam(name="b") int b){
        Calculator calculator=new Calculator();
        System.out.println("Instance ID" + calculator);
        return calculator.sub(a,b);
    }
    @GetMapping("/mul")
    public int mul(@RequestParam(name="a")int a,@RequestParam(name="b") int b){
        Calculator calculator=new Calculator();
        System.out.println("Instance id"+calculator);
        return calculator.mul(a,b);
    }
    @GetMapping("/div")
    public int div(@RequestParam(name="a")int a, @RequestParam(name="b") int b){
        Calculator calculator=new Calculator();
        System.out.println("Instance ID"+calculator);
        return calculator.div(a,b);
    }
}