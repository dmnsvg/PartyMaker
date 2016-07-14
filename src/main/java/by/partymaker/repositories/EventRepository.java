package by.partymaker.repositories;

import by.partymaker.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 14.07.2016
 *
 * @author user
 */
public interface EventRepository extends JpaRepository<Event, String> {
}
