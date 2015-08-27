package dynamic.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
	
	public static void main(String[] args) {
		TestInvokeCatHandler catHandler = new TestInvokeCatHandler(new OperatorImpl());
		Operator operator = (Operator)Proxy.newProxyInstance(Operator.class.getClassLoader(),
				new Class[]{Operator.class}, catHandler);
		operator.operator1();
		System.out.println("------------------");
		operator.operator2();
		System.out.println("------------------");
		operator.operator3();
		System.out.println("-------------------");
	}

}
