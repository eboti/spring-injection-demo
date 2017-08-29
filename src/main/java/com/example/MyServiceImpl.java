package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.Customer;
import com.example.jpa.CustomerRepository;
import com.example.jpa.Instrument;
import com.example.jpa.InstrumentRepository;

@Component
public class MyServiceImpl implements MyService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private InstrumentRepository instrumentRepository;

	@Override
	@Transactional//(readOnly = true)
	public void doSomething() {

		Customer customer = new Customer();
		customer.setFirstName("firstname");
		customer.setLastName("lastname");
		customerRepository.save(customer);
		
		Instrument instrument = new Instrument();
		instrument.setName("guitar");
		instrumentRepository.save(instrument);
		
	}

}
