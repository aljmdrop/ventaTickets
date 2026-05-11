package com.almacenPro.Analitica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almacenPro.Analitica.service.AnalyticsService;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping("/sales")
    public String getSalesReport() {
        return AnalyticsService.getSalesReport();
    }

    @GetMapping("/inventory")
    public String getInventoryReport() {
        return analyticsService.getInventoryReport();
    }

}