package com.calculator.model;



public class LogicalOperations {

	
	private boolean formerLessThanLater;
	private boolean formerGreaterThanLater;
	private boolean formerEqualLater;
	
	public LogicalOperations() {
		
	}
	
	public LogicalOperations(boolean formerLessThanLater, boolean formerGreaterThanLater, boolean formerEqualLater) {
		super();
		this.formerLessThanLater = formerLessThanLater;
		this.formerGreaterThanLater = formerGreaterThanLater;
		this.formerEqualLater = formerEqualLater;
	}

	public boolean isFormerLessThanLater() {
		return formerLessThanLater;
	}

	public void setFormerLessThanLater(boolean formerLessThanLater) {
		this.formerLessThanLater = formerLessThanLater;
	}

	public boolean isFormerGreaterThanLater() {
		return formerGreaterThanLater;
	}

	public void setFormerGreaterThanLater(boolean formerGreaterThanLater) {
		this.formerGreaterThanLater = formerGreaterThanLater;
	}

	public boolean isFormerEqualLater() {
		return formerEqualLater;
	}

	public void setFormerEqualLater(boolean formerEqualLater) {
		this.formerEqualLater = formerEqualLater;
	}
	
	
	
}
