package com.exercice;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Nombre d'articles ?");
        int nombreArticles = scanner.nextInt();
        double prixTotal = 0;

        for (int i = 1; i <= nombreArticles; i++){
            System.out.println("le prix de l'article " + i + " : ");
            double prixArticle = scanner.nextDouble();

            prixTotal = prixTotal + prixArticle;

        }

        System.out.println(" Total du panier : " + prixTotal );

    }
    
}
