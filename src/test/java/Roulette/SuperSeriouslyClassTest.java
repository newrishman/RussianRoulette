package Roulette;

import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;


public class SuperSeriouslyClassTest {

    //Попытка написать тест. V1.100500

    @Test
    public void SuperSeriouslyClassTest1() throws IOException {

        //Делаю заглушку вместо класса Classic
        Classic classicMock = mock(Classic.class);

        //Создаю объект класса SuperSeriously
        SuperSeriouslyClass superSeriouslyClass = new SuperSeriouslyClass();

        // Дописал от отчаяния. Why he doesn't work????
        doNothing().when(classicMock).singlePlayer();

        // Вызываю метод класса
        superSeriouslyClass.start(1, 1);

        // Проверяю, был ли вызван метод заглушки
        verify(classicMock, times(1)).singlePlayer();

        // Получаю тест Шредингера, он просто пытается выполнить и завершить метод singlePlayer класса Classic.
        // Я ставлю себе вопрос о том, как я буду тестировать класс:
        // при определенных значениях (пример: 1 и 1), вызывается ли метод singlePlayer у Classic?
        // Да, вызывается, и даже работает, заррраза, хотя не должен.
        // Либо лыжи не едут, либо я ... Неужели настолько говнистый код, что без конструктора не запустится тест?
        // Время 4:14 утра...

    }
/*
    @Test
    public void SuperSeriouslyClassTest2() throws IOException {
        Classic classicMock = Mockito.mock(Classic.class);
        SuperSeriouslyClass superSeriouslyClass = new SuperSeriouslyClass();
        superSeriouslyClass.start(1, 2);
        verify(classicMock).classic();
    }

   /* @Test
    public void SuperSeriouslyClassTest3() throws IOException {
        Again againMock = Mockito.mock(Again.class);
        SuperSeriouslyClass superSeriouslyClass = new SuperSeriouslyClass();
        superSeriouslyClass.start(2, 1);
        verify(againMock).singlePlayer();
    }

    @Test
    public void SuperSeriouslyClassTest4() throws IOException {
        Again againMock = Mockito.mock(Again.class);
        SuperSeriouslyClass superSeriouslyClass = new SuperSeriouslyClass();
        superSeriouslyClass.start(2, 2);
        verify(againMock).classic();
    }
*/
}