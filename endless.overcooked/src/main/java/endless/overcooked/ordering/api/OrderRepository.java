package endless.overcooked.ordering.api;

import org.springframework.data.jpa.repository.JpaRepository;

import endless.overcooked.ordering.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}