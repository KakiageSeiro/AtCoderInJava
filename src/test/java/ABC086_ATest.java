import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC086_ATest {
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

    // 偶数
    @Test
    public void main01() {

        in.inputln("1");
        in.inputln("2");

        ABC086_A.main(null);

        Assert.assertThat(out.readLine(), is("Even"));
    }

    // 奇数
    @Test
    public void main02() {

        in.inputln("7");
        in.inputln("3");

        ABC086_A.main(null);

        Assert.assertThat(out.readLine(), is("Odd"));
    }
}