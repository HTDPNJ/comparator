package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args)
    {
        Person p1=new Person("你",100);
        Person p2=new Person("刘德华",1000);
        Person p3=new Person("梁朝伟",1200);
        Person p4=new Person("old",50);
        TreeSet<Person> persons=new TreeSet<Person>(new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return o1.getHandSome()-o2.getHandSome();
            }
        });
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        System.out.println(persons);

    }
}
