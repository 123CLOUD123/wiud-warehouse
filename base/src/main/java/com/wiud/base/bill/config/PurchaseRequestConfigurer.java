package com.wiud.base.bill.config;

import com.wiud.base.bill.filter.PurchaseRequestFilter;
import com.wiud.base.core.AbstractBillConfigurer;
import com.wiud.base.core.BillDispatcher;

public class PurchaseRequestConfigurer extends AbstractBillConfigurer {

	@Override
	public void init(BillDispatcher builder) {
		builder.getFilterChain().addFilter(new PurchaseRequestFilter());
	}

	@Override
	public void configure(BillDispatcher builder) {
		
	}

}