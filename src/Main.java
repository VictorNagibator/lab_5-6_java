import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        //5-ая лабораторная
        //1. Работа с исключениями
        try {
            //пробуем создать оперативную память с отрицательным объемом
            RAM ram = new RAM("Kingston", RAMType.DDR4, 2400, -32);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //2. Работа с двумерными и одномерными массивами
        Random rand = new Random();
        Display[] displays = new Display[5];
        for (int i = 0; i < 5; i++) {
            displays[i] = new Display(rand.nextInt(2000), rand.nextInt(2000));
            System.out.println(displays[i]);
        }
        Order[][] orders = new Order[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                orders[i][j] = new Order(new Laptop());
                System.out.println(orders[i][j]);
            }

        //6-ая лабораторная
        //1. Работа с интерфейсами и классами
        OrderComponent obj = new CPU("Intel");
        System.out.println(obj);
        obj = new RAM("Patriot");
        System.out.println(obj);
        //2. Работа с шаблонами
        var order = new Order<CPU>(new CPU());
        order.input();
        var order2 = new Order<RAM>(new RAM());
        order2.input();
        //3. Глубокое и поверхностное копирование
        Laptop laptop = new Laptop("Asus");
        Laptop t = (Laptop)laptop.clone(); //пример глубокого копирования
        laptop.setCPU(new CPU("Intel"));
        System.out.println(laptop);
        System.out.println(t);
        t = laptop; //пример поверхностного копирования
        laptop.setCPU(new CPU("AMD"));
        System.out.println(laptop);
        System.out.println(t);
    }
}