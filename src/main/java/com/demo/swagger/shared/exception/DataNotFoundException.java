package com.demo.swagger.shared.exception;

import org.apache.logging.log4j.message.StringFormattedMessage;

public class DataNotFoundException extends Exception {
    public DataNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
