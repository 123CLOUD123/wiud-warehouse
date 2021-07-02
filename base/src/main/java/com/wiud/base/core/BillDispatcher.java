package com.wiud.base.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wiud.base.bill.config.PurchaseRequestConfigurer;

public class BillDispatcher {

	private BillFilterChain billFilterChain = new BillFilterChain();
	
	private Map<Class<? extends AbstractBillConfigurer>, AbstractBillConfigurer> configurers = new HashMap<>();
	private List<AbstractBillConfigurer> initConfigurers = new ArrayList<>();
	
	{
		pR();
	}
	
	void build() {
		init();
		configure();
	}
	
	void init() {
		for (AbstractBillConfigurer c : initConfigurers) {
			c.init(this);
		}
	}
	
	void configure() {
		for (AbstractBillConfigurer c : initConfigurers) {
			c.configure(this);
		}
	}
	
	public BillFilterChain getFilterChain() {
		return billFilterChain;
	}
	
	public PurchaseRequestConfigurer pR() {
		return getOrApply(new PurchaseRequestConfigurer());
	}
	
	@SuppressWarnings("unchecked")
	private <C extends AbstractBillConfigurer> C getOrApply(C configurer) {
		C existingConfigurer = (C) configurers.get(configurer.getClass());
		if (existingConfigurer != null) {
			return existingConfigurer;
		}
		
		return apply(configurer);
	}
	
	private <C extends AbstractBillConfigurer> C apply(C configurer) {
		configurers.put(configurer.getClass(), configurer);
		return configurer;
	}
	
	
}
