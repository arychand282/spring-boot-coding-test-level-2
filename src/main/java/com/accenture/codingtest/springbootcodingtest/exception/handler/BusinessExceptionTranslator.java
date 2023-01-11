package com.accenture.codingtest.springbootcodingtest.exception.handler;

import com.accenture.codingtest.springbootcodingtest.exception.BusinessException;
import com.accenture.codingtest.springbootcodingtest.model.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BusinessExceptionTranslator {

    public BusinessExceptionTranslator() {

    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({ BusinessException.class })
    public ErrorDto handleBusinessException(BusinessException ex) {
        return new ErrorDto("BusinessException", ex.getCode(), ex.getMessage(), ex.getParams());
    }
}
