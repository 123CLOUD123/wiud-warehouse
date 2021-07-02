package com.wiud.base.core;

public class BillDispatcherBuilder {

	private BillDispatcher billDispatcher = new BillDispatcher();
	
	public BillDispatcherBuilder init() {
		billDispatcher.init();
		return this;
	}
	
	public BillDispatcherBuilder config() {
		billDispatcher.build();
		return this;
	}
	
	public BillDispatcher result() {
		return billDispatcher;
	}
	
}
