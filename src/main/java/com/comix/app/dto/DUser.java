package com.comix.app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DUser {

    private Long id;

    private String name;

    private String nickname;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthdate;

}
