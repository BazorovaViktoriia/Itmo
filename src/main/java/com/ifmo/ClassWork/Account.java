package com.ifmo.ClassWork;

public class Account {
    private long id;
    private double amount;
    private long userId;
    private boolean blocked;

    public Account(long userId) {
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public long getUserId() {
        return userId;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
