package model.builder;
/**
 * µçÄÔµÄ¶¥²ã¸¸Àà
 * @author zhang
 *
 */
public abstract class Computer {

	protected int nCpu = 1;
	protected int nRam = 1;
	protected String strOs = "win";

	protected Computer() {

	}

	public abstract void setCpu(int cpu);

	public abstract void setRam(int ram);

	public abstract void setOs(String os);

	@Override
	public String toString() {
		return "Computer [mCpuCore=" + nCpu + ", mRamSize=" + nRam + ", mOs="
				+ strOs + "]";
	}
}
