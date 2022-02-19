import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class アルゴリズムと数学_節末問題_5_5_2_Test {
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
        アルゴリズムと数学_節末問題_5_5_2.main();
    }

    @Test
    public void 入力例2() {
        in.inputln("2");
        in.inputln("1 3 3");
        in.inputln("3 1 3");
        targetRun();
        Assert.assertThat(out.readLine(), is("1.5"));
    }



}







