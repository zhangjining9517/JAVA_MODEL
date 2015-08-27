package dynamic.proxy;

public class ClassB {
	ClassA a;
	public ClassB(ClassA a){
		this.a = a;
	}
	
	public void excutor1(){
		a.operMethod1();
	}
	
	public void excutor2(){
		a.operMethod2();
	}

}
