package goods;

import java.util.Comparator;

public class GoodsPriceComp implements Comparator<Goods>{
    @Override
    public int compare(Goods o1, Goods o2)
    {
        double result= o1.getPrice()-o2.getPrice();
        int ans=0;
        if(result<0){
            ans=-1;
        }else if(result>0){
            ans=1;
        }
        return ans;
    }
}
