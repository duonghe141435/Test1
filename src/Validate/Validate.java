/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import java.util.Scanner;

/**
 *
 * @author morjo
 */
public class Validate {
    public static Scanner in = new Scanner(System.in);
    
    public static int checkInt(String MSG, int Min, int Max) {
        int Ret = -1;
        do {
            System.out.print(MSG);
            try {

                Ret = Integer.parseInt(in.nextLine().trim());
                if (Ret >= Min && Ret <= Max) {
                    break;
                }
                System.out.println("Out of range, please enter a number in range " + Min + " - " + Max);
            } catch (NumberFormatException ex) {
                System.err.println("Out of range, re-input" + "(" + Min + " - " + Max + ")!");
            }
        } while (true);
        return Ret;
    }
    
    public static float checkFloat(String MSG, float Min, float Max) {
        float Ret = -1;
        do {
            System.out.print(MSG);
            try {

                Ret = Float.parseFloat(in.nextLine().trim());
                if (Ret >= Min && Ret <= Max) {
                    break;
                }
                System.out.println("Out of range, please enter a number in range " + Min + " - " + Max);
            } catch (NumberFormatException ex) {
                System.err.println("Out of range, re-input" + "(" + Min + " - " + Max + ")!");
            }
        } while (true);
        return Ret;
    }
}
