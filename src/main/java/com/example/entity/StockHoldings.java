package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "holdings")
public class StockHoldings {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	private String exchange;
    private String instrument;
    private Integer qty;
    private Integer salable;
    private Double avgCost;
    private Double invVal;
    private Double ltp;
    private Double curVal;
    private Double pAndL;
    private Double netChange;
    private String dayChange;
    private Integer npoaQty;
    private Integer t1Qty;
    private Integer pledgedQty;
    private Integer t1Nonpoa;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getSalable() {
		return salable;
	}
	public void setSalable(Integer salable) {
		this.salable = salable;
	}
	public Double getAvgCost() {
		return avgCost;
	}
	public void setAvgCost(Double avgCost) {
		this.avgCost = avgCost;
	}
	public Double getInvVal() {
		return invVal;
	}
	public void setInvVal(Double invVal) {
		this.invVal = invVal;
	}
	public Double getLtp() {
		return ltp;
	}
	public void setLtp(Double ltp) {
		this.ltp = ltp;
	}
	public Double getCurVal() {
		return curVal;
	}
	public void setCurVal(Double curVal) {
		this.curVal = curVal;
	}
	public Double getpAndL() {
		return pAndL;
	}
	public void setpAndL(Double pAndL) {
		this.pAndL = pAndL;
	}
	public Double getNetChange() {
		return netChange;
	}
	public void setNetChange(Double netChange) {
		this.netChange = netChange;
	}
	public String getDayChange() {
		return dayChange;
	}
	public void setDayChange(String dayChange) {
		this.dayChange = dayChange;
	}
	public Integer getNpoaQty() {
		return npoaQty;
	}
	public void setNpoaQty(Integer npoaQty) {
		this.npoaQty = npoaQty;
	}
	public Integer getT1Qty() {
		return t1Qty;
	}
	public void setT1Qty(Integer t1Qty) {
		this.t1Qty = t1Qty;
	}
	public Integer getPledgedQty() {
		return pledgedQty;
	}
	public void setPledgedQty(Integer pledgedQty) {
		this.pledgedQty = pledgedQty;
	}
	public Integer getT1Nonpoa() {
		return t1Nonpoa;
	}
	public void setT1Nonpoa(Integer t1Nonpoa) {
		this.t1Nonpoa = t1Nonpoa;
	}
	public StockHoldings(Long id, String exchange, String instrument, Integer qty, Integer salable, Double avgCost,
			Double invVal, Double ltp, Double curVal, Double pAndL, Double netChange, String dayChange, Integer npoaQty,
			Integer t1Qty, Integer pledgedQty, Integer t1Nonpoa) {
		super();
		this.id = id;
		this.exchange = exchange;
		this.instrument = instrument;
		this.qty = qty;
		this.salable = salable;
		this.avgCost = avgCost;
		this.invVal = invVal;
		this.ltp = ltp;
		this.curVal = curVal;
		this.pAndL = pAndL;
		this.netChange = netChange;
		this.dayChange = dayChange;
		this.npoaQty = npoaQty;
		this.t1Qty = t1Qty;
		this.pledgedQty = pledgedQty;
		this.t1Nonpoa = t1Nonpoa;
	}
    
    public StockHoldings() {
		// TODO Auto-generated constructor stub
	}

}
