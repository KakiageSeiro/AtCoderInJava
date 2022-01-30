import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC237C_Test {
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
        ABC237C.main();
    }

    @Test
    public void 入力例1() {

        in.inputln("kasaka");

        targetRun();

        Assert.assertThat(out.readLine(), is("Yes"));
    }


    @Test
    public void 入力例2() {

        in.inputln("atcoder");

        targetRun();

        Assert.assertThat(out.readLine(), is("No"));
    }



    @Test
    public void 入力例3() {

        in.inputln("php");

        targetRun();

        Assert.assertThat(out.readLine(), is("Yes"));
    }



    @Test
    public void 入力例99() {

        in.inputln("phpaaaakasaka");

        targetRun();

        Assert.assertThat(out.readLine(), is("No"));
    }




}







