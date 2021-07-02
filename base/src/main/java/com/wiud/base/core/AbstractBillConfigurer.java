package com.wiud.base.core;

public abstract class AbstractBillConfigurer {

	private BillFilter billFilter;
	
	public BillFilter getFilter() {
		return billFilter;
	}
	
	public abstract void init(BillDispatcher builder);	
	
	public abstract void configure(BillDispatcher builder);
}
