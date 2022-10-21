package com.example.ddg_vip.model;

import java.util.Date;

public class Receipt {
    private Integer receiptId;
    private Float totalPrice;
    private Date timeReceipt;
    private Integer registerId;

    public Receipt() {
    }

    public Receipt(Integer receiptId, Float totalPrice, Date timeReceipt, Integer registerId) {
        this.receiptId = receiptId;
        this.totalPrice = totalPrice;
        this.timeReceipt = timeReceipt;
        this.registerId = registerId;
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getTimeReceipt() {
        return timeReceipt;
    }

    public void setTimeReceipt(Date timeReceipt) {
        this.timeReceipt = timeReceipt;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }
}
/* CREATE TABLE `receipt` (
        `receiptId` int(11) NOT NULL,
        `totalPrice` float NOT NULL DEFAULT 0,
        `timeReceipt` datetime NOT NULL,
        `registerId` int(11) NOT NULL*/