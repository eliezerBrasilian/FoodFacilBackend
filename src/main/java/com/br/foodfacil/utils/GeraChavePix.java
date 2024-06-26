package com.br.foodfacil.utils;

import com.br.foodfacil.records.PagamentoBody;
import com.br.foodfacil.records.QrCode;
import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.payment.PaymentClient;
import com.mercadopago.client.payment.PaymentCreateRequest;
import com.mercadopago.client.payment.PaymentPayerRequest;
import com.mercadopago.core.MPRequestOptions;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GeraChavePix {

   /* public QrCode generate(PagamentoBody pagamentoBody) {
        MercadoPagoConfig.setAccessToken(AppUtils.PROD_ACCESS_TOKEN);

        Map<String, String> customHeaders = new HashMap<>();
        customHeaders.put("x-idempotency-key", UUID.randomUUID().toString());

        var requestOptions = MPRequestOptions.builder()
                .customHeaders(customHeaders)
                .build();

        var client = new PaymentClient();

        var paymentCreateRequest = PaymentCreateRequest.builder()
                .transactionAmount(new BigDecimal(pagamentoBody.produtoData().valor()))
                .description(pagamentoBody.produtoData().descricao())
                .paymentMethodId("pix")
                .payer(
                        PaymentPayerRequest.builder()
                                .email(pagamentoBody.userData().email())
                                .firstName(pagamentoBody.userData().primeiroNome())
                                .build())
                .externalReference(pagamentoBody.produtoData().id())
                .build();

        try {
            var payment = client.create(paymentCreateRequest, requestOptions);
            System.out.println(payment);

            var qrcodeBase64 = payment.getPointOfInteraction().getTransactionData().getQrCodeBase64();
            var qrcode = payment.getPointOfInteraction().getTransactionData().getQrCode();

            var data = Map.of(
                    "message", "sucesso",
                    "qrcode", qrcode,
                    "qrcodeBase64", qrcodeBase64
            );
            System.out.println(data);
            return new QrCode(qrcode,qrcodeBase64);

        }catch (MPApiException e){
            var apiResponse = e.getApiResponse();
            var content = apiResponse.getContent();
            System.out.println(content);

            System.out.println("-----------falha ao gerar chave pix-----------");
            System.out.println("message: " + e.getMessage());
            System.out.println("cause: " + e.getCause());

            return null;
        }catch (MPException e){
            return  null;
        }
    }*/
}

