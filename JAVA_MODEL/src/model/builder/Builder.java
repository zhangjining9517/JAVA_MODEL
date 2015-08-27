package model.builder;
/**
 * ÷∆‘Ï…Ã
 * @author zhang
 *
 */
public abstract class Builder {

	public abstract void builderCpu(int cpu);
	public abstract void builderRam(int ram);
	public abstract void builderOs(String os);
	public abstract Computer builderComputer();
	
}
