package de.telran.javaPro.lesson25_01082023.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private int age;
    private Degree degree;
}
