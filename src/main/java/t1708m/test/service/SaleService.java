package t1708m.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import t1708m.test.entity.Sale;
import t1708m.test.repository.SaleRepository;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;
    public Sale create(Sale sale) {
        return saleRepository.save(sale);
    }

    public Page<Sale> getList(int page, int limit) {
        return saleRepository.findAll(PageRequest.of(page - 1, limit));
    }
    public Sale getDetail(int id) {
        return saleRepository.findById(id).orElse(null);
    }
}
