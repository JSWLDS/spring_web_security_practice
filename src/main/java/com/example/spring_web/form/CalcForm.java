package com.example.spring_web.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CalcForm {

    @NotNull // message="왼쪽 : 숫자를 입력해주세요."
    @Range(min=1, max=10) // message = "왼쪽 : {min}~{max} 범위의 숫자를 입력해주세요."
    @NotBlank
    private Integer leftNum;

    @NotNull // message="오른쪽 : 숫자를 입력해주세요."
    @Range(min=1, max=10) //message = "오른쪽 : {min}~{max} 범위의 숫자를 입력해주세요."
    @NotBlank
    private Integer rightNum;
}
