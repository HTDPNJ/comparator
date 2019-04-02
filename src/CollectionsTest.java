import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("abcd");
        list.add("abc");
        list.add("def");
        Collections.sort(list,new StringComp());
        System.out.println(list);
    }
}
