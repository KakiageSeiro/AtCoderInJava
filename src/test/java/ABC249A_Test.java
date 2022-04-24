import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC249A_Test {
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
        ABC249A.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("4 3 3 6 2 5 10");

        targetRun();

        Assert.assertThat(out.readLine(), is("Takahashi"));
    }


    @Test
    public void 入力例2() {

        in.inputln("3 1 4 1 5 9 2");

        targetRun();

        Assert.assertThat(out.readLine(), is("Aoki"));
    }

//
//    @Test
//    public void 入力例3() {
//
//        in.inputln("10");
//        in.inputln("1 3");
//        in.inputln("1 4");
//        in.inputln("0 0");
//        in.inputln("0 2");
//        in.inputln("0 4");
//        in.inputln("3 1");
//        in.inputln("2 4");
//        in.inputln("4 2");
//        in.inputln("4 4");
//        in.inputln("3 3");
//        in.inputln("RLRRRLRLRR");
//
//        targetRun();
//
//        Assert.assertThat(out.readLine(), is("Yes"));
//    }

}







