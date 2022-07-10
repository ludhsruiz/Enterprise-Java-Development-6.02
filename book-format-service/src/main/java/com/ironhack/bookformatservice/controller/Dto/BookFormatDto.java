package com.ironhack.bookformatservice.controller.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookFormatDto {

    @Id
    private String isbn;
    private String[] formats;
}
