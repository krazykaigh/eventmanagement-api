package com.udemy.kaideas.eventmanagement.repos;

import com.udemy.kaideas.eventmanagement.entities.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {
}
