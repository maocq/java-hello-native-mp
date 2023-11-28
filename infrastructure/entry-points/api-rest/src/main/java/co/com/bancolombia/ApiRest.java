package co.com.bancolombia;

import co.com.bancolombia.model.customer.Customer;
import co.com.bancolombia.model.customer.gateways.CustomerRepository;
import co.com.bancolombia.usecase.CreateCustomerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiRest {

    private final CreateCustomerUseCase createCustomerUseCase;
    private final CustomerRepository customerRepository;

    @GetMapping("/customer")
    Customer customers() {
        System.out.println(Thread.currentThread().getName());
        return createCustomerUseCase.create("Foo");
    }

    @GetMapping("/info")
    String info() {
        return customerRepository.find("");
    }
}
