public class Main
{
    public static void main(String[] args)
    {
//        Film module = new Film("BackEnd", "Novi", "01-01-2025","education");
//
//        System.out.println(module.toString());

        Store appie = new Store("-", "-", 0, 0);
        appie.increaseProduct("cola", 520);
        appie.amountInTheStore("cola");
        appie.decreaseProduct("cola", 340);
        appie.amountInTheStore("cola");

    }
}
