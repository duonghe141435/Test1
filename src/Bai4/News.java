/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.ArrayList;

/**
 *
 * @author morjo
 */
public class News implements INews {

    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    @Override
    public void display(ArrayList<News> lt) {
        if (lt.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        for (int i = 0; i < lt.size(); i++) {
            
            System.out.println("\nTitle: "+ lt.get(i).getTitle());
            System.out.println("Publish Date: "+lt.get(i).getPublishDate());
            System.out.println("Author: "+lt.get(i).getAuthor());
            System.out.println("Content: " +lt.get(i).getContent()+"\n");
            System.out.println("Average rate: "+lt.get(i).getAverageRate());
        }
    }

    float[] rateList = new float[3];

    public float caculate() {
        averageRate = 0;
        for (int i = 0; i < rateList.length; i++) {
            averageRate += rateList[i];
        }
        return averageRate/rateList.length;
    }

}
