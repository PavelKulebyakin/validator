package com.spring.practice.validator.entity;

import com.spring.practice.validator.check.CheckEmail;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Employee {

    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;

    @NotBlank
    private String surname;

    @Min(0)
    @Max(100_000_000)
    private int salary;

    private String department;

    @CheckEmail(value = "@mail.ru", message = "email mast ends with '@mail.ru'")
    private String email;

}
