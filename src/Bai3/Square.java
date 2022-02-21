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
public class Square {

    private float edge;

    public float getEdge() {
        return edge;
    }

    public void setEdge(float edge) {
        this.edge = edge;
    }

    public static void Edge(float edge) {
        System.out.println("Size of square: " + edge);
    }

    public static void Perimeter(float edge) {
        float perimeter = edge * 4;
        System.out.println("Perimeter of the square: " + perimeter);
    }

    public static void Area(float edge) {
        float area = edge * edge;
        System.out.println("Area of the square: " + area);
    }
    
    public static void SquareInfor(float edge){
        System.out.println("\n*Square infomation: ");
        System.out.print(" + ");
        Edge(edge);
        System.out.print(" + ");
        Perimeter(edge);
        System.out.print(" + ");
        Area(edge);
    }
}
