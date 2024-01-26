package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "infomation")
@Data
public class ExcelData implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "data")
    private String data;

    @Column(name = "nhafcungcapdichvukyc")
    private String nhafcungcapdichvukyc;

    @Column(name = "customerid")
    private int customerid;

    @Column(name = "anhgiattomattruoc")
    private String anhgiattomattruoc;

    @Column(name = "anhgiattomatsau")
    private String anhgiattomatsau;

    @Column(name = "anhchandung")
    private String anhchandung;

    @Column(name = "ketquaocrnattruoc")
    private String ketquaocrnattruoc;

    @Column(name = "thoigianxuly")
    private LocalDateTime thoigianxuly;

    @Column(name = "ketquaocrmatsau")
    private String ketquaocrmatsau;

    @Column(name = "thoigianxuly1")
    private LocalDateTime thoigianxuly1;

    @Column(name = "ketquasosanhmat")
    private String ketquasosanhmat;

    @Column(name = "thoigianxuly2")
    private LocalDateTime thoigianxuly2;

    @Column(name = "dulieuocrmattruoc")
    private String dulieuocrmattruoc;

    @Column(name = "dulieuocrmatsau")
    private String dulieuocrmatsau;

    @Column(name = "dulieusosanhkhuonmat")
    private String dulieusosanhkhuonmat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNhafcungcapdichvukyc() {
        return nhafcungcapdichvukyc;
    }

    public void setNhafcungcapdichvukyc(String nhafcungcapdichvukyc) {
        this.nhafcungcapdichvukyc = nhafcungcapdichvukyc;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getAnhgiattomattruoc() {
        return anhgiattomattruoc;
    }

    public void setAnhgiattomattruoc(String anhgiattomattruoc) {
        this.anhgiattomattruoc = anhgiattomattruoc;
    }

    public String getAnhgiattomatsau() {
        return anhgiattomatsau;
    }

    public void setAnhgiattomatsau(String anhgiattomatsau) {
        this.anhgiattomatsau = anhgiattomatsau;
    }

    public String getAnhchandung() {
        return anhchandung;
    }

    public void setAnhchandung(String anhchandung) {
        this.anhchandung = anhchandung;
    }

    public String getKetquaocrnattruoc() {
        return ketquaocrnattruoc;
    }

    public void setKetquaocrnattruoc(String ketquaocrnattruoc) {
        this.ketquaocrnattruoc = ketquaocrnattruoc;
    }

    public LocalDateTime getThoigianxuly() {
        return thoigianxuly;
    }

    public void setThoigianxuly(LocalDateTime thoigianxuly) {
        this.thoigianxuly = thoigianxuly;
    }

    public String getKetquaocrmatsau() {
        return ketquaocrmatsau;
    }

    public void setKetquaocrmatsau(String ketquaocrmatsau) {
        this.ketquaocrmatsau = ketquaocrmatsau;
    }

    public LocalDateTime getThoigianxuly1() {
        return thoigianxuly1;
    }

    public void setThoigianxuly1(LocalDateTime thoigianxuly1) {
        this.thoigianxuly1 = thoigianxuly1;
    }

    public String getKetquasosanhmat() {
        return ketquasosanhmat;
    }

    public void setKetquasosanhmat(String ketquasosanhmat) {
        this.ketquasosanhmat = ketquasosanhmat;
    }

    public LocalDateTime getThoigianxuly2() {
        return thoigianxuly2;
    }

    public void setThoigianxuly2(LocalDateTime thoigianxuly2) {
        this.thoigianxuly2 = thoigianxuly2;
    }

    public String getDulieuocrmattruoc() {
        return dulieuocrmattruoc;
    }

    public void setDulieuocrmattruoc(String dulieuocrmattruoc) {
        this.dulieuocrmattruoc = dulieuocrmattruoc;
    }

    public String getDulieuocrmatsau() {
        return dulieuocrmatsau;
    }

    public void setDulieuocrmatsau(String dulieuocrmatsau) {
        this.dulieuocrmatsau = dulieuocrmatsau;
    }

    public String getDulieusosanhkhuonmat() {
        return dulieusosanhkhuonmat;
    }

    public void setDulieusosanhkhuonmat(String dulieusosanhkhuonmat) {
        this.dulieusosanhkhuonmat = dulieusosanhkhuonmat;
    }
}
