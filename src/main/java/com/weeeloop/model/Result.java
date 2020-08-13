package com.weeeloop.model;

public class Result {
	
	
	OPTIONS action;
	
	
	public OPTIONS getAction() {
		return action;
	}


	public void setAction(OPTIONS action) {
		this.action = action;
	}


	public enum OPTIONS {
		RECYCLE,REPAIR,DONATE,RESELL
	}

}
