package com.shritech.gms.dto;

public class CustomerDTO {

    private Long custId;

    private String custName;

    public CustomerDTO(Long custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
}
