import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC079C_TrainTicketTest {
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

    // テスト対象
    private void targetRun() {
        ABC079C_TrainTicket.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("1222");

        targetRun();

        Assert.assertThat(out.readLine(), is("1+2+2+2=7"));
    }


    @Test
    public void 入力例2() {

        in.inputln("0290");

        targetRun();

        Assert.assertThat(out.readLine(), is("0-2+9+0=7"));
    }

    @Test
    public void 入力例3() {

        in.inputln("3242");

        targetRun();

        Assert.assertThat(out.readLine(), is("3+2+4-2=7"));
    }

}







