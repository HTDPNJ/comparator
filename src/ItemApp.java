import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ItemApp
{
    public static void main(String[] args)
    {
        List<NewsItem> news=new ArrayList<NewsItem>();
        news.add(new NewsItem("ZC",100,new Date()));
        news.add(new NewsItem("Zz",200,new Date(System.currentTimeMillis()-10*60)));
        news.add(new NewsItem("Za",200,new Date(System.currentTimeMillis()-10)));
        System.out.println("排序前："+news);
        Collections.sort(news);
    }
}
