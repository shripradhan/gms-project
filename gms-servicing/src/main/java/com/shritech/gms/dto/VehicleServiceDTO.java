package com.shritech.gms.dto;

import com.shritech.gms.dto.CustomerDTO;

public class VehicleServiceDTO {

    private Long servicingId;

    private CustomerDTO customerDTO;

    public VehicleServiceDTO(Long servicingId, CustomerDTO customerDTO) {
        this.servicingId = servicingId;
        this.customerDTO = customerDTO;
    }

    public Long getServicingId() {
        return servicingId;
    }

    public void setServicingId(Long servicingId) {
        this.servicingId = servicingId;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }
}
