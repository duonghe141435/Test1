/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import Validate.Validate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author morjo
 */
public class Main {
    private static int id = 0;
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Validate vali = new Validate();
        News news = new News();
        ArrayList<News> allNews = new ArrayList<>();
        while (true) {
            System.out.println("\n--------Menu--------");
            System.out.println("1 – Insert news.");
            System.out.println("2 – View list news.");
            System.out.println("3 – Average rate.");
            System.out.println("4 – Exit.\n");
            int choice = vali.checkInt("Enter your choice: ", 1, 4);
            switch (choice) {
                
                case 1:
                    System.out.println("-----Insert news-----");
                    id +=1; 
                    System.out.print("\nEnter title: ");
                    String title = in.nextLine();
                    System.out.print("Enter publish date: ");
                    String publishDate = in.nextLine();
                    System.out.print("Enter author: ");
                    String author = in.nextLine();
                    System.out.print("Enter content: ");
                    String content = in.nextLine();
                    
                    System.out.println("Enter your three rate: ");
                    news.rateList[0] = vali.checkFloat(" +Enter your first rate: ", 1, 5);
                    news.rateList[1] = vali.checkFloat(" +Enter your second rate: ", 1, 5);
                    news.rateList[2] = vali.checkFloat(" +Enter your third rate: ", 1, 5);
                    
                    float rateLish = news.caculate();
                    allNews.add(new News(id,title,publishDate,author,content,rateLish));
                    break;
                    
                case 2:
                    news.display(allNews);
                    break;
                case 3:
                    news.display(allNews);
                    break;
                case 4:
                    return;
            }
        }
    }
}
