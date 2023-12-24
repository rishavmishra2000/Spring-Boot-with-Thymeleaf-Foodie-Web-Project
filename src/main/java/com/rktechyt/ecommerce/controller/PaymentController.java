package com.rktechyt.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {
    @PostMapping("/payNow")
    public String orderPlaced(){
        return "orderPlaced";
    }
}
