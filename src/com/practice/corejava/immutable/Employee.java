package com.practice.corejava.immutable;

//Own immutable class like String in Java
public final class Employee {

    private final String empId;

    public Employee(String empId){
        this.empId = empId;
    }

    public String getEmpId(){
        return empId;
    }
}
