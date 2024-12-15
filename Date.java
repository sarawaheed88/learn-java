/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.date;

import java.time.LocalDate;

/**
 *
 * @author sara
 */
public class Date {

    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalDate yearAgo = myDate.minusYears(1);
        LocalDate monthAgo = myDate.minusMonths(1);

        System.out.println(myDate);
        System.out.println(yearAgo);
        System.out.println(monthAgo);
    }
}
