package com.ning.modules;

import ning.codelab.hello.DateConfig;

import com.google.inject.AbstractModule;
import com.ning.practise.MorningImpl;

public class MorningModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DateConfig.class).to(MorningImpl.class);
	}

}
