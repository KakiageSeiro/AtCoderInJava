import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC098C_AttentionTest {
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
        ABC098C_Attention.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("5");
        in.inputln("WEEWW");

        targetRun();

        Assert.assertThat(out.readLine(), is("1"));
    }


    @Test
    public void 入力例2() {

        in.inputln("12");
        in.inputln("WEWEWEEEWWWE");

        targetRun();

        Assert.assertThat(out.readLine(), is("4"));
    }

    @Test
    public void 入力例3() {

        in.inputln("8");
        in.inputln("WWWWWEEE");

        targetRun();

        Assert.assertThat(out.readLine(), is("3"));
    }

}







