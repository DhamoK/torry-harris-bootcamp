package task.model;

import java.util.Date;

public class Ticket {
    private int counter;
    private String pnr;
    private Date travelDate;
    Train train;

    public Ticket(Date travelDate, Train train) {
        this.travelDate = travelDate;
        this.train = train;
    }


}

