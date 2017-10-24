package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<Newspaper> news=new ArrayList<Newspaper>();
        ArrayList<Article> articles= new ArrayList<Article>();
        Scanner scan= new Scanner(System.in);
        String Add="";
        do
        {
            Newspaper newspapers=new Newspaper();
            System.out.println("Add tittles of Newspapers");
            newspapers.setNewstittle(scan.nextLine());
            System.out.println("Do you want to add more Newspaper: Yes/No?");
            Add=scan.nextLine();
            news.add(newspapers);
        }while(Add.equalsIgnoreCase("Yes"));

            do
            {
                Article newsarticle= new Article();
                System.out.println("Add Tittle from the Newspaper Article tittle :");
                newsarticle.setTittle(scan.nextLine());
                System.out.println("Add Tittle from the Date for the tittle :");
                newsarticle.setDate(scan.nextLine());
                System.out.println("Do you want to add more tittle and date: Yes/No?");
                Add=scan.nextLine();
                articles.add(newsarticle);

            }while(Add.equalsIgnoreCase("Yes"));



            System.out.println("The Tittle for the Newspaper is : " );
        for(Newspaper npaper:news)
        {
            System.out.println(npaper.getNewstittle());
        }
        System.out.println("The Description for the Articles are : ");
        for(Article narticle:articles)
        {
            System.out.println(narticle.getTittle() + "," + narticle.getDate());
        }
    }
}
