package com.cbr.hackaton.repository;

import com.cbr.hackaton.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
@RepositoryRestResource
public interface AddressRepository extends CrudRepository<Address, Long> {
}
