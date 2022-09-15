public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService(); // обьект

         int bonus = service.calcBonus(5000, true);  // вызвали метод, положили в переменную результат
        // System.out.println(bonus);

        int expected = 150;
        int actual = service.calcBonus(5000, true);
        System.out.println("1. " + expected + "==//==" + actual);

        expected = 50;
        actual = service.calcBonus(5000, false);
        System.out.println("2. " + expected + "==//==" + actual);
    }
}