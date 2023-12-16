package com.comix.app.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class RegisterNotFoundException extends RuntimeException{

    @Getter
    private String object;

}
