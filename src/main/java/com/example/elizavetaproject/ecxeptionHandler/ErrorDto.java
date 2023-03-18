package com.example.elizavetaproject.ecxeptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDto {

     public int status;

    public String description;
}
