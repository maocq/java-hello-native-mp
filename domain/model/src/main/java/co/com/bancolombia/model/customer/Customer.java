package co.com.bancolombia.model.customer;
import lombok.Builder;

@Builder(toBuilder = true)
public record Customer(int id, String name) { }
