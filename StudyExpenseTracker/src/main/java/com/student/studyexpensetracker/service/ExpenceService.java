package com.student.studyexpensetracker.service;

import com.student.studyexpensetracker.model.Expense;
import com.student.studyexpensetracker.util.ExpenseStorage;
import java.util.ArrayList;
public class ExpenceService {
    private ArrayList<Expense> expenses;
    public ExpenceService(){
        expenses = new ArrayList<>();
                expenses.addAll(ExpenseStorage.loadExpense());
    }
    public void addExpense(Expense expense) {
        expenses.add(expense);
        ExpenseStorage.saveExpenses(expenses);
        System.out.println("Expense added successfully!");
    }
    public void displayExpenses(){
        if(expenses.isEmpty()){
            System.out.println("No expenses recorded.");
            return;
        }
        
        for(Expense expense: expenses){
            System.out.println("--------------------");
            System.out.println("Description: "+ expense.getDescription());
            System.out.println("category"+ expense.getCategory());
            System.out.println("Amount: Ksh"+ expense.getAmount());
            System.out.println("Date: " + expense.getDate());
            System.out.println("-----------");
        }
        
    }
    public void deleteExpense(int index){
        
        if (index < 0 || index >= expenses.size()) {
            System.out.println("Invalid expense number.");
            return;
        }

        expenses.remove(index);
        ExpenseStorage.saveExpenses(expenses);

        System.out.println("Expense deleted successfully!");
    
    }
    
    public double getTotalExpenses(){
        double total=0;
        for(Expense expense: expenses){
            total+=expense.getAmount();
        }
        return total;
    }
}
