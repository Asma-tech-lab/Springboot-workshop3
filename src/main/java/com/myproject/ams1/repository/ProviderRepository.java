package com.myproject.ams1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myproject.ams1.entities.Provider;

@Repository

public interface ProviderRepository extends CrudRepository <Provider, Long>{

}
