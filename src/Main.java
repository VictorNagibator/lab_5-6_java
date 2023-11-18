public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
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

        Laptop laptop = new Laptop("Asus");
        Laptop t = (Laptop)laptop.clone(); //пример глубокого копирования
        laptop.setCPU(new CPU("Intel"));
        System.out.println(laptop);
        System.out.println(t);
    }
}