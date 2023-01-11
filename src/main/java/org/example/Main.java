package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"));
            Employee emp;
            for(int i=0;i<10;i++)
            {
                emp =new Employee();
                emp.setID(i+1);
                emp.setName("name");
                emp.setSalary((i+1)*1000);
                employees[i]=emp;
                writer.write(employees[i].toString()+"\n");

            }
            writer.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("employees.txt"));
            for(int i=0;i<10;i++)
            {
                System.out.println(reader.readLine());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}