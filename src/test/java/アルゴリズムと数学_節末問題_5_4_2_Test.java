import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class アルゴリズムと数学_節末問題_5_4_2_Test {
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
        アルゴリズムと数学_節末問題_5_4_2.main();
    }

    @Test
    public void 入力例2() {
        in.inputln("4 4");
        in.inputln("3 1 4 1");
        in.inputln("5 9 2 6");
        in.inputln("5 3 5 8");
        in.inputln("9 7 9 3");
        targetRun();
        Assert.assertThat(out.readLine(), is("28 28 25 26"));
        Assert.assertThat(out.readLine(), is("39 33 40 34"));
        Assert.assertThat(out.readLine(), is("38 38 36 31"));
        Assert.assertThat(out.readLine(), is("41 41 39 43"));
    }



}







