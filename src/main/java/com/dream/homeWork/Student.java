package com.dream.homeWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
}
