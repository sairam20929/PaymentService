package com.scaler.paymentservice.paymentgateway;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentGateway implements PaymentGateway{
    @Override
    public String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount) {
        return null;
    }
}
