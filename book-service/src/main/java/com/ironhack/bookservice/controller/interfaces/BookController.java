package com.ironhack.bookservice.controller.interfaces;
import com.ironhack.bookservice.controller.dto.BookDto;

public interface BookController {
    public BookDto getBook(String isbn);

}
