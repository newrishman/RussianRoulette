package Roulette;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class AllPrintTest {

    private ByteArrayOutputStream out;
    private AllText allText;
    private AllPrint sub;

    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        final PrintStream printStr = new PrintStream(out);
        allText = Mockito.mock(AllText.class);

        sub = new AllPrint(printStr, allText);
    }

    private String getMessage() {
        return new String(out.toByteArray());
    }

    @Test
    public void testAllFor1() {

        Mockito.when(allText.introduction()).thenReturn("introduction msg");

        sub.all(1);

        String msg = getMessage();
        assertEquals("Должно выводиться сообщение introduction", "introduction msg\n", msg);
    }
}