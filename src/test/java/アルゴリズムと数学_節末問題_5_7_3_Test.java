import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class アルゴリズムと数学_節末問題_5_7_3_Test {
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
        アルゴリズムと数学_節末問題_5_7_3.main();
    }

    @Test
    public void 入力例1() {

        in.inputln("3");
        in.inputln("5 1 2");;

        targetRun();

        Assert.assertThat(out.readLine(), is("8"));
    }

    @Test
    public void 入力例2() {

        in.inputln("5");
        in.inputln("31 41 59 26 53");

        targetRun();

        Assert.assertThat(out.readLine(), is("176"));
    }

}







