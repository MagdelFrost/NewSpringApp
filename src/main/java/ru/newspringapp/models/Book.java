package ru.newspringapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private int id;

    private int person_id;

    private String title;

    private String author;

    private int year;
}
