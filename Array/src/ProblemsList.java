import interfaces.ArrayInterface;

import java.util.HashMap;

public class ProblemsList {
     HashMap<String, ArrayInterface> list = new HashMap<>();
     public void addProblems(ArrayInterface arrayInterface){
          list.put(arrayInterface.getClass().getName(), arrayInterface);
     }
}
