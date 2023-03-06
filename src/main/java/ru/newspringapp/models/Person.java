package ru.newspringapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int id;

    private String full_name;

    private Date birth_date; //TODO: проверить какой тип выбрать
}
