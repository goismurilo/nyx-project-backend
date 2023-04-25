package com.api.nyxprojectbackend.models;

import java.math.BigDecimal;

public class ResponseInfoModel {
    private Long numbers;
    private int code;
    private String name;

    private BigDecimal pledged;
    private BigDecimal paidOff;
    private BigDecimal paid;

    public ResponseInfoModel(Long numbers, Integer code, String name, BigDecimal pledged, BigDecimal paidOff, BigDecimal paid) {
        setNumbers(numbers);
        setCode(code);
        setName(name);
        setPledged(pledged);
        setPaidOff(paidOff);
        setPaid(paid);
    }

    public Long getNumbers() {
        return numbers;
    }

    public void setNumbers(Long numbers) {
        this.numbers = numbers;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPledged() {
        return pledged;
    }

    public void setPledged(BigDecimal pledged) {
        this.pledged = pledged;
    }

    public BigDecimal getPaidOff() {
        return paidOff;
    }

    public void setPaidOff(BigDecimal paidOff) {
        this.paidOff = paidOff;
    }

    public BigDecimal getPaid() {
        return paid;
    }

    public void setPaid(BigDecimal paid) {
        this.paid = paid;
    }
}
