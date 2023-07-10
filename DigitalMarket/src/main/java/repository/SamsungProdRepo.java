package repository;

import entity.SamsungProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SamsungProdRepo extends JpaRepository<SamsungProducts,Integer> {
}
