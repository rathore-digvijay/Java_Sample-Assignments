package org.Interface;

public class Test {
	public static void main(String[] args) {
		ISwitch is=new Lights();
		is.switchON();
		is.switchOFF();

		is=new Fan();
		is.switchON();
		is.switchOFF();
	}
}
