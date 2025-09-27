/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.revovationreporter2022v2;

/**
 *
 * @author lab_services_student
 */
public class RevovationReporter2022V2 {
    public static void main(String[] args) {
        // Months
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};

        // Jobs: bathrooms, kitchens, gardens (6 months x 3 categories)
        int[][] jobs = {
            {8, 2, 5}, // JAN
            {7, 4, 5}, // FEB
            {5, 5, 2}, // MAR
            {2, 2, 3}, // APR
            {7, 7, 9}, // MAY
            {7, 8, 5}  // JUN
        };

        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("------------------------------------------------");
        System.out.printf("%-5s %-10s %-10s %-10s\n", "", "Bathrooms", "Kitchens", "Garden");
        
        // Print monthly job breakdown
        for (int i = 0; i < jobs.length; i++) {
            System.out.printf("%-5s %-10d %-10d %-10d\n",
                    months[i], jobs[i][0], jobs[i][1], jobs[i][2]);
        }

        System.out.println("------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        
        // Print monthly totals with "***" if >= 15
        for (int i = 0; i < jobs.length; i++) {
            int total = jobs[i][0] + jobs[i][1] + jobs[i][2];
            if (total >= 15) {
                System.out.printf("%-5s %-3d ***\n", months[i], total);
            } else {
                System.out.printf("%-5s %-3d\n", months[i], total);
            }
        }
    }
}
