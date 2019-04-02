import java.util.Date;

public class NewsItem implements Comparable<NewsItem>
{
    private String title;
    private int hits;
    private Date date;

    public NewsItem(String title, int hits, Date date)
    {
        this.title = title;
        this.hits = hits;
        this.date = date;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getHits()
    {
        return hits;
    }

    public void setHits(int hits)
    {
        this.hits = hits;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
    //时间降序+点击量升序+标题降序
    @Override
    public int compareTo(NewsItem o)
    {
        int result=0;
        result=-this.date.compareTo(o.date);
        if(result==0){
            result=this.hits-o.hits;
            if(0==result){
                result=-this.title.compareTo(o.title);
            }
        }
        return result;
    }

    @Override
    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("标题：").append(title).append("点击率：").append(hits).append("时间：").append(date)
        .append("\n");
        return sb.toString();
    }
}
