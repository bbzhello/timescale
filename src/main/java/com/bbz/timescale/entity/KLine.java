package com.bbz.timescale.entity;

import java.io.Serializable;
import java.util.Date;

public class KLine implements Serializable {
    private Date kTime;

    private Long resolution;

    private String symbol;

    private String exchangeId;

    private Long o;

    private Long h;

    private Long l;

    private Long c;

    private Long volume;

    private Long urnover;

    private static final long serialVersionUID = 1L;

    public Date getkTime() {
        return kTime;
    }

    public void setkTime(Date kTime) {
        this.kTime = kTime;
    }

    public Long getResolution() {
        return resolution;
    }

    public void setResolution(Long resolution) {
        this.resolution = resolution;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public String getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(String exchangeId) {
        this.exchangeId = exchangeId == null ? null : exchangeId.trim();
    }

    public Long getO() {
        return o;
    }

    public void setO(Long o) {
        this.o = o;
    }

    public Long getH() {
        return h;
    }

    public void setH(Long h) {
        this.h = h;
    }

    public Long getL() {
        return l;
    }

    public void setL(Long l) {
        this.l = l;
    }

    public Long getC() {
        return c;
    }

    public void setC(Long c) {
        this.c = c;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getUrnover() {
        return urnover;
    }

    public void setUrnover(Long urnover) {
        this.urnover = urnover;
    }
}