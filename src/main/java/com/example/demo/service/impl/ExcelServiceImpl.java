package com.example.demo.service.impl;

import com.example.demo.dto.request.AddDataRequest;
import com.example.demo.dto.response.AddDataRespone;
import com.example.demo.entity.ExcelData;
import com.example.demo.repository1.ExcelDataRepository;
import com.example.demo.service.ExcelService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ExcelServiceImpl implements ExcelService{

    @Autowired
    ExcelDataRepository excelDataRepository;

    @Override
    public AddDataRespone addData(AddDataRequest request) throws Exception {
        AddDataRespone respone = new AddDataRespone();
        try{
            log.info("BEGIN ADD DATA");
            if (request.getId() == null) {
                throw new Exception("Đầu vào không hợp lệ");
            }
            ExcelData excelData = new ExcelData();
            excelData.setNhafcungcapdichvukyc(request.getNhafcungcapdichvukyc());
            excelData.setCustomerid(request.getCustomerid());
            excelData.setData(request.getData());
            excelData.setAnhgiattomattruoc(request.getAnhgiattomattruoc());
            excelData.setAnhgiattomatsau(request.getAnhgiattomatsau());
            excelData.setAnhchandung(request.getAnhchandung());
            excelData.setKetquaocrnattruoc(request.getKetquaocrnattruoc());
            excelData.setThoigianxuly(request.getThoigianxuly());
            excelData.setKetquaocrmatsau(request.getKetquaocrmatsau());
            excelData.setThoigianxuly1(request.getThoigianxuly1());
            excelData.setKetquasosanhmat(request.getKetquasosanhmat());
            excelData.setThoigianxuly2(request.getThoigianxuly2());
            excelData.setDulieuocrmattruoc(request.getDulieuocrmattruoc());
            excelData.setDulieuocrmatsau(request.getDulieuocrmatsau());
            excelData.setDulieusosanhkhuonmat(request.getDulieusosanhkhuonmat());

            ExcelData excelDataSave = excelDataRepository.save(excelData);
            respone.setExcelData(excelDataSave);
            log.info("END ADD DATA");
            return respone;
        } catch (Exception e){
            log.error(e);
            return respone;
        }
    }
}

