package com.makiia.notification_service.controller;

import com.makiia.notification_service.model.Notification;
import com.makiia.notification_service.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/notification")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    @GetMapping("/getAllByUserId/{userId}")
    public ResponseEntity<List<Notification>> getAllByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(notificationService.getAllByUserId(userId));
    }
}