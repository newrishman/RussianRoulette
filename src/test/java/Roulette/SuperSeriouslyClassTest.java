package Roulette;

import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;


public class SuperSeriouslyClassTest {

    @Test
    public void SuperSeriouslyClassTest1() throws IOException {
        Classic classicMock = mock(Classic.class);
        Again againMock = mock(Again.class);

        SuperSeriouslyClass superSeriouslyClass = new SuperSeriouslyClass(classicMock, againMock);

        superSeriouslyClass.start(1, 1);

        verify(classicMock, times(1)).singlePlayer();
    }

    @Test
    public void SuperSeriouslyClassTest2() throws IOException {
        Classic classicMock = mock(Classic.class);
        Again againMock = mock(Again.class);

        SuperSeriouslyClass superSeriouslyClass = new SuperSeriouslyClass(classicMock, againMock);

        superSeriouslyClass.start(1, 2);

        verify(classicMock, times(1)).classic();
    }

    @Test
    public void SuperSeriouslyClassTest3() throws IOException {
        Classic classicMock = mock(Classic.class);
        Again againMock = mock(Again.class);

        SuperSeriouslyClass superSeriouslyClass = new SuperSeriouslyClass(classicMock, againMock);

        superSeriouslyClass.start(2, 1);

        verify(againMock, times(1)).singlePlayer();
    }

    @Test
    public void SuperSeriouslyClassTest4() throws IOException {
        Classic classicMock = mock(Classic.class);
        Again againMock = mock(Again.class);

        SuperSeriouslyClass superSeriouslyClass = new SuperSeriouslyClass(classicMock, againMock);

        superSeriouslyClass.start(2, 2);

        verify(againMock, times(1)).classic();
    }

}