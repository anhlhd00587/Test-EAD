package t1708m.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import t1708m.test.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale,Integer> {
}
