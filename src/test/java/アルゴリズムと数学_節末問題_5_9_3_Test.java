import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class アルゴリズムと数学_節末問題_5_9_3_Test {
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
        アルゴリズムと数学_節末問題_5_9_3.main();
    }

    @Test
    public void 入力例1() {

        in.inputln("3");
        in.inputln("123 86399");
        in.inputln("1 86400");
        in.inputln("86399 86400");

        targetRun();

        Assert.assertThat(out.readLine(), is("2"));
    }


}







