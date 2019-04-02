package TreeMap;

import TreeSet.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo
{
    public static void main(String[] args)
    {
        Person p1=new Person("你",100);
        Person p2=new Person("刘德华",1000);
        Person p3=new Person("梁朝伟",1200);
        Person p4=new Person("old",50);
        TreeMap<Person,String>map=new TreeMap<Person,String>(new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return o1.getHandSome()-o2.getHandSome();
            }
        });
        map.put(p1,"hello");
        map.put(p2,"hello");
        map.put(p3,"hello");
        map.put(p4,"hello");
        Set<Person> persons=map.keySet();
        System.out.println(persons);
    }
}
