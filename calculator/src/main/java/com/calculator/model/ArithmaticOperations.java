package com.calculator.model;

public class ArithmaticOperations {

	private double multipliedResult;
	private double addedResult;
	private double subtrtactedResult;
	private double exponentResult_former_later;
	private double exponentResult_later_former;
	
	private double divisionResult_former_later;
	private double divisionResult_later_former;
	
	
	public ArithmaticOperations() {
		
	}
	
	public ArithmaticOperations(double multipliedResult, double addedResult, double subtrtactedResult,
			double exponentResult_former_later, double exponentResult_later_former, double divisionResult_former_later,
			double divisionResult_later_former) {
		super();
		this.multipliedResult = multipliedResult;
		this.addedResult = addedResult;
		this.subtrtactedResult = subtrtactedResult;
		this.exponentResult_former_later = exponentResult_former_later;
		this.exponentResult_later_former = exponentResult_later_former;
		this.divisionResult_former_later = divisionResult_former_later;
		this.divisionResult_later_former = divisionResult_later_former;
	}

	public double getMultipliedResult() {
		return multipliedResult;
	}

	public void setMultipliedResult(double multipliedResult) {
		this.multipliedResult = multipliedResult;
	}

	public double getAddedResult() {
		return addedResult;
	}

	public void setAddedResult(double addedResult) {
		this.addedResult = addedResult;
	}

	public double getSubtrtactedResult() {
		return subtrtactedResult;
	}

	public void setSubtrtactedResult(double subtrtactedResult) {
		this.subtrtactedResult = subtrtactedResult;
	}

	public double getExponentResult_former_later() {
		return exponentResult_former_later;
	}

	public void setExponentResult_former_later(double exponentResult_former_later) {
		this.exponentResult_former_later = exponentResult_former_later;
	}

	public double getExponentResult_later_former() {
		return exponentResult_later_former;
	}

	public void setExponentResult_later_former(double exponentResult_later_former) {
		this.exponentResult_later_former = exponentResult_later_former;
	}

	public double getDivisionResult_former_later() {
		return divisionResult_former_later;
	}

	public void setDivisionResult_former_later(double divisionResult_former_later) {
		this.divisionResult_former_later = divisionResult_former_later;
	}

	public double getDivisionResult_later_former() {
		return divisionResult_later_former;
	}

	public void setDivisionResult_later_former(double divisionResult_later_former) {
		this.divisionResult_later_former = divisionResult_later_former;
	}
	
	
	
	
	
	
}
