import org.testng.annotations.Test;

public class TestPriorities {

	@Test(priority = 1)
	public void B() {
		System.out.println("B()");
	}

	@Test
	public void b() {
		System.out.println("b()");
	}

	@Test
	public void f() {
		System.out.println("f()");
	}

	@Test(priority = 2)
	public void c() {
		System.out.println("c()");
	}

	@Test(priority = -1)
	public void d() {
		System.out.println("d()");
	}

}
