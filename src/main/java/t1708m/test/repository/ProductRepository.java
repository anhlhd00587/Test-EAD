package t1708m.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import t1708m.test.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
