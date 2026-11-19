package com.student.studyexpensetracker.model;
import java.time.LocalDate;
public class Expense {
    private String description;
    private String category;
    private double amount;
    private LocalDate date;
    public Expense(String description, String category, double amount, LocalDate date){
        this.description=description;
        this.category=category;
        this.amount=amount;
        this.date=date;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
    
}
