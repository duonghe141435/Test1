/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import Validate.Validate;
import java.util.Scanner;

/**
 *
 * @author morjo
 */
public class Bai1 {

    public static void main(String[] args) {
        Validate vali = new Validate();
        System.out.println("-----Quadratic equations sytem!-----");
        while (true) {
            int a = vali.checkInt("Enter a number: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            int b = vali.checkInt("Enter b number: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            int c = vali.checkInt("Enter c number: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            float delta = b * b - 4 * a * c;
            System.out.println("Delta = " + delta);
            if (delta >= 0) {
                System.out.println("Square root of delta: " + Math.sqrt(delta));
            } else {
                System.err.println("Delta less than 0!");
            }
        }
    }
}
