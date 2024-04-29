package com.br.foodfacil.controllers;

import com.br.foodfacil.dtos.NotificationDTO;
import com.br.foodfacil.services.NotificationService;
import com.br.foodfacil.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping(AppUtils.baseUrl + "/notification")
public class NotificationController {

    @Autowired
    NotificationService notificationService;


    // Endpoint donde MercadoPago enviara sus Webhooks (notificaciones de pagos)
    @CrossOrigin(origins = "https://api.mercadopago.com")
    @PostMapping("/mercadopago/webhook")
    public  String sendNotification(@RequestBody NotificationDTO notificationDTO){
        return  notificationService.sendNotificationByToken(notificationDTO);
    }
}