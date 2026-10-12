package re.edu.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import re.edu.inventoryservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
