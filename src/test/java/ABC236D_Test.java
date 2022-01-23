import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC236C_Test {
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
        ABC236C_.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("5 3");
        in.inputln("tokyo kanda akiba okachi ueno");
        in.inputln("tokyo akiba ueno");

        targetRun();

        Assert.assertThat(out.readLine(), is("Yes"));
        Assert.assertThat(out.readLine(), is("No"));
        Assert.assertThat(out.readLine(), is("Yes"));
        Assert.assertThat(out.readLine(), is("No"));
        Assert.assertThat(out.readLine(), is("Yes"));
    }

    @Test
    public void 入力例2() {

        in.inputln("7 7");
        in.inputln("a t c o d e r");
        in.inputln("a t c o d e r");

        targetRun();

        Assert.assertThat(out.readLine(), is("Yes"));
        Assert.assertThat(out.readLine(), is("Yes"));
        Assert.assertThat(out.readLine(), is("Yes"));
        Assert.assertThat(out.readLine(), is("Yes"));
        Assert.assertThat(out.readLine(), is("Yes"));
        Assert.assertThat(out.readLine(), is("Yes"));
        Assert.assertThat(out.readLine(), is("Yes"));
    }


}







