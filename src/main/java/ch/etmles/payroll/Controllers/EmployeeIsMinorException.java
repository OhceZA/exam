package ch.etmles.payroll.Controllers;

public class EmployeeIsMinorException extends RuntimeException {

    EmployeeIsMinorException(String name) {
        super("Hiring a minor employee is not legally possible : Name of employee : " + name);
    }
}

