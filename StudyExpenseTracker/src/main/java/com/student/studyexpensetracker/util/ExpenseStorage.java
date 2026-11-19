/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.student.studyexpensetracker.util;
import com.student.studyexpensetracker.model.Expense;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
public class ExpenseStorage {
    private static final String FILE_NAME ="expense.csv";
    public static void saveExpenses(List<Expense>expenses){
        try (PrintWriter writer = new PrintWriter(
                new FileWriter(FILE_NAME))) {

            writer.println("Description,Category,Amount,Date");
             for(Expense expense : expenses){
                 writer.println(expense.getDescription()+","+ expense.getCategory()+","+expense.getAmount()+","+expense.getDate());
             }   
             System.out.println("Expenses saved successfully!");
            }catch(IOException e){
                System.out.println("Errornsaving expenses:" + e.getMessage());
            }
    }
    public static List<Expense>loadExpense()
    {
    List<Expense> expenses=new ArrayList<>();
    try(BufferedReader reader=new BufferedReader(new FileReader(FILE_NAME))){
        String line;
        reader.readLine();
        while((line = reader.readLine()) !=null){
            String [] parts = line.split(",");
            if(parts.length==4 && !parts[3].isEmpty()&& !parts[3].equalsIgnoreCase("null")){
                String description=parts[0];
                String category=parts[1];
                double amount=Double.parseDouble(parts[2]);
                LocalDate date=LocalDate.parse(parts[3]);
                Expense expense=new Expense(description,category,amount,date);
                expenses.add(expense);
            }
        }
    }
    catch(IOException e){
        System.out.println("No previous expense records found.");
    }
    return expenses;
    }}

