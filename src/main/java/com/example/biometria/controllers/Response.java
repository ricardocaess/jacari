package com.example.biometria.controllers;


public class Response {

    
    private Integer serviceResultCode;
    private String serviceResultLog;
    private String serviceTime;
    private String serviceTransactionId;
    private Float serviceLivenessResult;
	public Integer getServiceResultCode() {
		return serviceResultCode;
	}
	public void setServiceResultCode(Integer serviceResultCode) {
		this.serviceResultCode = serviceResultCode;
	}
	public String getServiceResultLog() {
		return serviceResultLog;
	}
	public void setServiceResultLog(String serviceResultLog) {
		this.serviceResultLog = serviceResultLog;
	}
	public String getServiceTime() {
		return serviceTime;
	}
	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}
	public String getServiceTransactionId() {
		return serviceTransactionId;
	}
	public void setServiceTransactionId(String serviceTransactionId) {
		this.serviceTransactionId = serviceTransactionId;
	}
	public Float getServiceLivenessResult() {
		return serviceLivenessResult;
	}
	public void setServiceLivenessResult(Float serviceLivenessResult) {
		this.serviceLivenessResult = serviceLivenessResult;
	}

   

     

}
