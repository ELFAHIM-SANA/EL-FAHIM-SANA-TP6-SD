package ma.iaad.elfahimsanatp6sdbankaccountservice.repositories;

import ma.iaad.elfahimsanatp6sdbankaccountservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
