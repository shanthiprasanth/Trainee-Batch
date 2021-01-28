package com.css.corejava.main;

import java.util.Arrays;

public class Batch {
	private String batchCode;
	private String startDate;
	private String endDate;
	private Traniee[] traniees;

	// constructor
	public Batch(String batchCode, String startDate, String endDate, Traniee[] traniee) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.traniees = traniee;
	}

	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	// setters and getters
	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Traniee[] getTraniee() {
		return traniees;
	}

	public void setTraniee(Traniee[] traniee) {
		this.traniees = traniee;
	}

	public Traniee[] getTraniee(int age) {
		Traniee[] foundTraniees = new Traniee[3];
		int i = 0;
		for (Traniee traniee : traniees) {
			int shan = traniee.getAge();
			if (shan == age) {
				foundTraniees[i] = traniee;
				i++;
			}
		}	
		return foundTraniees;
	}

	public Traniee[] getTraniee(String gender) {
		Traniee[] foundTraniees = new Traniee[3];
		int i = 0;
		for (Traniee traniee : traniees) {
			String gen = traniee.getGender();
			if (gen.equals(gender)) {
				foundTraniees[i] = traniee;
				i++;
			}
		}
		return foundTraniees;
	}

	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", traniee="
				+ Arrays.toString(traniees) + "]";
	}
}
