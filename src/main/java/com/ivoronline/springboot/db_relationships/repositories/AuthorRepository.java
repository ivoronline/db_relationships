package com.ivoronline.springboot.db_relationships.repositories;

import com.ivoronline.springboot.db_relationships.entities.AuthorEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<AuthorEntity, Integer> {
}
