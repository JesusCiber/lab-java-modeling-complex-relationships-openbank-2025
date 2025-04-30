package models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "expositions")
@PrimaryKeyJoinColumn(name = "event_id")
public class Exposition extends Event {
    public Exposition() {
        super();
    }

    public Exposition(Date date, int duration, String location, String title) {
        super(date, duration, location, title);
    }
}
