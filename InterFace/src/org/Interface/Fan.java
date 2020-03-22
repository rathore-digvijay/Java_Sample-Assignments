package org.Interface;

public class Fan implements ISwitch{

	@Override
	public boolean switchON() {
		// TODO Auto-generated method stub
		System.out.println("Fan on");
		return true;
	}

	@Override
	public boolean switchOFF() {
		// TODO Auto-generated method stub
		System.out.println("Fan off");
		return false;
	}

}
