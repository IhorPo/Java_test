package reflection;

import java.lang.reflect.Field;

public class FieldReflection {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            // Если знаем название нужного поля, указываем его в скобках
            // Иначе получаем масив полей:
            // getFields() - only public fields
            // getDeclaredFields() - all fields except default

            // --> Знаем нужное поле <--

            // public field
            Field fName = student.getClass().getField("name");
            // Не нужно применять fName.setAccessible(true) так как поле public
            // Получаю значение поля
            String n = (String)fName.get(student);
            System.out.println(n);

            // private field -> getDeclaredField()
            Field fAge = student.getClass().getDeclaredField("age");
            // Получаю доступ к private полю
            fAge.setAccessible(true);
            int age = (int) fAge.get(student);
            System.out.println(age);

            // changing field
            System.out.println("Changing field name");
            Field s = student.getClass().getField("name");
            s.set(student, "New name");
            String nName = (String) s.get(student);
            System.out.println(nName);

            // --> Не знаем о полях <--

            // В таком случае получаем массив полей
            // array of public fields
            System.out.println("------------------");
            Field[] pFields = student.getClass().getFields();

            for(Field f: pFields){
                Object ob = (Object) f.get(student);
                System.out.println(f.getName()+ " " +ob);
            }

            System.out.println("#########");
            // array of all fields
            Field[] aFields = student.getClass().getDeclaredFields();
            for(Field f : aFields){
                f.setAccessible(true);
                //Object ob = (Object) f.get(student);
                System.out.println(f.getType()+ "--" +f.getName() + "--" + f.get(student));
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

