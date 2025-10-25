package com.ashwani.connectionjdbc.ashwani.logic_Building;
@FunctionalInterface
interface Worker
{
    void work();
}
public class MethodReferenceDemo1 {




        public static void main(String[] args)
        {
            Worker w = Employee::salary;
            w.work();

        }

    }

    class Employee
    {
        public static void salary()
        {
            System.out.println("Employee is working for Salary");
        }
    }
}
