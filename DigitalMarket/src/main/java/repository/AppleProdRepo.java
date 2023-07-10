package repository;

import entity.AppleProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppleProdRepo extends JpaRepository<AppleProducts, Integer> {
    AppleProducts findByProductName(String name);

    List<AppleProducts> findByPrice(double price);
}
