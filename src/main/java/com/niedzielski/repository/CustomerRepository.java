package com.niedzielski.repository;

import java.util.List;

import com.niedzielski.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}