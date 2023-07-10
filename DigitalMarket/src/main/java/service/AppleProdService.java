package service;

import entity.AppleProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AppleProdRepo;

import java.util.Optional;

@Service
public class AppleProdService {
    @Autowired
    private AppleProdRepo appleProdRepo;

    public void createAppleProduct(AppleProducts appleProducts){
         appleProdRepo.save(appleProducts);
    }
    public AppleProducts findById(Integer id){
        final Optional<AppleProducts> appleProductsOptional= appleProdRepo.findById(id);
        if (appleProductsOptional.isEmpty()){
            throw new RuntimeException();
        }
        return appleProductsOptional.get();
    }
}
