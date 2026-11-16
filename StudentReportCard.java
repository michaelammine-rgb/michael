import java.util.Scanner;
public class StudentReportCard{
    public static calculateAverage(double[]marks){
        double total=0;
        for(int i=0;i<=marks.length;i++){
total+=marks[i];
        }
        return total/marks.length;
    }
    public static String calculateGrade(double average){
        if(average>=70){
            return "A";
    }
    else if(average>=60){
        return "B";
    }
    else if(average>=50){
        return "C";
    }
    else if(average>=40){
        return "D";
    }
    else{
        return "F";
    }
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        String [] names=new String[5];
        double[] [] marks=new double[5][3];
        double[] averages=new double[5];

        for (int i=0;i<3;i++){
            System.out.println("Enter the name of the student: "+(i+1));
            names[i]=input.nextLine();
            for(int j=0;j<5;j++){
                System.out.println("Enter marks for subject: "+(j+1));
                marks[j][i]=input.nextDouble();
            }
            input.nextLine();
            averages[i]=calculateAverage(marks[i]);
            classTotal+=averages[i];
            highestAverage=averages[i];
            if(averages[i]>highestAverage){
                highestAverage=averages[i];
                highestStudent=names[i];
            }
        }
        //display the report card
        System.out.println("\n Student name: "+names[i]);
        System.out.println("marks 1 :"+marks[i][0]);
        System.out.println("marks 1 :"+marks[i][1]);
        System.out.println("marks 1 :"+marks[i][2]);
            System.out.println("average .2f%n :"+averages[i]);
            calculateGrade(averages[i]);
            System.out.println("__________________________");
    }
    double classAverage=classTotal/5;
    System.out.println("\nclass average :"+classAverage);
    System.out.println("highest average :"+highestAverage);
    System.out.println("highest student :"+highestStudent);
    Sysytem.out.println("__________________________");
    input.close();
    }}
