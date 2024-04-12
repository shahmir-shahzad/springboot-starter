package com.shahmir.basicwebapparchitecture.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class ApiError {

    private int errorCode;
    private String description;
    private Date date;

}
