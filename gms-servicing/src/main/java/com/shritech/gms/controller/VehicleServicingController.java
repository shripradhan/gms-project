package com.shritech.gms.controller;

import com.shritech.gms.dto.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/servicing")
public class VehicleServicingController {

    public VehicleServicingController(){
        System.err.println("Controller Object Created");
    }

    @GetMapping("/vehicle")
    public ResponseEntity<String> getCustomerById(){
        CustomerDTO customer = new CustomerDTO(101l, "Shrikant Ashok Pradhan");
        return new ResponseEntity<>("Customer vehicle servicing successfully done.", HttpStatus.OK);
    }
}
