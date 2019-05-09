public class myThread extends Thread
{
    public void run()
    {
        try
        {
            ChocolateBoiler.getInstance();
        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
    }
}