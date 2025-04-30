package models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "conferences")
@PrimaryKeyJoinColumn(name = "event_id")
public class Conference extends Event{

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "conference_id")
    List<Speaker> speakers;

    public Conference () {
        super();
        speakers = new ArrayList<>();
    }

    public Conference(Date date, int duration, String location, String title) {
        super(date, duration, location, title);
        this.speakers =  new ArrayList<>();
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "speakers=" + speakers +
                '}';
    }
}