/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pasttest2022;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class PastTest2022 {

    public static void main(String[] args) {
       
        //QUESTION 1
        String [] categories = new String[] {"BATHROOMS", "KITCHENS", "GARDENS"};
        String [] months = new String[] {"JAN","FEB","MAR","APR","MAY","JUN"};
        
        int [][] makeovers = new int [][] {{8, 2, 5},//Jan
                                           {7, 4, 5},//Feb
                                           {5, 5, 2},//Mar
                                           {2, 2, 3},//Apr
                                           {7, 7, 9},//May
                                           {7, 8, 5}};
        
        //for iterating through a 2D array use nested for loop
        //printing the array with row and col headings
        
        System.out.println("---------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("---------------------------------");
        
//        System.out.println("\t");
        for ( int i = 0; i < categories.length; i ++ ) {
            System.out.print("\t"+ categories[i]);
        }
        
        System.out.println("");
        for ( int i = 0; i < makeovers.length; i ++ ){ //loop through rows (makeovers.length)
            System.out.print(months[i] + "\t");
            for ( int j = 0; j < makeovers[0].length; j++ ){//loop through cols (makeovers[0].length)
                System.out.print(makeovers[i][j] + " \t\t");
            }
            System.out.println("");
        }
        
        int [] totals = new int [months.length];
        for ( int i = 0; i < makeovers.length; i ++ ) {
            int monthTotal = 0;
            for ( int j = 0;j < makeovers[0].length; j++ ) {
                monthTotal += makeovers[i][j];
            }
            totals[i] = monthTotal;
        }
        
        System.out.println("---------------------------------");
        System.out.println("Month TOTAL");
        System.out.println("---------------------------------");
        
        for ( int i = 0; i < months.length; i ++ ) {
            if ( totals[i] >= 15 ) {
                System.out.println(months[i] + "\t" + totals[i] + "\t***");
            }
            else {
                System.out.println(months[i] + "\t" + totals[i]);
            }
        }
        
        
        //QUESTION 2
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the current staff number : ");
        int staffNumber = sc.nextInt();
        
        System.out.println("Enter the staff hiring location");
        String location = sc.next();
        
        StaffHiring sh = new StaffHiring(staffNumber, location);
        
        sh.printStaffHiring();
        
    }
}
