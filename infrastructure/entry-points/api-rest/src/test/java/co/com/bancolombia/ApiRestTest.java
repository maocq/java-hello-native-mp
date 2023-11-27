package co.com.bancolombia;

import co.com.bancolombia.model.customer.Customer;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ApiRestTest {

    @Test
    void name() {
        ApiRest apiRest = new ApiRest();
        Collection<Customer> customers = apiRest.customers();
        assertNotNull(customers);
    }
}