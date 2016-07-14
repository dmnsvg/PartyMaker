package by.partymaker.dto;

import by.partymaker.entities.Account;
import by.partymaker.entities.Event;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.xml.internal.stream.Entity;

import java.util.Date;

/**
 * Created on 15.07.2016
 *
 * @author user
 */
public class EventDto {
    private String name;
    private String description;
    private Date eventTime;
    private String meetupPlace;
    private Integer minPeople;
    private Integer maxPeople;

    @JsonIgnore
    public Event getEntity(Account account) {
        Event event = new Event(name, description, eventTime, meetupPlace, minPeople, maxPeople);
        event.setOwner(account);
        return event;
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
