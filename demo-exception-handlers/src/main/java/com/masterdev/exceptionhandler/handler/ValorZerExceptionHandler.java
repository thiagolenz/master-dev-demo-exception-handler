package com.masterdev.exceptionhandler.handler;

import com.masterdev.exceptionhandler.dto.ErrorDTO;
import com.masterdev.exceptionhandler.exception.ValorZeroException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ValorZerExceptionHandler {

    @ResponseStatus(HttpStatus.PRECONDITION_FAILED)
    @ResponseBody
    @ExceptionHandler(ValorZeroException.class)
    public ErrorDTO handler(ValorZeroException ex) {
        return new ErrorDTO(
            ex.getMessage(),
            ex.getLancamento()
        );
    }
}
