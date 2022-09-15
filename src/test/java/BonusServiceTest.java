import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {

    @ParameterizedTest
//    @CsvSource({
//    })
    @CsvFileSource(files="src/test/resources/bonus.csv")

    public void test(int expected, int amount, boolean isRegistered) {  // простая функция, которая ничего не принимает и ничего не возвращает // потом переносим в нее параметры из переменных

// переносим логику из Main

        BonusService service = new BonusService(); // обьект
              //изменяющиеся переменные мы перенесли в параметры (в public void test)
              //  int expected = 150;
        int actual = service.calcBonus(amount, isRegistered);
              //  System.out.println("1. " + expected + "==//==" + actual);  // нас не устраивает вывод на экран для просмотра глазами

        Assertions.assertEquals(expected, actual);  // проверка соответствия ожидаемого и фактического результата
    }
//
//    @Test
//
//    public void testUnRegUnderLimit() {
//        BonusService service = new BonusService(); // обьект
//        int expected = 50;
//        int actual = service.calcBonus(5000, false);
//        //System.out.println("2. " + expected + "==//==" + actual);
//        Assertions.assertEquals(expected, actual);
//    }

}
