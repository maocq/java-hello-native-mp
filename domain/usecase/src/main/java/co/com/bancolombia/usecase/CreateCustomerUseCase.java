package co.com.bancolombia.usecase;

import co.com.bancolombia.model.customer.Customer;
import co.com.bancolombia.model.customer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@RequiredArgsConstructor
public class CreateCustomerUseCase {

    private final CustomerRepository customerRepository;

    public Customer create(String name) {
        var info = customerRepository.find(name);
        log.info(info);
        return Customer.builder().id(99).name(name).build();
    }
}
