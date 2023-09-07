package com.jrishmani.JunitTesing.repository;

import com.jrishmani.JunitTesing.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person,Integer> {
//    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.personId = ?1")
//    Boolean
//    isPersonExitsById(Integer id);
}
