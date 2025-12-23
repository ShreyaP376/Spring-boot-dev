public class Singleton {

    public static Singleton instance;
    private Singleton(){
        if(instance!= null){
            throw new RuntimeException("getInstance method not allowed");
        }
    };
    public static Singleton createObj(){
        if(instance== null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
