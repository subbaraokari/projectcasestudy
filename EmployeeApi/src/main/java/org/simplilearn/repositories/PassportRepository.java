package org.simplilearn.repositories;

import org.simplilearn.entities.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Integer>{

}
