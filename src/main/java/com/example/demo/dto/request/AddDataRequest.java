package com.example.demo.dto.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AddDataRequest {
    private Integer id;
    private String data;
    private Integer customerid;
    private String nhafcungcapdichvukyc;
    private String anhgiattomattruoc;
    private String anhgiattomatsau;
    private String anhchandung;
    private String ketquaocrnattruoc;
    private LocalDateTime thoigianxuly;
    private String ketquaocrmatsau;
    private LocalDateTime thoigianxuly1;
    private String ketquasosanhmat;
    private LocalDateTime thoigianxuly2;
    private String dulieuocrmattruoc;
    private String dulieuocrmatsau;
    private String dulieusosanhkhuonmat;
}
