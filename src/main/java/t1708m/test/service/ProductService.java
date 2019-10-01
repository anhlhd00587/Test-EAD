package t1708m.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import t1708m.test.entity.Product;
import t1708m.test.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Page<Product> getList(int page, int limit) {
        return productRepository.findAll(PageRequest.of(page - 1, limit));
    }
    public Product getDetail(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
