package model.builder;

public class Test {

	public static void main(String[] args) {
		Builder builder = new ApplePc();
		//只需要给组装工厂传入建造者，并且告诉建造者一些配置信息建造者就可以创建一台电脑
		Director director = new Director(builder);
		director.construct(5, 6, "linux");
		System.out.println(builder.builderComputer().toString());
	}
}
