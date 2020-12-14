package com.ivoronline.springboot.db_relationships.repositories;

import com.ivoronline.springboot.db_relationships.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, Integer> {
}
