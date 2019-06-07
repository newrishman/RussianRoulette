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

        // Вызываю метод класса
        superSeriouslyClass.start(1, 1);

        // Дописал от отчаяния
        doNothing().when( classicMock ).singlePlayer();

        // Проверяю, был ли вызван метод заглушки
        verify(classicMock, times(1)).singlePlayer();

        // Получаю тест Шредингера, он просто пытается завершить метод SinglePlayer класса Classic

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