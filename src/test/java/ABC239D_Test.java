import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC239D_Test {
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
        ABC239D.main(null);
    }

    @Test
    public void 入力例1() {
        in.inputln("2 3 3 4");
        targetRun();
        Assert.assertThat(out.readLine(), is("Aoki"));
    }


    @Test
    public void 入力例2() {
        in.inputln("1 100 50 60");
        targetRun();
        Assert.assertThat(out.readLine(), is("Takahashi"));
    }

    @Test
    public void 入力例3() {
        in.inputln("3 14 1 5");
        targetRun();
        Assert.assertThat(out.readLine(), is("Aoki"));
    }

}







