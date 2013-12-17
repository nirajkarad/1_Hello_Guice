package com.ning.modules;

import ning.codelab.hello.DateConfig;

import com.google.inject.AbstractModule;
import com.ning.practise.AfternoonImpl;
import com.ning.practise.MorningImpl;

public class AfternoonModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(DateConfig.class).to(AfternoonImpl.class);
	}
	

}
