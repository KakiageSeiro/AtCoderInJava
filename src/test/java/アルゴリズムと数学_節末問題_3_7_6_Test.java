import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class アルゴリズムと数学_節末問題_3_7_6_Test {
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
        アルゴリズムと数学_節末問題_3_7_6.main();
    }

    @Test
    public void 入力例1() {

        in.inputln("5");
        in.inputln("2 5 3 3 1");

        targetRun();

        Assert.assertThat(out.readLine(), is("8"));
    }

    @Test
    public void 入力例99() {

        in.inputln("3 10");
        in.inputln("4 1 5");

        targetRun();

        Assert.assertThat(out.readLine(), is("Yes"));
    }





}







