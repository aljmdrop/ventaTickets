package com.almacenPro.Analitica.service;

import org.springframework.stereotype.Service;

@Service
public class AnalyticsService {

    public static String getSalesReport() {

        return "Sales Report: Total sales - 1000 units";
    }

    public String getInventoryReport() {

        return "Inventory Report: Total items - 500";
    }

}