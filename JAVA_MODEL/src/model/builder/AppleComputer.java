package model.builder;
/**
 * ƻ�����Զ���
 * @author zhang
 *
 */
public class AppleComputer extends Computer{
	
	protected AppleComputer(){
		
	}

	@Override
	public void setCpu(int cpu) {
		// TODO Auto-generated method stub
		nCpu = cpu;
		
	}

	@Override
	public void setRam(int ram) {
		// TODO Auto-generated method stub
		nRam = ram;
	}

	@Override
	public void setOs(String os) {
		// TODO Auto-generated method stub
		strOs = os;
	}

}
