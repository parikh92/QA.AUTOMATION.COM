package com.acti.utils;

import com.acti.base.DriverScript;

public class Helper extends DriverScript {
	
	public static void fn_Sleep ()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
