package co.com.bancolombia.model.customer.gateways;

import co.com.bancolombia.model.customer.Customer;

public interface CustomerRepository {

    Customer find(String id);
}
