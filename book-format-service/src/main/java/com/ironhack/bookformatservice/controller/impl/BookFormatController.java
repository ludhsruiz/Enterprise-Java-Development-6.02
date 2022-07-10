package com.ironhack.bookformatservice.controller.impl;

import com.ironhack.bookformatservice.controller.Dto.BookFormatDto;
import com.ironhack.bookformatservice.enums.Format;
import com.ironhack.bookformatservice.model.BookFormat;
import com.ironhack.bookformatservice.repository.BookFormatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookFormatController {

    @Autowired
    private BookFormatRepository bookFormatRepository;

    @GetMapping("/format/{isbn}")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getBookFormat(@PathVariable String isbn) {

        return bookFormatRepository.findByIsbn(isbn);
    }

    @PostMapping("/format")
    @ResponseStatus(HttpStatus.CREATED)
    public void createBookFormat(@RequestBody BookFormatDto bookFormatDto) {
        for (String format : bookFormatDto.getFormats()){
            bookFormatRepository.save(new BookFormat(bookFormatDto.getIsbn(), Format.valueOf(format)));
        }
    }
}