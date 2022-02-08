import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class アルゴリズムと数学_節末問題_3_7_4_Test {
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
        アルゴリズムと数学_節末問題_3_7_4.main();
    }

    @Test
    public void 入力例1() {

        in.inputln("3 11");
        in.inputln("2 5 9");

        targetRun();

        Assert.assertThat(out.readLine(), is("Yes"));
    }
    
    @Test
    public void 入力例99() {

        in.inputln("3 10");
        in.inputln("4 1 5");

        targetRun();

        Assert.assertThat(out.readLine(), is("Yes"));
    }





}







