package com.student.studyexpensetracker;
import com.student.studyexpensetracker.model.Expense;
import com.student.studyexpensetracker.service.StudyService;
import com.student.studyexpensetracker.service.ExpenceService;
import com.student.studyexpensetracker.model.StudySession;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class StudyExpenseTracker{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        StudyService studyService = new StudyService();
        
        ExpenceService expenseService=new ExpenceService();
        int choice;
        do{
            System.out.println("\n=============");
            System.out.println("    STUDY LOG&EXPENCE TRACKER");
            System.out.println("===============");
            System.out.println("1. Record Study session");
            System.out.println("2. View Study Sessions");
            System.out.println("3. View Total Study Hours");
            System.out.println("4. Record expense");
            System.out.println("5. View Expenses");
            System.out.println("6. View Total Expense");
            System.out.println("7: View overall Expense");
            System.out.println("8: Exit");
            System.out.println("9. Delete Study Session number to delete:");
            System.out.println("10: Delete Expense");
            System.out.println("11: Search Study Sessions ");
            System.out.println("============");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    input.nextLine();
                    System.out.println("Enter subject: ");
                    String subject=input.nextLine();
                    
                    System.out.println("Enter topic: ");
                    String topic=input.nextLine();
                     System.out.println("Enter study Hours: ");
                     double hours;
                     do{
                         System.out.println("Enter study hours(>0)");
                         hours =input.nextDouble();
                         if(hours<=0){
                             System.out.println("Invalid hours.Please enter a positive number.");
                         }
                     }while(hours<=0);
                     System.out.println("Enter date(YYYY-MM-DD): ");
                     String dateInput=input.next();
                     java.time.LocalDate date= java.time.LocalDate.parse(dateInput);
                    StudySession session=new StudySession(subject,topic,hours,date);
                    studyService.addSession(session);
                    break;
                case 2:
                  studyService.displaySessions();
                   break;
                case 3:
                    System.out.println("Total Study HOurs: " + studyService.getTotalStudyHours());
                    break;
                case 4:
                   input.nextLine();
                   System.out.println("Emter expense description: ");
                   String description=input.nextLine();
                   System.out.println("Enter expense category: ");
                   String category=input.nextLine();
                   System.out.println("Enter amount(Ksh): ");
                   double amount;
                   do{
                       System.out.println("Enter amount(KSh): ");
                       amount=input.nextDouble();
                       if(amount<=0){
                           System.out.println("Invalid amount.Please enter a positive amount.");
                       }
                   }while(amount<=0);
                   System.out.println("Enter date (YYYY-MM-DD): ");
                   String studyDateInput = input.next();
                   LocalDate studyDate = null;
            while(studyDate == null){
                       try{
                           studyDate = LocalDate.parse(studyDateInput);
                       }catch(DateTimeParseException e)
                       {
                           System.out.print("Invalid date! use YYYY-MM-DD.");
                           System.out.print("Enter date again:");
                           studyDateInput=input.next();
                       }
                   }
                   Expense expense =new Expense(description, category, amount, studyDate);
                   expenseService.addExpense(expense);
                    break;
                case 5:
                    expenseService.displayExpenses();
                    break;
                case 6:
                    System.out.println("Total Expenses: Ksh" + expenseService.getTotalExpenses());
                    break;
                case 7:
                    System.out.println("\n======TRACKER SUMMARY========");
                    System.out.println("Total Study hours: " + studyService.getTotalStudyHours());
                    System.out.println("Total Expensee: Ksh" +  expenseService.getTotalExpenses());
                    break;
                case 8:
                    System.out.println("Thankyou for using the tracker!");
                    break;
                case 9:
                    System.out.println("Enter study session number to delete");
                    int sessionNumber=input.nextInt();
                    studyService.deleteSession(sessionNumber-1);
                            break;
                case 10:
                    System.out.println("Enter expense number to delete");
                    int expenseNumber=input.nextInt();
                    expenseService.deleteExpense(expenseNumber - 1);
                    break;
                case 11:
                    input.nextLine();
                    System.out.println("Enter subject to search");
                    String searchSubject = input.nextLine();
                    studyService.searchSession(searchSubject);
                    break;
                default:
                    System.out.println("Invalid choice.Try again.");
              
            }
        }while(choice !=8);
        input.close();
    }
}
