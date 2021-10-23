package com.zup.ottransacao.Exceptions;

public class CustomBusinesException extends CommonException {

    //O handler captura, lançando Unprocesable entity - 422
    public CustomBusinesException(String field, String msg) {
        super(field, msg);
    }
}
