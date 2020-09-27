package th.ku.ac.atm.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ku.ac.atm.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
