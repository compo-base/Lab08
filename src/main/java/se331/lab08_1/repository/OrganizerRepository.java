package se331.lab08_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab08_1.entity.Organizer;

import java.util.List;

public interface OrganizerRepository extends JpaRepository<Organizer,Long> {
    List<Organizer> findAll(); //findAll method returns a List of Organizer entities from the database
}

