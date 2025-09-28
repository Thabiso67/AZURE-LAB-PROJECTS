/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasttest2022;

/**
 *
 * @author lab_services_student
 */
public class StaffHiring extends Staff {
    
    public StaffHiring ( int staffNumber, String location ) {
        super(staffNumber,location);
    }
    
    @Override
    public String getStaffHiringProcess(){
        if ( getStaffNumber() < 20 ) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
    
    public void printStaffHiring(){
        System.out.println("LOCATION : " + getStaffLocation());
        System.out.println("STAFF NUMBER : " + getStaffNumber());
        System.out.println("HIRE STAFF : " + getStaffHiringProcess());
    }
}
