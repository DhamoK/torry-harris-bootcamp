package com.torryharris.comparator;

import com.torryharris.model.Movie;

import java.util.Comparator;

public class MovieComparatorCollections implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getCollections().compareTo(o1.getCollections());
    }
}
