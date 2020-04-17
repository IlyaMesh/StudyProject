package com.onthepitch.backend.exсeption;

import com.onthepitch.shared.model.response.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NoSuchUserException.class)
    protected ResponseEntity<MessageResponse> handleThereIsNoSuchUserException() {
        return new ResponseEntity<>(new MessageResponse("There is no such user"), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoSuchPostException.class)
    protected ResponseEntity<MessageResponse> handleIsNoSuchPostException(){
        return new ResponseEntity<>(new MessageResponse("There is no such post"), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoSuchClubException.class)
    protected ResponseEntity<MessageResponse> handleIsNoSuchClubException(){
        return new ResponseEntity<>(new MessageResponse("There is no such club"), HttpStatus.NOT_FOUND);
    }
}
