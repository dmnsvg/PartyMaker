package by.partymaker.controllers;

import by.partymaker.dto.EventDto;
import by.partymaker.entities.Account;
import by.partymaker.entities.Event;
import by.partymaker.repositories.AccountRepository;
import by.partymaker.repositories.EventRepository;
import by.partymaker.services.AccountService;
import by.partymaker.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created on 14.07.2016
 * @author user
 */
@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;


    @RequestMapping(method = RequestMethod.GET)
    public List<Event> getEvents() {
        return eventService.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteEvent(@RequestParam String id) {
        eventService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/events")
    public void saveEvent(@RequestBody EventDto eventDto) {
        eventService.save(eventDto);
    }

}
