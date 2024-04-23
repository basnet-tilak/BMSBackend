package fr.epita.bms.repository;

import fr.epita.bms.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findById(long id);

    Admin findByEmailAddress(String emailAddress);
}
