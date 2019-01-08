# cityofchicagoemployeedata
My API consumes Chicago of Chicago data regarding real City Of Chicago employees. I save the data via my API to a MongoDB collection named: cityChicagoEmployees.his collection has 1000 records of the original dataset.
I use Spring Data Mongo Repository to query my records. The API is deployed to the cloud via Heroku.

Get All Employees:
https://cityofchicagodata.herokuapp.com/employees

[
    {
        "id": "5c3406523092152048bcadd3",
        "job_titles": "SERGEANT",
        "full_or_part_time": "F",
        "name": "AARON,  JEFFERY M",
        "annual_salary": "101442.00",
        "salary_or_hourly": "Salary",
        "department": "POLICE"
    },
    {
        "id": "5c3406533092152048bcadd4",
        "job_titles": "POLICE OFFICER (ASSIGNED AS DETECTIVE)",
        "full_or_part_time": "F",
        "name": "AARON,  KARINA ",
        "annual_salary": "94122.00",
        "salary_or_hourly": "Salary",
        "department": "POLICE"
    }...]

Get A Employee-this returns a single employee
https://cityofchicagodata.herokuapp.com/employee/5c3406843092152048bcb189
{
    "id": "5c3406843092152048bcb189",
    "job_titles": "ASST TO THE COMMISSIONER",
    "full_or_part_time": "F",
    "name": "ARCHILLA,  IRIS G",
    "annual_salary": "70620.00",
    "salary_or_hourly": "Salary",
    "department": "HUMAN RELATIONS"
}

https://cityofchicagodata.herokuapp.com/employees/containsName/CHRIST
https://cityofchicagodata.herokuapp.com/employees/greaterThanSalary/60000
https://cityofchicagodata.herokuapp.com/employees/lessThanSalary/60000

