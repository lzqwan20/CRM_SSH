package com.gzucm.web.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.gzucm.domain.Customer;
import com.gzucm.domain.Products;
import com.gzucm.service.CustomerService;
import com.gzucm.service.impl.CustomerServiceImpl;
import com.gzucm.utils.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	private Customer customer = new Customer();
	@Override
	public Customer getModel() {
		return customer;
	}
	
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	private Integer currentPage;
	private Integer pageSize;
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	

	public String list(){
		DetachedCriteria dc = DetachedCriteria.forClass(Customer.class);
		if(StringUtils.isNotBlank(customer.getCustomer_name())){
			dc.add(Restrictions.like("customer_name", "%"+customer.getCustomer_name()+"%"));
		}
		PageBean pageBean = customerService.list(dc,currentPage,pageSize);
		ActionContext.getContext().put("pageBean", pageBean);
		System.out.println(pageBean.getList());
		return "list";
		
	}
}
