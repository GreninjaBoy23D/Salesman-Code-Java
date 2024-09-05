public class Salesman
{
    public String name;
    public int sales;
    public Salesman(String n, int sales)
    {
        this.name = n;
        this.sales = sales;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String display()
    {
        return this.name + ": " + this.sales;
    }
    public static Salesman[] topFive(Salesman[] rev)
    {
        int measure = 0;
        Salesman[] fiveOne = new Salesman[5];
        for (int i = 0; i < rev.length; i++)
        {
            Salesman current = rev[i];
            for (int j = 0; j < 5; j++)
            {
                Salesman temp = fiveOne[j];
                if(temp == null)
                {
                    fiveOne[j] = current;
                    current = temp;
                }
                else{
                    if(current.sales > temp.sales)
                    {
                        fiveOne[j] = current;
                        current = temp;
                    }
                }
            }
        measure++; 
        }
        return fiveOne;
    }
}