package controller;

import entity.AppleProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AppleProdService;

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

}
