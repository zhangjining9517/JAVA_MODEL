package model.builder;

public class Test {

	public static void main(String[] args) {
		Builder builder = new ApplePc();
		//ֻ��Ҫ����װ�������뽨���ߣ����Ҹ��߽�����һЩ������Ϣ�����߾Ϳ��Դ���һ̨����
		Director director = new Director(builder);
		director.construct(5, 6, "linux");
		System.out.println(builder.builderComputer().toString());
	}
}
