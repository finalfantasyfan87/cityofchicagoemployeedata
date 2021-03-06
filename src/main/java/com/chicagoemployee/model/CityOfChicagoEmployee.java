package com.chicagoemployee.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
@Document(collection = "cityChicagoEmployees")
public class CityOfChicagoEmployee implements Serializable {
	@Id
	String id;

	@JsonProperty("job_titles")
	private String jobTitle;

	@JsonProperty("full_or_part_time")
	private String fullOrPartTime;

	@JsonProperty("name")
	private String name;

	@JsonProperty("annual_salary")
	private Double  annualSalary;

	@JsonProperty("salary_or_hourly")
	private String salaryOrHourly;

	@JsonProperty("department")
	private String department;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getFullOrPartTime() {
		return fullOrPartTime;
	}

	public void setFullOrPartTime(String fullOrPartTime) {
		this.fullOrPartTime = fullOrPartTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(Double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public String getSalaryOrHourly() {
		return salaryOrHourly;
	}

	public void setSalaryOrHourly(String salaryOrHourly) {
		this.salaryOrHourly = salaryOrHourly;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "CityOfChicagoEmployee{" +
				"id='" + id + '\'' +
				", jobTitle='" + jobTitle + '\'' +
				", fullOrPartTime='" + fullOrPartTime + '\'' +
				", name='" + name + '\'' +
				", annualSalary=" + annualSalary +
				", salaryOrHourly='" + salaryOrHourly + '\'' +
				", department='" + department + '\'' +
				'}';
	}
}