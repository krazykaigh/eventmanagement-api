package com.udemy.kaideas.eventmanagement.repos;

import com.udemy.kaideas.eventmanagement.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
