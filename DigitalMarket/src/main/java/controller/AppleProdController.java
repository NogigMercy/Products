package controller;

import entity.AppleProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.AppleProdService;

import java.util.List;

@Controller
@RestController
@RequestMapping("/apple")
public class AppleProdController {
    @Autowired
    private AppleProdService appleProdService;
    @PostMapping("/create")
    public void createAppleProduct(@RequestBody AppleProducts appleProducts){
        appleProdService.createAppleProduct(appleProducts);
    }
    @GetMapping("/get")
    public List<AppleProducts> getAllAppleProducts(){
        return appleProdService.getAllAppleProducts();
    }
    @GetMapping ("/get{id}")
    public AppleProducts getProductById(@PathVariable Integer id){
        return appleProdService.findById(id);
    }
    @GetMapping("/price/{price}")
    public AppleProducts getProductByPrice(@PathVariable Double price){
        return appleProdService.getProductByPrice(price);
    }
    @GetMapping("/memory")
    public AppleProducts getProductByMemory(@PathVariable int memory){
        return appleProdService.getProductByMemory(memory);
    }
    @PutMapping("/update/{id}")
    public AppleProducts updateProdcut(@PathVariable Integer id, @RequestBody AppleProducts appleProducts){
        System.out.println("Update for the product " + id + " has been made");
        return appleProdService.updateAppleProducts(id,appleProducts);
    }
//    @DeleteMapping("/delete/{id}")
//    public AppleProducts deleteProduct(@PathVariable Integer id){
//    }



}
