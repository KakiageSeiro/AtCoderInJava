import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC231C_Counting2Test {
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
        ABC231C_Counting2.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("3 1");
        in.inputln("100 160 130");
        in.inputln("120");

        targetRun();

        Assert.assertThat(out.readLine(), is("2"));
    }


    @Test
    public void 入力例2() {

        in.inputln("5 5");
        in.inputln("1 2 3 4 5");
        in.inputln("6");
        in.inputln("5");
        in.inputln("4");
        in.inputln("3");
        in.inputln("2");

        targetRun();

        Assert.assertThat(out.readLine(), is("0"));
        Assert.assertThat(out.readLine(), is("1"));
        Assert.assertThat(out.readLine(), is("2"));
        Assert.assertThat(out.readLine(), is("3"));
        Assert.assertThat(out.readLine(), is("4"));
    }

    @Test
    public void 入力例3() {

        in.inputln("5 5");
        in.inputln("804289384 846930887 681692778 714636916 957747794");
        in.inputln("424238336");
        in.inputln("719885387");
        in.inputln("649760493");
        in.inputln("596516650");
        in.inputln("189641422");

        targetRun();

        Assert.assertThat(out.readLine(), is("5"));
        Assert.assertThat(out.readLine(), is("3"));
        Assert.assertThat(out.readLine(), is("5"));
        Assert.assertThat(out.readLine(), is("5"));
        Assert.assertThat(out.readLine(), is("5"));
    }
}