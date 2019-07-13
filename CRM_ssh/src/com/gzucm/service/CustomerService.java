package com.gzucm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.gzucm.domain.Customer;
import com.gzucm.domain.Products;
import com.gzucm.utils.PageBean;

public interface CustomerService {

	PageBean list(DetachedCriteria dc, Integer currentPage, Integer pageSize);
	

}
