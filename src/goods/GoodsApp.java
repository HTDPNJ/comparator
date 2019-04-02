package goods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp
{
    public static void main(String[] args)
    {
        List<Goods>list=new ArrayList<Goods>();
        list.add(new Goods("1",5000,200));
        list.add(new Goods("2",4000,100));
        list.add(new Goods("3",6000,300));
        System.out.println("排序前："+list);
        Collections.sort(list,new GoodsPriceComp());
        System.out.println("排序后："+list);
    }
}
