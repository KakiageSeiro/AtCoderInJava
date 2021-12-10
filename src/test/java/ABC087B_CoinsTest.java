import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC087B_CoinsTest {
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
    public void 入力例1() {

        in.inputln("2");
        in.inputln("2");
        in.inputln("2");
        in.inputln("100");

        ABC087B_Coins.main(null);

        Assert.assertThat(out.readLine(), is("2"));
    }

    @Test
    public void 入力例2() {

        in.inputln("5");
        in.inputln("1");
        in.inputln("0");
        in.inputln("150");

        ABC087B_Coins.main(null);

        Assert.assertThat(out.readLine(), is("0"));
    }

    @Test
    public void 入力例3() {

        in.inputln("30");
        in.inputln("40");
        in.inputln("50");
        in.inputln("6000");

        ABC087B_Coins.main(null);

        Assert.assertThat(out.readLine(), is("213"));
    }
}