import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC081A_PlacingMarblesTest {
    private final StandardInputStream in = new StandardInputStream();
    private final StandardOutputStream out = new StandardOutputStream();

    @Before
    public void before() {
        System.setIn(in);
        System.setOut(out);
    }

    @After
    public void after() {
        System.setIn(null);
        System.setOut(null);
    }

    @Test
    public void カウント対象が存在する() {

        in.inputln("101");

        ABC081A_PlacingMarbles.main(null);

        Assert.assertThat(out.readLine(), is("2"));
    }

    @Test
    public void カウント対象が存在しない() {

        in.inputln("000");

        ABC081A_PlacingMarbles.main(null);

        Assert.assertThat(out.readLine(), is("0"));
    }
}