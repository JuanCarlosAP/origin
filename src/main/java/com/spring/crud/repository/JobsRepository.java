package com.spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.crud.model.Job;

@Repository
public interface JobsRepository extends JpaRepository<Job, String> {

}
