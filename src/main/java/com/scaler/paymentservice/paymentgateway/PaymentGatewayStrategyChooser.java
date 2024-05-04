package com.scaler.paymentservice.paymentgateway;

import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayStrategyChooser {
    private final RazorpayPaymentGateway razorpayPaymentGateway;
    private final StripePaymentGateway stripePaymentGateway;

    public PaymentGatewayStrategyChooser(RazorpayPaymentGateway razorpayPaymentGateway, StripePaymentGateway stripePaymentGateway) {
        this.razorpayPaymentGateway = razorpayPaymentGateway;
        this.stripePaymentGateway = stripePaymentGateway;
    }

    public PaymentGateway getBestPaymentGateway() {
        //H/W - write logic for randomly picking PG
        return razorpayPaymentGateway;
    }
}
