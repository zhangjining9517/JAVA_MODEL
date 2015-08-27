package dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class TestInvokeCatHandler implements InvocationHandler{

	private Object target;
	
	public TestInvokeCatHandler() {
		// TODO Auto-generated constructor stub
	}
	
	public TestInvokeCatHandler(Object tar){
		this.target = tar;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		long start =System.currentTimeMillis();
		Object obj  = method.invoke(target, args);
		System.out.println("方法名:"+ method.getName() +" 延迟时间 = "+ (System.currentTimeMillis() - start));
		return obj;
	}

}
