package com.application.callboard.model;


import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;


@Builder
@Getter
public class Employer{
    private String name;
    private String surname;
    private Integer age;
    private BigDecimal salary;
}
