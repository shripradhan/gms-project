package com.shritech.gms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


public class Customer {

    private Long custId;

    private String custName;

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
