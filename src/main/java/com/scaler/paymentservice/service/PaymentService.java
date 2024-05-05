package com.scaler.paymentservice.service;

import com.scaler.paymentservice.paymentgateway.PaymentGateway;
import com.scaler.paymentservice.paymentgateway.PaymentGatewayStrategyChooser;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentGatewayStrategyChooser paymentGatewayStrategyChooser;

    public PaymentService(PaymentGatewayStrategyChooser paymentGatewayStrategyChooser) {
        this.paymentGatewayStrategyChooser = paymentGatewayStrategyChooser;
    }

    public String initiatePayment(String orderId, String email, String phoneNumber, Long amount) {

        PaymentGateway paymentGateway = paymentGatewayStrategyChooser.getBestPaymentGateway();
        return paymentGateway.generatePaymentLink(orderId, email, phoneNumber, amount);
    }
}
