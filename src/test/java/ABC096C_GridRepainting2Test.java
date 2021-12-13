import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC096C_GridRepainting2Test {
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
        ABC096C_GridRepainting2.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("3 3");
        in.inputln(".#.");
        in.inputln("###");
        in.inputln(".#.");

        targetRun();

        Assert.assertThat(out.readLine(), is("Yes"));
    }


    @Test
    public void 入力例2() {

        in.inputln("5 5");
        in.inputln("#.#.#");
        in.inputln(".#.#.");
        in.inputln("#.#.#");
        in.inputln(".#.#.");
        in.inputln("#.#.#");

        targetRun();

        Assert.assertThat(out.readLine(), is("No"));
    }

    @Test
    public void 入力例3() {

        in.inputln("11 11");
        in.inputln("...#####...");
        in.inputln(".##.....##.");
        in.inputln("#..##.##..#");
        in.inputln("#..##.##..#");
        in.inputln("#.........#");
        in.inputln("#...###...#");
        in.inputln(".#########.");
        in.inputln(".#.#.#.#.#.");
        in.inputln("##.#.#.#.##");
        in.inputln("..##.#.##..");
        in.inputln(".##..#..##.");
        targetRun();

        Assert.assertThat(out.readLine(), is("Yes"));
    }
}







