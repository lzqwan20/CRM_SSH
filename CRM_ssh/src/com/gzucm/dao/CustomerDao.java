package com.gzucm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.gzucm.domain.Customer;
import com.gzucm.domain.Products;

public interface CustomerDao {
	
	int findTotalCount(DetachedCriteria dc);

	List<Customer> findListCustomer(DetachedCriteria dc, int start, Integer pageSize);
}
