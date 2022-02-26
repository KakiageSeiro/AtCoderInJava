import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC241C_Test {
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
        ABC241C.main(null);
    }

    @Test
    public void 入力例1() {
        in.inputln("8");
        in.inputln("........");
        in.inputln("........");
        in.inputln(".#.##.#.");
        in.inputln("........");
        in.inputln("........");
        in.inputln("........");
        in.inputln("........");
        in.inputln("........");
        targetRun();
        Assert.assertThat(out.readLine(), is("Yes"));
    }

}







