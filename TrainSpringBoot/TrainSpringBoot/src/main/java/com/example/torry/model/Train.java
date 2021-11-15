package com.example.torry.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Train {
    @Id
    private int trainNo;
    private String trainName;
    private String source;
    private String destination;
    private double ticketPrice;
}
