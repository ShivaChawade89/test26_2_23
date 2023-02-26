package com.shiva.mapping.controller;

import com.shiva.mapping.model.Laptop;
import com.shiva.mapping.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("laptop")

public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @PostMapping
    public Laptop addLaptop(@RequestBody LaptopDto laptop) throws RecordNotFound {
        Laptop laptop =  laptopService.addLaptop(laptop);
        return laptop;
    }

    @GetMapping("/{laptopId}")
    public Laptop getLaptop(@PathVariable String laptopId) throws RecordNotFound {
        Laptop laptop  = laptopService.findByLaptop(laptopId);
        return laptop;
    }


    @GetMapping
    public List<Laptop> getAllLaptop(){
        List<Laptop> allLaptop = laptopService.findAllLaptop();
        return allLaptop;
    }
}
