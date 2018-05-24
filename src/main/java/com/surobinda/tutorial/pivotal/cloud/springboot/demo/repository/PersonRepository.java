package com.surobinda.tutorial.pivotal.cloud.springboot.demo.repository;

import com.surobinda.tutorial.pivotal.cloud.springboot.demo.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository  extends PagingAndSortingRepository<Person, Long> {
}
