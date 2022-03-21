package com.company;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
class Main {
    public static void main(String args[]) throws InvalidAgeException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the birth date in dd-mm-yyyy format");
        String str = sc.next();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate cd = LocalDate.parse(str, df);
            LocalDate today = LocalDate. now();

            LocalDate now = LocalDate.now();
            try {
                if (cd.isAfter(now))
                    throw new futureAgeException("Date of birth should not be in future");
            } catch (futureAgeException a) {
                System.out.println("Date of birth should not be in future");
            }
            System.out.println(ChronoUnit.YEARS.between(cd, now));

        }
        catch (DateTimeParseException e){
            System.out.println("Enter date in proper format");
        }



    }
}



