package com.ning.practise;

import ning.codelab.hello.DateConfig;

public class EveningImpl implements DateConfig {

	@Override
	public int displayMessageOnTime() {
		return 17; //returning hour of the day
	}

}
