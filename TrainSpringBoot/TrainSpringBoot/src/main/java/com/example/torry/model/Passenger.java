package com.example.torry.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Passenger implements Comparable<Passenger> {

    private String name;
    private int age;
    private char gender;

    @Override
    public int compareTo(Passenger o) {
        if ((o.getName()).compareTo(name) > 0) {
            return -1; // false
        } else {
            if ((o.getName()).equals(name)) {
                return 0; // null
            } else {
                return 1; // true
            }
        }
    }
}