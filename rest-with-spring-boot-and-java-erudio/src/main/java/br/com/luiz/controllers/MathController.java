package br.com.luiz.controllers;

import br.com.luiz.exception.UnsupportedMathOperationException;
import br.com.luiz.services.MathService;
import br.com.luiz.util.NumericString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    MathService service;

    @RequestMapping("/sum/{a}/{b}")
    public Double sum(@PathVariable("a") String a,@PathVariable("b") String b){
        return service.sum(a, b);
    }

    @RequestMapping("/minus/{a}/{b}")
    public Double minus(@PathVariable("a") String a,@PathVariable("b") String b){
        return service.minus(a, b);
    }

    @RequestMapping("/multiply/{a}/{b}")
    public Double multiply(@PathVariable("a") String a,@PathVariable("b") String b){
        return service.multiply(a, b);
    }

    @RequestMapping("/divide/{a}/{b}")
    public Double divide(@PathVariable("a") String a,@PathVariable("b") String b){
        return service.divide(a, b);
    }

    @RequestMapping("/average/{a}/{b}")
    public Double average(@PathVariable("a") String a,@PathVariable("b") String b){
        return service.average(a, b);
    }
    @RequestMapping("/sqroot/{x}")
    public Double squareRoot(@PathVariable("x") String x){
        return service.sqroot(x);
    }


}
