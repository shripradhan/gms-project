package com.shritech.gms.controller;

import com.shritech.gms.dto.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/custoers")
public class CustomerController {

    public CustomerController(){
        System.err.println("CustomerController Object Created");
    }

    @GetMapping("/get/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable("customerId") Long customerId){
        CustomerDTO customer = new CustomerDTO(101l, "Shrikant Ashok Pradhan");
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
