package TreeSet;

import java.util.TreeSet;

public class TreeSetDemo2
{
    public static void main(String[] args)
    {
        Worker w1=new Worker("lj",12000);
        Worker w2=new Worker("lg",8000);
        Worker w3=new Worker("cy",5000);
        TreeSet<Worker> employees=new TreeSet<Worker>();
        employees.add(w1);
        employees.add(w2);
        employees.add(w3);
        System.out.println(employees);
    }
}
