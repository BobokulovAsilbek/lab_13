package com.example.newlab;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class MyController {

        private static final Logger logger = LoggerFactory.getLogger(MyController.class);

    @PostMapping("/create")
    public ResponseEntity<String> createRequest(@Valid @RequestBody RequestDTO requestDTO) {

        String responseMessage = "Request received successfully for " + requestDTO.getName() +
                " with age " + requestDTO.getAge() + ".";
        return new ResponseEntity<>(responseMessage, HttpStatus.CREATED);
    }

       @GetMapping("/info")
       public ResponseDTO<String> getInfo() {
           String data = "This is some sample information.";
           ResponseDTO<String> responseDTO = new ResponseDTO<>(
                "Request was successful", 200, data);

        return responseDTO;
    }

    }

