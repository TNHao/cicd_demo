import org.junit.jupiter.api.Test;

/**
 * @author haotn
 * @version 1.0
 * @date 20/12/2022 00:06
 */
public class CalcTest {
	@Test
	public void calcTest() {
		System.out.println("Testing...");
		assert Main.calc(5, 3) == 8;
	}
}
