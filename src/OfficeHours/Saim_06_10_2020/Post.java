package OfficeHours.Saim_06_10_2020;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {

    private String body;
    private String dateAndTime;

    public Post(String body) {
        setBody(body);
        setDateAndTime();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime() {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a");
        this.dateAndTime = dt.format(format);
    }

    @Override
    public String toString() {
        return body + "\n" + dateAndTime;
    }
}
