package com.sda.onilneAuction.validator;

import com.sda.onilneAuction.dto.ProductDto;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Service
public class ProductDtoValidator {

    public void validate(ProductDto productDto, BindingResult bindingResult) {

        String priceAsString = productDto.getStartBiddingPrice();//pretul ca si String

        try {
            Integer priceAsInteger = Integer.valueOf(priceAsString);//pretul ca si Integer
            if (priceAsInteger <= 0) {
                FieldError fieldError = new FieldError("productDto", "startBiddingPrice", "The price must be positive!");
                bindingResult.addError(fieldError);
            }
        } catch (NumberFormatException numberFormatException) {
            FieldError fieldError = new FieldError("productDto", "startBiddingPrice", "The price must be a number!");
            bindingResult.addError(fieldError);
        }

    }

}
