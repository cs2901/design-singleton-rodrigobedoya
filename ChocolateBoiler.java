public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    private static Object mutex = new Object();
    private static ChocolateBoiler instance;

    public static ChocolateBoiler getInstance() {
        ChocolateBoiler result = instance;
        if (result == null){
            synchronized (mutex){
                result = instance;
                if(result== null)
                {
                    instance = new ChocolateBoiler();
                    System.out.println("Created Thread");
                }
            }
        }
        else {
            System.out.println("Returned Thread");
        }

        return instance;
    }




    private void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    private void drain(){
        if(isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    private void boil(){
        if(!isEmpty() && isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }

    private boolean isEmpty(){
        return empty;
    }

    private boolean isBoiled(){
        return boiled;
    }

}
