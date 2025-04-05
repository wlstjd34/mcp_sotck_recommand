package com.js.mcp.stock.controller;

import com.js.mcp.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/collectStock")
    public String collectStock() {
        stockService.collectStockData();
        return "Stock data collected and saved!";
    }
}
