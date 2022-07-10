package com.ironhack.bookservice.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    @Id
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private String[] formats;
}
