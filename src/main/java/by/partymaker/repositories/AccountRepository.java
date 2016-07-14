package by.partymaker.repositories;

import by.partymaker.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 14.07.2016
 *
 * @author user
 */
public interface AccountRepository extends JpaRepository<Account, String> {
}
