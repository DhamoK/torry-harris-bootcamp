package com.torryharris.model;

public class Movie implements Comparable<Movie> {
    private String title;
    private int year;
    private Float imdbRating,collections;

    public Movie(String title, int year, Float imdbRating, Float collections) {
        this.title = title;
        this.year = year;
        this.imdbRating = imdbRating;
        this.collections = collections;
    }

    @Override
    public int compareTo(Movie o) {
        return this.title.compareTo(o.title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Float getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Float imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Float getCollections() {
        return collections;
    }

    public void setCollections(Float collections) {
        this.collections = collections;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", imdbRating=" + imdbRating +
                ", collections=" + collections +"Crores"+
                '}';
    }
}
