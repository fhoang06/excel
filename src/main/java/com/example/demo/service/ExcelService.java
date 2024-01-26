package com.example.demo.service;

import com.example.demo.dto.request.AddDataRequest;
import com.example.demo.dto.response.AddDataRespone;

public interface ExcelService{
    AddDataRespone addData(AddDataRequest request) throws Exception;
}
