package org.xtext.example.idmproject.tests;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class MyTestWatcher extends TestWatcher {
	private String watchedLog;

	@Override
	protected void failed(Throwable e, Description description) {
		watchedLog += description + "\n";
	}

	@Override
	protected void succeeded(Description description) {
		watchedLog += description + " " + "success!\n";
	}
};
