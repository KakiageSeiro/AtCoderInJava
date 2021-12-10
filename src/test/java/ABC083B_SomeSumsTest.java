import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC083B_SomeSumsTest {
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

        in.inputln("20 2 5");

        ABC083B_SomeSums.main(null);

        Assert.assertThat(out.readLine(), is("84"));
    }

    @Test
    public void 入力例2() {

        in.inputln("10 1 2");

        ABC083B_SomeSums.main(null);

        Assert.assertThat(out.readLine(), is("13"));
    }

    @Test
    public void 入力例3() {

        in.inputln("100 4 16");

        ABC083B_SomeSums.main(null);

        Assert.assertThat(out.readLine(), is("4554"));
    }
}