package com.elempleo.certification.models;

public class ElEmpleoSearchModel {
	private String job;
	private String city;
	
	public ElEmpleoSearchModel(String job, String city){
		this.job = job;
		this.city = city;
	}
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
