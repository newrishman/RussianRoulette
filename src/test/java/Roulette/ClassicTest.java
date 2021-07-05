package Roulette;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClassicTest {

    private AllPrint allPrint;
    private UserBang userBang;
    private Bullet bullete;
    private Classic sub;

    @Before
    public void setUp() throws Exception {
        allPrint = mock(AllPrint.class);
        userBang = mock(UserBang.class);
        bullete = mock(Bullet.class);

        sub = new Classic(allPrint, userBang, bullete);
    }

    @Test
    public void testClassic() throws IOException {

        when(bullete.bullet()).thenReturn(new int[]{1});

        sub.singlePlayer();

    }
}