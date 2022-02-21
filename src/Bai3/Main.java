/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import Validate.Validate;

/**
 *
 * @author morjo
 */
public class Main {

    

    public static void main(String[] args) {
        Validate vali = new Validate();
        Square squa = new Square();
        float edge = vali.checkFloat("Enter size lenth of square: ", 0, Float.MAX_VALUE);
        System.out.println("");
        squa.Edge(edge);
        squa.Perimeter(edge);
        squa.Area(edge);
        squa.SquareInfor(edge);

    }
}
