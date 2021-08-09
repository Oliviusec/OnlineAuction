package com.sda.onlineAuction.validator;

import com.sda.onlineAuction.dto.ProductDto;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Service
public class ProductDtoValidator {
    public boolean isValid(ProductDto productDto, BindingResult bindingResult) {
        String priceAsString = productDto.getStartBiddingPrice();
        try {
            Integer priceAsInteger = Integer.valueOf(priceAsString);
            if(priceAsInteger>0){
               return true;
            }else {
                FieldError fieldError= new FieldError("productDto","startBiddingPrice", "The price must be positive");
                bindingResult.addError(fieldError);
                return false;
            }
        } catch (NumberFormatException numberFormatException) {
            FieldError fieldError= new FieldError("productDto","startBiddingPrice", "The price must be a number");
            bindingResult.addError(fieldError);
            return false;
        }
    }

}
