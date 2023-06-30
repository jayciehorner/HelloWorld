package com.skillstorm.training;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarbequeRepo extends CrudRepository<Barbeque, Short>{

}
