package com.supermarketbilling.models;

import java.math.BigDecimal;

public class IndividualItemInvoice {
    private Item item;
    private BigDecimal quantity;
    private BigDecimal totalAmount;
    private BigDecimal discountAmount;

    public IndividualItemInvoice(Item item, BigDecimal quantity) {
        this.item = item;
        this.quantity = quantity;
        this.totalAmount=item.getPrice().multiply(quantity);
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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
