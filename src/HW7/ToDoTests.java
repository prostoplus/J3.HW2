package HW7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ToDoTests {
    public static void main(String[] args) {
        start(TestClass.class);
    }

    public static void start(Class cls) {
        int maxPriority = 10, minPriority = 1;
        Method[] methods = cls.getDeclaredMethods();
        List<Method> list = new ArrayList<>();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Test.class)) {
                int priority = m.getAnnotation(Test.class).priority();
                if (priority > maxPriority || priority < minPriority) {
                    throw new RuntimeException("Not allowed, priority exception!");
                }
                list.add(m);
            }
        }
        list.sort((o1, o2) -> o2.getAnnotation(Test.class).priority() - o1.getAnnotation(Test.class).priority());
        for (Method m : methods) {
            if (m.isAnnotationPresent(BeforeSuite.class)) {
                if (list.get(0).isAnnotationPresent(BeforeSuite.class)) {
                    throw new RuntimeException("BeforeSuite already exist at first position!");
                }
                list.add(0, m);
            }
            if (m.isAnnotationPresent(AfterSuite.class)) {
                if (list.get(list.size() - 1).isAnnotationPresent(AfterSuite.class)) {
                    throw new RuntimeException("AfterSuite already exist at last position!");
                }
                list.add(m);
            }
        }
        for (Method obj : list) {
            try {
                obj.invoke(null);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

}
