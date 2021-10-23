package com.zup.ottransacao.Exceptions;

public class CustomNotFoundException extends CommonException {

    public CustomNotFoundException(String field, String msg) {
        super(field, msg);
    }
}
