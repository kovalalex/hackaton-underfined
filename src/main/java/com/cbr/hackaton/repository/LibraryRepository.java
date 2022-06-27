package com.cbr.hackaton.repository;

import com.cbr.hackaton.entity.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LibraryRepository extends CrudRepository<Library, Long> {
}
