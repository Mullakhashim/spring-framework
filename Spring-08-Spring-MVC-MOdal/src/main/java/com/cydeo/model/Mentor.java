package com.cydeo.model;

import com.cydeo.enums.GENDER;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {
    private String FirstName;
    private String LastName;
    private int Age;
    private GENDER gender;
}
