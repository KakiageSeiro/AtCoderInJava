import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC055B_TrainingCampTest {
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
        ABC055B_TrainingCamp.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("3");

        targetRun();

        Assert.assertThat(out.readLine(), is("6"));
    }


    @Test
    public void 入力例2() {

        in.inputln("10");

        targetRun();

        Assert.assertThat(out.readLine(), is("3628800"));
    }

    @Test
    public void 入力例3() {

        in.inputln("100000");

        targetRun();

        Assert.assertThat(out.readLine(), is("457992974"));
    }
}







