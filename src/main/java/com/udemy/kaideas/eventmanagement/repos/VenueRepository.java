package com.udemy.kaideas.eventmanagement.repos;

import com.udemy.kaideas.eventmanagement.entities.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, Long> {
}
