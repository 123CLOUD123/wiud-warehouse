package com.wiud.base.core;

import java.util.ArrayList;
import java.util.List;

public class BillFilterChain {

	private List<BillFilter> billFilters = new ArrayList();
	
	public void addFilter(BillFilter filter) {
		this.billFilters.add(filter);
	}
	
}
