package com.ning.modules;

import ning.codelab.hello.DateConfig;

import com.google.inject.AbstractModule;
import com.ning.practise.NightImpl;

public class NightModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DateConfig.class).to(NightImpl.class);
	}

}
