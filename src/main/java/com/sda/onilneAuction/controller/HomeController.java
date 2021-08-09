package com.sda.onilneAuction.controller;

import com.sda.onilneAuction.dto.ProductDto;
import com.sda.onilneAuction.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //
public class HomeController {
    @Autowired //cerem springului sa instantieze/injecteze ProductService ca sa nu o mai facem cu new
    private ProductService productService;

    @GetMapping("/addItem")//pagina ceruta in get in browser http://localhost:8081/home
    public String getAddItemPage(Model model) {//handler pe ruta addItem, metoda care se activeaza cond vine un request
        //Dispacher stie ca handlerul asteapta un obiect
        //aici procesez din greu requestul, la final:
        System.out.println("sout: Hello ");
        ProductDto productDto = new ProductDto();
        model.addAttribute("productDto", productDto);
        return "addItem";//pagina intoarsa din templates
    }

    @PostMapping("/addItem")
    public String postAddItemPage(Model model, ProductDto productDto) {
        System.out.println("Am primit " + productDto);
        productService.add(productDto);
        return "addItem";
    }


}
