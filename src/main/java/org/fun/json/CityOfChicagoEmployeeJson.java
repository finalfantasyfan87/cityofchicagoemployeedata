package org.fun.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jenny on 12/22/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CityOfChicagoEmployeeJson {
    private Double annual_salary;
    private String department;
    private String full_or_part_time;
    private String job_titles;
    private String name;
    private String salary_or_hourly;

    public Double getAnnual_salary() {
        return annual_salary;
    }

    public void setAnnual_salary(Double annual_salary) {
        this.annual_salary = annual_salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFull_or_part_time() {
        return full_or_part_time;
    }

    public void setFull_or_part_time(String full_or_part_time) {
        this.full_or_part_time = full_or_part_time;
    }

    public String getJob_titles() {
        return job_titles;
    }

    public void setJob_titles(String job_titles) {
        this.job_titles = job_titles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary_or_hourly() {
        return salary_or_hourly;
    }

    public void setSalary_or_hourly(String salary_or_hourly) {
        this.salary_or_hourly = salary_or_hourly;
    }
    @Override
    public String toString() {
        return "CityOfChicagoEmployeeJson{" +
                ", annual_salary='" + annual_salary + '\'' +
                ", department='" + department + '\'' +
                ", full_or_part_time='" + full_or_part_time + '\'' +
                ", job_titles='" + job_titles + '\'' +
                ", name='" + name + '\'' +
                ", salary_or_hourly='" + salary_or_hourly + '\'' +
                '}';
    }
}
