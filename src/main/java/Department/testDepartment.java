package Department;
import org.example.Employee;

import java.io.*;

public class testDepartment {
    public static void main(String[] args) {
        Employee[]employee=new Employee[10];
        Department[]departments=new Department[10];
        try {
            BufferedWriter writer =new BufferedWriter(new FileWriter("Departments.txt"));
            Employee emp ;
            Department dep;
            for(int i =0;i<10;i++)
            {
                emp=new Employee();
                dep=new Department();
                emp.setID(i+1);
                emp.setName("name");
                emp.setSalary((i+1)*1000);
                dep.setId((i+1)*100);
                dep.setName("name");
                employee[i]=emp;
                departments[i]=dep;
                writer.write(employee[i].toString()+" "+departments[i].toString());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader =new BufferedReader(new FileReader("Departments.txt"));
            for(int i=0;i<10;i++)
            {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
