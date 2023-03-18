package com.example.elizavetaproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BANDWIDTH_LIMIT_EXCEEDED)
public class WrongDataException extends RuntimeException {


 public String reason;

 public WrongDataException(){
 }
}
