import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzTest {
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

    // 当てはまらない
    @Test
    public void main01() {

        in.inputln("1");

        FizzBuzz.main(null);

        Assert.assertThat(out.readLine(), is("1"));
    }

    // 当てはまらない
    @Test
    public void main02() {

        in.inputln("5");

        FizzBuzz.main(null);

        Assert.assertThat(out.readLine(), is("Buzz"));
    }

}