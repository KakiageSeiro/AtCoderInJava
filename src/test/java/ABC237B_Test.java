import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC237B_Test {
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
        ABC237B.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("4 3");
        in.inputln("1 2 3");
        in.inputln("4 5 6");
        in.inputln("7 8 9");
        in.inputln("10 11 12");

        targetRun();

        Assert.assertThat(out.readLine(), is("1 4 7 10"));
        Assert.assertThat(out.readLine(), is("2 5 8 11"));
        Assert.assertThat(out.readLine(), is("3 6 9 12"));
    }



}







