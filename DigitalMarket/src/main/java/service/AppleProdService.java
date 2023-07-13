package service;

import entity.AppleProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AppleProdRepo;

import java.util.List;
import java.util.Optional;

@Service
public class AppleProdService {
    @Autowired
    private AppleProdRepo appleProdRepo;

    public void createAppleProduct(AppleProducts appleProducts) {
        appleProdRepo.save(appleProducts);
    }

    public AppleProducts findById(Integer id) {
        final Optional<AppleProducts> appleProductsOptional = appleProdRepo.findById(id);
        if (appleProductsOptional.isEmpty()) {
            throw new RuntimeException();
        }
        return appleProductsOptional.get();
    }

    public List<AppleProducts> getAllAppleProducts() {
        return appleProdRepo.findAll();
    }

    public AppleProducts getProductByPrice(Double price) {
        return appleProdRepo.findByPrice(price);
    }

    public AppleProducts getProductByMemory(int memory) {
        return appleProdRepo.findByMemory((double) memory);
    }

    public AppleProducts updateAppleProducts(Integer id, AppleProducts appleProducts) {
        AppleProducts appleProductsToUpdate = findById(id);
        appleProductsToUpdate.setNameOfTheProduct(appleProducts.getNameOfTheProduct());
        appleProductsToUpdate.setPrice(appleProducts.getPrice());
        appleProductsToUpdate.setMemory(appleProducts.getMemory());
        return appleProdRepo.save(appleProducts);
    }

//    public AppleProducts deleteProduct(Integer id) {
//        return appleProdRepo.deleteById(id);
//    }

}
