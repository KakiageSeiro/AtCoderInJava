import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC236B_Test {
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

    // ■■■テスト対象■■■
    private void targetRun() {
        ABC236B_.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("3");
        in.inputln("1 3 2 3 3 2 2 1 1 1 2");

        targetRun();

        Assert.assertThat(out.readLine(), is("3"));
    }

    @Test
    public void 入力例2() {

        in.inputln("1");
        in.inputln("1 1 1");

        targetRun();

        Assert.assertThat(out.readLine(), is("1"));
    }


    @Test
    public void 入力例3() {

        in.inputln("4");
        in.inputln("3 2 1 1 2 4 4 4 4 3 1 3 2 1 3");

        targetRun();

        Assert.assertThat(out.readLine(), is("2"));
    }

}







