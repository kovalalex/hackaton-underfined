package com.cbr.hackaton.repository;

import com.cbr.hackaton.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
