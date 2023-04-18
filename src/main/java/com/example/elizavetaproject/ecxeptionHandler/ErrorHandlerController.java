package com.example.elizavetaproject.ecxeptionHandler;

import com.example.elizavetaproject.controller.WrongDataException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Arrays;

@ControllerAdvice
@RestController
public class ErrorHandlerController
            extends ResponseEntityExceptionHandler {

        @ExceptionHandler( value
                = {WrongDataException.class})
        public ErrorDto handleConflict(WrongDataException ex) {
            
            return new ErrorDto(100,"bla");
                    //Arrays.toString(new String[]{ex.getMessage()}));
          //return  ResponseEntity.status(100).header("bla","bla")
           //       .body(new ErrorDto(100,ex.reason));
        }
    }

