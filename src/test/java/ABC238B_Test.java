import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC238B_Test {
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
        ABC238B.main();
    }

    @Test
    public void 入力例1() {

        in.inputln("4");
        in.inputln("90 180 45 195");

        targetRun();

        Assert.assertThat(out.readLine(), is("120"));
    }


    @Test
    public void 入力例2() {

        in.inputln("1");
        in.inputln("1");

        targetRun();

        Assert.assertThat(out.readLine(), is("359"));
    }




}







