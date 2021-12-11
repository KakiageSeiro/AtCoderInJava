package AtCoderBeginnerContest231;

import AtCoderBeginnerContest231.D_Neighbors;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class D_NeighborsTest {
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
        D_Neighbors.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("4 2");
        in.inputln("1 3");

        targetRun();

        Assert.assertThat(out.readLine(), is("Yes"));
    }


    @Test
    public void 入力例2() {

        in.inputln("4 3");
        in.inputln("1 4");
        in.inputln("2 4");
        in.inputln("3 4");

        targetRun();

        Assert.assertThat(out.readLine(), is("No"));
    }

}