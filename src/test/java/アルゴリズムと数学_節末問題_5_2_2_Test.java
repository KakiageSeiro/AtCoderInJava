import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class アルゴリズムと数学_節末問題_5_2_2_Test {
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
        アルゴリズムと数学_節末問題_5_2_2.main();
    }

    @Test
    public void 入力例1() {
        in.inputln("1");
        targetRun();
        Assert.assertThat(out.readLine(), is("Second"));
    }

    @Test
    public void 入力例2() {
        in.inputln("2");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }

    @Test
    public void 入力例3() {
        in.inputln("3");
        targetRun();
        Assert.assertThat(out.readLine(), is("Second"));
    }

    @Test
    public void 入力例4() {
        in.inputln("4");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }

    @Test
    public void 入力例5() {
        in.inputln("5");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }

    @Test
    public void 入力例6() {
        in.inputln("6");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }

    @Test
    public void 入力例7() {
        in.inputln("7");
        targetRun();
        Assert.assertThat(out.readLine(), is("Second"));
    }

    @Test
    public void 入力例8() {
        in.inputln("8");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }

    @Test
    public void 入力例9() {
        in.inputln("9");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }

    @Test
    public void 入力例10() {
        in.inputln("10");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }

    @Test
    public void 入力例11() {
        in.inputln("11");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }

    @Test
    public void 入力例12() {
        in.inputln("12");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }

    @Test
    public void 入力例13() {
        in.inputln("13");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }

    @Test
    public void 入力例14() {
        in.inputln("14");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }

    @Test
    public void 入力例15() {
        in.inputln("15");
        targetRun();
        Assert.assertThat(out.readLine(), is("Second"));
    }

    @Test
    public void 入力例1000000000000000000() {
        in.inputln("1000000000000000000");
        targetRun();
        Assert.assertThat(out.readLine(), is("First"));
    }





}







