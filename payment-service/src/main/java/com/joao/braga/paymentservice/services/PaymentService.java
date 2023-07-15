package com.joao.braga.paymentservice.services;

import com.joao.braga.paymentservice.models.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);

}
