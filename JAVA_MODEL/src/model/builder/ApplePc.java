package model.builder;
/**
 * 苹果电脑的制造商
 * @author zhang
 *
 */
public class ApplePc extends Builder{
	
	private Computer computer = new AppleComputer();

	@Override
	public void builderCpu(int cpu) {
		// TODO Auto-generated method stub
		computer.setCpu(cpu);
	}

	@Override
	public void builderRam(int ram) {
		// TODO Auto-generated method stub
		computer.setRam(ram);
	}

	@Override
	public void builderOs(String os) {
		// TODO Auto-generated method stub
		computer.setOs(os);
	}

	@Override
	public Computer builderComputer() {
		// TODO Auto-generated method stub
		return computer;
	}

}
