package co.com.bancolombia.consumer;

import co.com.bancolombia.model.customer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class RestConsumer implements CustomerRepository {

    private final RestClient restClient;

    @Override
    public String find(String id) {
        return restClient
                .get()
                .uri("https://httpbin.org/get")
                .retrieve()
                .body(String.class);
    }
}
