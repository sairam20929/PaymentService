package com.scaler.paymentservice.paymentgateway;

import org.springframework.stereotype.Component;

@Component
public class RazorpayPaymentGateway implements PaymentGateway{
    @Override
    public String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount) {
        return null;
    }
}
