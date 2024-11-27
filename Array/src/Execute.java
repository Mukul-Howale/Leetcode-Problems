import interfaces.ArrayInterface;

import java.util.ServiceLoader;

public class Execute {
    public void start() {
        ServiceLoader<ArrayInterface> loader = ServiceLoader.load(ArrayInterface.class);
        for (ArrayInterface implClass : loader) {
            System.out.println(implClass.getClass().getSimpleName());
        }
    }
}
