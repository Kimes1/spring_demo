package com.niedzielski.service;


import java.util.List;

import com.niedzielski.model.Customer;
import com.niedzielski.repository.CustomerRepository;
import com.niedzielski.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.niedzielski.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
		
		
	}

}
