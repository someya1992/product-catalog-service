package com.weeeloop.model;

public class MobileRuleParameters {

	MOBILEBRAND brand;
	MOBILEAGE mobileAge;
	DAMAGE damage;
	OPTICALCONDITION opticalCondition;
	SIMLOCK simLock;
	OPTIONS result;
	
	public MOBILEBRAND getBrand() {
		return brand;
	}

	public void setBrand(MOBILEBRAND brand) {
		this.brand = brand;
	}

	public MOBILEAGE getMobileAge() {
		return mobileAge;
	}

	public void setMobileAge(MOBILEAGE mobileAge) {
		this.mobileAge = mobileAge;
	}

	public DAMAGE getDamage() {
		return damage;
	}

	public void setDamage(DAMAGE damage) {
		this.damage = damage;
	}

	public OPTICALCONDITION getOpticalCondition() {
		return opticalCondition;
	}

	public void setOpticalCondition(OPTICALCONDITION opticalCondition) {
		this.opticalCondition = opticalCondition;
	}

	public SIMLOCK getSimLock() {
		return simLock;
	}

	public void setSimLock(SIMLOCK simLock) {
		this.simLock = simLock;
	}

	

	public OPTIONS getResult() {
		return result;
	}

	public void setResult(OPTIONS result) {
		this.result = result;
	}



	public enum MOBILEBRAND {
		YES, NO
	}

	public enum MOBILEAGE {
		NEW, OLD
	}

	public enum DAMAGE {
		NO, YES
	}

	public enum OPTICALCONDITION {
		NEW, OLD
	}

	public enum SIMLOCK {
		YES, NO
	}
	
	public enum OPTIONS {
		RECYCLE,REPAIR,DONATE,RESELL
	}
}
