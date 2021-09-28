package com.torryharris.drive;

import com.torryharris.comparator.MovieComparatorCollections;
import com.torryharris.comparator.MovieComparatorImdb;
import com.torryharris.comparator.MovieComparatorYear;
import com.torryharris.model.Movie;
import com.torryharris.model.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {
        Movie m1 = new Movie("IRONMAN", 2016, 3.4f, 30.5f);
        Movie m2 = new Movie("THOR", 2015, 3.6f, 28.6f);
        Movie m3 = new Movie("BLACKPANTHER", 2017, 4.2f, 36.5f);
        Movie m4 = new Movie("CAPTAIN AMERICA", 2007, 3.3f, 23.5f);
        Movie m5 = new Movie("ANTMAN", 2020, 2.2f, 19.02f);
        int user;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose 1 - Sorting a movie by year wise\n Choose 2 - Sorting a movie by IMDB wise\n " +
                "Choose 3 - Sorting a movie by Collection wise\n Choose 4 - Sorting a movie by title wise");
        System.out.println("Choose your option : " );
        user = sc.nextInt();
        System.out.println();

        ArrayList<Movie> movieArrayList = new ArrayList<>();

        movieArrayList.add(m1);
        movieArrayList.add(m2);
        movieArrayList.add(m3);
        movieArrayList.add(m4);
        movieArrayList.add(m5);


        if (user == 1) {
            System.out.println("Sorting year wise");
            System.out.println();
            movieArrayList.sort(new MovieComparatorYear());
            Iterator<Movie> employeeIterator1 = movieArrayList.iterator();
            while (employeeIterator1.hasNext()) {
                System.out.println(employeeIterator1.next());
            }
        } else if (user == 2) {
            System.out.println("Sorting Imdb Rating wise");
            System.out.println();
            movieArrayList.sort(new MovieComparatorImdb());
            Iterator<Movie> employeeIterator1 = movieArrayList.iterator();
            while (employeeIterator1.hasNext()) {
                System.out.println(employeeIterator1.next());
            }
        } else if (user == 3) {
            System.out.println("Sorting Collections wise");
            System.out.println();
            movieArrayList.sort(new MovieComparatorCollections());
            Iterator<Movie> employeeIterator1 = movieArrayList.iterator();
            while (employeeIterator1.hasNext()) {
                System.out.println(employeeIterator1.next());
            }
        } else if (user == 4) {
            System.out.println("Sorting Title wise");
            System.out.println();
            movieArrayList.sort(null);
            Iterator<Movie> employeeIterator1 = movieArrayList.iterator();
            while (employeeIterator1.hasNext()) {
                System.out.println(employeeIterator1.next());
            }
        }
    }
}

