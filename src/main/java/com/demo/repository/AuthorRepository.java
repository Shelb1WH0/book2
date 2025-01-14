package com.demo.repository;

import com.demo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Пример метода для поиска автора по полному имени
    //List<Author> findByFullName(String fullName);
}
