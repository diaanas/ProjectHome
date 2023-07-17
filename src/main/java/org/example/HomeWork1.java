package org.example;

import java.util.Scanner;


public class HomeWork1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        System.out.println(reverse());
        System.out.println(grade());
        System.out.println(sum());
    }


    public static int reverse() {
        check();
        int number = scanner.nextInt();
        int result = 0;
        while(number != 0){
            result = (result*10) + number % 10;
            number /=10;
        }
        return result;
    }

    public static int sum(){
        check();
        int result = 0;
        String line = scanner.nextLine();
        String [] numbers = line.split(" ");
        for (String s : numbers) {
            result += Integer.parseInt(s);
        }
        return result;

    }



    public static String grade (){
        check();
        int number = scanner.nextInt();
        String grade = "";
       if(number <= 100 && number >=90){
           grade = "A";
       }else if(number <= 89 && number >=82 ){
           grade = "B+";
       }else if(number <= 81 && number >=75 ){
           grade = "B";
       }else if(number <= 74 && number >=65 ) {
           grade = "C";
       }else if(number <= 64 && number >=60){
           grade = "E";
        }
       return grade;
    }



    public static void check(){
        while (!scanner.hasNextInt()) {
            System.out.println("Number must be valid");
            scanner.next();
        }

    }




}
