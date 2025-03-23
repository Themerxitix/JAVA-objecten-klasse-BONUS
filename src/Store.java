public class Store
{
    private String cola;
    private String candles;
    private int amountCola;
    private int amountCandles;


    public Store(String cola, String candles, int amountCola, int amountCandles) {
        this.cola = cola;
        this.candles = candles;
        this.amountCola = amountCola;
        this.amountCandles = amountCandles;
    }

    //producten toevoegen
    public void increaseProduct(String product,int amount)
    {
        //controleer welke amount je wilt toevoegen
        if(product == "cola")
        {
            amountCola += amount;
        }
        else
        {
            amountCandles += amount;
        }

    }

    //voorraad te controleren, print de hoeveelheid die er is
    public void amountInTheStore(String name)
    {
        if (name == "cola")
        {
            System.out.println("De cola voorraad is : " + amountCola + "\n");
        }
        else
        {
            System.out.println("De candles voorraad is : " + amountCandles + "\n");
        }

    }
    //verkoop producten
    public void decreaseProduct(String product,int amount)
    {
        //controleer welke amount je wilt toevoegen
        if(product == "cola")
        {
            amountCola -= amount;
        }
        else
        {
            amountCandles -= amount;
        }

    }
}
