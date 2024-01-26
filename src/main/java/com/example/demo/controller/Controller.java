package com.example.demo.controller;

import com.example.demo.dto.request.AddDataRequest;
import com.example.demo.dto.response.AddDataRespone;
import com.example.demo.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private ExcelService excelService;

    @GetMapping(value = "hello")
    @ResponseBody
    public ResponseEntity<?> hello() throws Exception {
        return new ResponseEntity<>("toi ten la Duc Hoang", HttpStatus.OK);
    }

    @PostMapping("/add")
    @ResponseBody
    public ResponseEntity<?> add(@RequestBody AddDataRequest request) throws Exception {
        AddDataRespone response = excelService.addData(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
