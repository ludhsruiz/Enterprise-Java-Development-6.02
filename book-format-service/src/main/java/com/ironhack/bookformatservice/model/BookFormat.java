package com.ironhack.bookformatservice.model;


import com.ironhack.bookformatservice.enums.Format;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookFormat {

    @Id
    private String isbn;

    @Enumerated(EnumType.STRING)
    private Format formats;

}
