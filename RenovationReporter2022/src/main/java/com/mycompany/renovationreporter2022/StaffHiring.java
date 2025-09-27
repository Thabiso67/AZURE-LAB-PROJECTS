/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.renovationreporter2022;

/**
 *
 * @author lab_services_student
 */
public class StaffHiring extends Staff {
    
    public StaffHiring ( int staffNumeber, String location) {
        super(staffNumber, location);
    }
    
    @Override
    public String getStaffHiringProcess() {
        if ( super.getStaffNumber() < 20 ) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
    
    public void printStaffHiring() {
        System.out.println("Location : " super.getStaffLocation);
        System.out.println("Staff Number : " super.getStaffNumber);
        System.out.println("Hire Staff: " super.getStaffHiringProcess);
    }
}
