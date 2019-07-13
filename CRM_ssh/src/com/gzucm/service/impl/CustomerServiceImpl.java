package com.gzucm.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import com.gzucm.dao.CustomerDao;
import com.gzucm.domain.Customer;
import com.gzucm.domain.Products;
import com.gzucm.service.CustomerService;
import com.gzucm.utils.PageBean;
@Transactional
public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	@Override
	public PageBean list(DetachedCriteria dc, Integer currentPage, Integer pageSize) {
		
		//通过customer_name来查询有多少条记录
		int totalCount = customerDao.findTotalCount(dc);
		PageBean pageBean = new PageBean(currentPage, totalCount, pageSize);
		//通过pageSize和currentPage和customer_name来查询list对象
		List<Customer> list = customerDao.findListCustomer(dc,pageBean.getStart(),pageBean.getPageSize());
		//将所有的东西封装到pageBean
		pageBean.setList(list);
		return pageBean;
	}
}
