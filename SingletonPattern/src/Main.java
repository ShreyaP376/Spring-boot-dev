import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Singleton s1 = Singleton.createObj();
        //using reflection
        Constructor<Singleton> constructor =
                Singleton.class.getDeclaredConstructor();

        constructor.setAccessible(true);

        Singleton s2 = constructor.newInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
