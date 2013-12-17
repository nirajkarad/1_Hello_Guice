package com.ning.modules;

import ning.codelab.hello.DateConfig;

import com.google.inject.AbstractModule;
import com.ning.practise.EveningImpl;

public class EveningModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(DateConfig.class).to(EveningImpl.class);
	}

}
