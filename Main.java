public class Main {

    public static  void main(String[] args)
    {
        for (int i=0; i<8; i++)
        {

            myThread object = new myThread();
            object.start();
        }
    }
}
