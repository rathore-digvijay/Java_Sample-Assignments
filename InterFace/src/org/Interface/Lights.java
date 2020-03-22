package org.Interface;

public class Lights implements ISwitch {

	@Override
	public boolean switchON() {
		// TODO Auto-generated method stub
		System.out.println("light on");
		return true;
	}

	@Override
	public boolean switchOFF() {
		// TODO Auto-generated method stub
		System.out.println("light off");
		return false;
	}

}
