package model.builder;
/**
 * ��Ʒ��װ��
 * @author zhang
 *
 */
public class Director {
	
	private Builder builder;
	
	public Director(Builder b){
		this.builder = b;
	}
	
	public void construct(int cpu,int ram,String os){
		builder.builderCpu(cpu);
		builder.builderOs(os);
		builder.builderRam(ram);
	}

}
