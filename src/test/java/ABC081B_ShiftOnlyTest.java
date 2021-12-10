import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC081B_ShiftOnlyTest {
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

        in.inputln("3");
        in.inputln("8 12 40");

        ABC081B_ShiftOnly.main(null);

        Assert.assertThat(out.readLine(), is("2"));
    }

    @Test
    public void 入力例2() {

        in.inputln("4");
        in.inputln("5 6 8 10");

        ABC081B_ShiftOnly.main(null);

        Assert.assertThat(out.readLine(), is("0"));
    }

    @Test
    public void 入力例3() {

        in.inputln("6");
        in.inputln("382253568 723152896 37802240 379425024 404894720 471526144");

        ABC081B_ShiftOnly.main(null);

        Assert.assertThat(out.readLine(), is("8"));
    }
}