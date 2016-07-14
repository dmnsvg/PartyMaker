package by.partymaker.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created on 14.07.2016
 *
 * @author user
 */
@Entity
public class Event {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_owner")
    private Account owner;
    private String name;
    private String description;
    private Date eventTime;
    private String meetupPlace;
    private Integer minPeople;
    private Integer maxPeople;

    public Event() {
    }

    public Event(String name,
                 String description,
                 Date eventTime,
                 String meetupPlace,
                 Integer minPeople,
                 Integer maxPeople) {
        this.name = name;
        this.description = description;
        this.eventTime = eventTime;
        this.meetupPlace = meetupPlace;
        this.minPeople = minPeople;
        this.maxPeople = maxPeople;
        this.eventTime = new Date();
    }

    public String getId() {
        return id;
    }

    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public String getMeetupPlace() {
        return meetupPlace;
    }

    public Integer getMinPeople() {
        return minPeople;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }
}
