package by.partymaker.controllers;

import by.partymaker.dto.EventDto;
import by.partymaker.entities.Account;
import by.partymaker.entities.Event;
import by.partymaker.repositories.AccountRepository;
import by.partymaker.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created on 14.07.2016
 * @author user
 */
@RestController
@RequestMapping("/api")
public class HelloController {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/accounts")
    public Account getAccount() {
        return accountRepository.findOne("1");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/events")
    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/events")
    public void deleteEvent(@RequestParam String id) {
        eventRepository.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/events")
    public void deleteEvent(@RequestBody EventDto eventDto) {

        eventRepository.save(eventDto.getEntity(accountRepository.findOne("1")));
    }

}
