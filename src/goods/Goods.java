package goods;

public class Goods
{
    private String name;
    private int fav;
    private double price;

    public Goods(String name, int fav, double price)
    {
        this.name = name;
        this.fav = fav;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getFav()
    {
        return fav;
    }

    public void setFav(int fav)
    {
        this.fav = fav;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Goods{" + "name='" + name + '\'' + ", fav=" + fav + ", price=" + price + '}';
    }
}
