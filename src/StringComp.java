import java.util.Comparator;

public class StringComp implements Comparator<String>
{
    /*排序规则的业务类*/

    @Override
    public int compare(String o1, String o2)
    { //按长度比较大小
        int  len1=o1.length();
        int len2=o2.length();
        return len1-len2;
    }
}
