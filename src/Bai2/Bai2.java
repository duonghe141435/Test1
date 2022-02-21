/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import Validate.Validate;

/**
 *
 * @author morjo
 */
public class Bai2 {

    public static void main(String[] args) {
        System.out.println("-----Hệ thống tính tổng lượng tiền điện tiêu thụ!-----");
        while (true) {

            Validate vali = new Validate();
            int elecSum = vali.checkInt("Nhập tổng mức tiêu thụ điện: ", 0, Integer.MAX_VALUE);
            int price = 0;
            if (elecSum >= 0 && elecSum <= 25) {
                price = elecSum * 1000;
            } else if (elecSum > 25 && elecSum <= 75) {
                price = 25 * 1000 + (elecSum - 25) * 1250;
            } else if (elecSum > 75 && elecSum <= 150) {
                price = 25 * 1000 + (75 - 25) * 1250 + (elecSum - 75) * 1800;
            } else {
                price = 25 * 1000 + (75 - 25) * 1250 + (150 - 75) * 1800 + (elecSum - 150) * 2500;
            }
            System.out.print("Tiền điện phải trả của gia đình trong tháng là: " + price);
            System.out.println("");
        }
    }
}
