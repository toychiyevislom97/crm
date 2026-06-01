package com.example.crm;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
public class CustomerController {

    private List<Customer> list = new ArrayList<>();

    @GetMapping("/customers")
    public List<Customer> get() {
        return list;
    }

    @PostMapping("/customers")
    public void add(@RequestBody Customer c) {
        list.add(c);
    }
}