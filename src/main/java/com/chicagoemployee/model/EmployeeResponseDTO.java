package com.chicagoemployee.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
@Document(collection = "cityChicagoEmp")
public class EmployeeResponseDTO implements Serializable {
	@Id
	String id;

	@JsonProperty("job_titles")
	private String jobTitles;

	@JsonProperty("full_or_part_time")
	private String fullOrPartTime;

	@JsonProperty("name")
	private String name;

	@JsonProperty("annual_salary")
	private String annualSalary;

	@JsonProperty("salary_or_hourly")
	private String salaryOrHourly;

	@JsonProperty("department")
	private String department;

	public void setJobTitles(String jobTitles){
		this.jobTitles = jobTitles;
	}

	public String getJobTitles(){
		return jobTitles;
	}

	public void setFullOrPartTime(String fullOrPartTime){
		this.fullOrPartTime = fullOrPartTime;
	}

	public String getFullOrPartTime(){
		return fullOrPartTime;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAnnualSalary(String annualSalary){
		this.annualSalary = annualSalary;
	}

	public String getAnnualSalary(){
		return annualSalary;
	}

	public void setSalaryOrHourly(String salaryOrHourly){
		this.salaryOrHourly = salaryOrHourly;
	}

	public String getSalaryOrHourly(){
		return salaryOrHourly;
	}

	public void setDepartment(String department){
		this.department = department;
	}

	public String getDepartment(){
		return department;
	}

	@Override
 	public String toString(){
		return 
			"EmployeeResponseDTO{" + 
			"job_titles = '" + jobTitles + '\'' + 
			",full_or_part_time = '" + fullOrPartTime + '\'' + 
			",name = '" + name + '\'' + 
			",annual_salary = '" + annualSalary + '\'' + 
			",salary_or_hourly = '" + salaryOrHourly + '\'' + 
			",department = '" + department + '\'' + 
			"}";
		}
}