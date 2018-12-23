# cityofchicagoemployeedata
My API consumes Chicago of Chicago data. The API is deployed to the cloud via Heroku.
Get All Employees:
https://cityofchicagodata.herokuapp.com/employees

[
    {
        "job_titles": "SERGEANT",
        "full_or_part_time": "F",
        "name": "AARON,  JEFFERY M",
        "annual_salary": "101442.00",
        "salary_or_hourly": "Salary",
        "department": "POLICE"
    },
    {
        "job_titles": "POLICE OFFICER (ASSIGNED AS DETECTIVE)",
        "full_or_part_time": "F",
        "name": "AARON,  KARINA ",
        "annual_salary": "94122.00",
        "salary_or_hourly": "Salary",
        "department": "POLICE"
    },
    {
        "job_titles": "CHIEF CONTRACT EXPEDITER",
        "full_or_part_time": "F",
        "name": "AARON,  KIMBERLEI R",
        "annual_salary": "101592.00",
        "salary_or_hourly": "Salary",
        "department": "GENERAL SERVICES"
    },
    {
        "job_titles": "CIVIL ENGINEER IV",
        "full_or_part_time": "F",
        "name": "ABAD JR,  VICENTE M",
        "annual_salary": "110064.00",
        "salary_or_hourly": "Salary",
        "department": "WATER MGMNT"
    },
    {
        "job_titles": "TRAFFIC CONTROL AIDE-HOURLY",
        "full_or_part_time": "P",
        "name": "ABASCAL,  REECE E",
        "annual_salary": null,
        "salary_or_hourly": "Hourly",
        "department": "OEMC"
    },
    {
        "job_titles": "STAFF ASST TO THE ALDERMAN",
        "full_or_part_time": "F",
        "name": "ABBASI,  CHRISTOPHER ",
        "annual_salary": "50436.00",
        "salary_or_hourly": "Salary",
        "department": "CITY COUNCIL"
    },
    {
        "job_titles": "ELECTRICAL MECHANIC",
        "full_or_part_time": "F",
        "name": "ABBATACOLA,  ROBERT J",
        "annual_salary": null,
        "salary_or_hourly": "Hourly",
        "department": "AVIATION"
    },
    {
        "job_titles": "POOL MOTOR TRUCK DRIVER",
        "full_or_part_time": "F",
        "name": "ABBATE,  JOSEPH L ",
        "annual_salary": null,
        "salary_or_hourly": "Hourly",
        "department": "STREETS & SAN"
    },
    {
        "job_titles": "FIRE ENGINEER-EMT",
        "full_or_part_time": "F",
        "name": "ABBATEMARCO,  JAMES J",
        "annual_salary": "103350.00",
        "salary_or_hourly": "Salary",
        "department": "FIRE"
    },
    {
        "job_titles": "POLICE OFFICER",
        "full_or_part_time": "F",
        "name": "ABBATE,  TERRY M",
        "annual_salary": "93354.00",
        "salary_or_hourly": "Salary",
        "department": "POLICE"
    },
    {
        "job_titles": "FOSTER GRANDPARENT",
        "full_or_part_time": "P",
        "name": "ABBOTT,  BETTY L",
        "annual_salary": null,
        "salary_or_hourly": "Hourly",
        "department": "FAMILY & SUPPORT"
    },
    {
        "job_titles": "POLICE OFFICER",
        "full_or_part_time": "F",
        "name": "ABDALLAH,  ZAID ",
        "annual_salary": "84054.00",
        "salary_or_hourly": "Salary",
        "department": "POLICE"
    },
    {
        "job_titles": "POLICE OFFICER",
        "full_or_part_time": "F",
        "name": "ABDELHADI,  ABDALMAHD ",
        "annual_salary": "87006.00",
        "salary_or_hourly": "Salary",
        "department": "POLICE"
    },
    {
        "job_titles": "FIREFIGHTER (PER ARBITRATORS AWARD)-PARAMEDIC",
        "full_or_part_time": "F",
        "name": "ABDELLATIF,  AREF R",
        "annual_salary": "102228.00",
        "salary_or_hourly": "Salary",
        "department": "FIRE"
    },
    {
        "job_titles": "POLICE OFFICER",
        "full_or_part_time": "F",
        "name": "ABDELMAJEID,  AZIZ ",
        "annual_salary": "84054.00",
        "salary_or_hourly": "Salary",
        "department": "POLICE"
    },....and so forth]


Get A Employee-this returns the first employee, 2 will return second and so forth
https://cityofchicagodata.herokuapp.com/employee/1
{
    "job_titles": "POLICE OFFICER (ASSIGNED AS DETECTIVE)",
    "full_or_part_time": "F",
    "name": "AARON,  KARINA ",
    "annual_salary": "94122.00",
    "salary_or_hourly": "Salary",
    "department": "POLICE"
}


In the future, I will save this data to a Mongo Collection and provide more specific queries.
