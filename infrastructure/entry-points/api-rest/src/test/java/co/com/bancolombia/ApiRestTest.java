package co.com.bancolombia;

import co.com.bancolombia.model.customer.Customer;
import co.com.bancolombia.usecase.CreateCustomerUseCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ApiRestTest {

    @Test
    void name() {
        CreateCustomerUseCase createCustomerUseCase = new CreateCustomerUseCase(name -> "Hello");
        ApiRest apiRest = new ApiRest(createCustomerUseCase, name -> "Hello");
        Customer customers = apiRest.customers();
        assertNotNull(customers);
    }
}