package by.partymaker.services;

import by.partymaker.dto.EventDto;
import by.partymaker.entities.Event;
import by.partymaker.repositories.AccountRepository;
import by.partymaker.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 15.07.2016
 *
 * @author user
 */
@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private AccountRepository accountRepository;

    public List<Event> findAll(){
        return eventRepository.findAll();
    }

    public void save(EventDto dto){
        eventRepository.save(dto.getEntity(accountRepository.findOne("1")));
    }

    public void delete(String id){
        eventRepository.delete(id);
    }
}
