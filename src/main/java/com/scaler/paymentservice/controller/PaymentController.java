package com.scaler.paymentservice.controller;

import com.scaler.paymentservice.dtos.InititatePaymentDto;
import com.scaler.paymentservice.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    //Return Payment Link of PaymentGateway
    @PostMapping
    public String initiatePayment(@RequestBody InititatePaymentDto inititatePaymentDto) {
        return paymentService.initiatePayment(inititatePaymentDto.getOrderId(),inititatePaymentDto.getEmail(),inititatePaymentDto.getPhoneNumber(),inititatePaymentDto.getAmount());
    }
}
