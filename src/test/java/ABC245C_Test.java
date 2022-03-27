import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC245C_Test {
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
        ABC245C.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("5 4");
        in.inputln("9 8 3 7 2");
        in.inputln("1 6 2 9 5");

        targetRun();
        //9,6,3,7,5
        Assert.assertThat(out.readLine(), is("Yes"));
    }


    @Test
    public void 入力例2() {

        in.inputln("4 90");
        in.inputln("1 1 1 100");
        in.inputln("1 2 3 100");

        targetRun();

        Assert.assertThat(out.readLine(), is("No"));
    }


}







