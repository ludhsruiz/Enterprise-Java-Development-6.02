package com.ironhack.bookformatservice.repository;

import com.ironhack.bookformatservice.model.BookFormat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookFormatRepository extends JpaRepository<BookFormat, String> {

    @Query("select formats from BookFormat where isbn=:isbn")
    public List<String> findByIsbn(@Param("isbn")String isbn);
}