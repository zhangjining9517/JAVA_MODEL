package dynamic.proxy;

public class OperatorImpl implements Operator {

	@Override
	public void operator1() {
		// TODO Auto-generated method stub
		System.out.println("invoke method1");
		sleep(120);

	}

	private void sleep(int i) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void operator2() {
		// TODO Auto-generated method stub

		System.out.println("invoke method2");
		sleep(130);

	}

	@Override
	public void operator3() {
		// TODO Auto-generated method stub

		System.out.println("invoke method3");
		sleep(140);

	}

}
