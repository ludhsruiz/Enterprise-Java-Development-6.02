package com.ironhack.bookservice.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookFormatDto {

    @Id
    private String isbn;
    private String[] formats;

}
