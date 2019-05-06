package com.supermarketbilling.models;

import java.math.BigDecimal;
import java.util.List;

public class Invoice {

    private List<IndividualItemInvoice> itemInvoices;
    private String customerName;
    private BigDecimal totalAmount;
    private BigDecimal discountAmount;

    public Invoice(List<IndividualItemInvoice> itemInvoices, String customerName) {
        this.itemInvoices = itemInvoices;
        this.customerName = customerName;
        this.totalAmount=BigDecimal.valueOf(itemInvoices.stream().mapToDouble(i->i.getTotalAmount().doubleValue()).sum());
    }

    public List<IndividualItemInvoice> getItemInvoices() {
        return itemInvoices;
    }

    public void setItemInvoices(List<IndividualItemInvoice> itemInvoices) {
        this.itemInvoices = itemInvoices;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }
}
