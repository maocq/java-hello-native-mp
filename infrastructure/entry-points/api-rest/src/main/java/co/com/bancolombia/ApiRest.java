package co.com.bancolombia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;

@RestController
public class ApiRest {

    @GetMapping("/customers")
    Collection<Customer> customers() {
        System.out.println(Thread.currentThread().getName());
        return Set.of(new Customer(1, "A"), new Customer(2, "B"), new Customer(3, "C"));
    }

    record Customer(Integer id, String name) { }
}
