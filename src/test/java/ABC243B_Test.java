import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC243B_Test {
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
        ABC243B.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("4");
        in.inputln("1 3 5 2");
        in.inputln("2 3 1 4");

        targetRun();

        Assert.assertThat(out.readLine(), is("1"));
        Assert.assertThat(out.readLine(), is("2"));
    }


    @Test
    public void 入力例3() {

        in.inputln("1000000");

        targetRun();

        Assert.assertThat(out.readLine(), is("248860093"));
    }

}







