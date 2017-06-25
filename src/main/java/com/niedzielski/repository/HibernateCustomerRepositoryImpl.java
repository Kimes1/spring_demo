package com.niedzielski.repository;

import java.util.ArrayList;
import java.util.List;

import com.niedzielski.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstName("Jakub");
		customer.setLastName("Niedzielski");

		customers.add(customer);

		return customers;

	}

}
