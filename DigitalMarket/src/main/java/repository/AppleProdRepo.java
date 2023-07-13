package repository;

import entity.AppleProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppleProdRepo extends JpaRepository<AppleProducts, Integer> {
    AppleProducts findByProductName(String name);

    AppleProducts findByPrice(double price);
    AppleProducts findByMemory(Double memory);
}
