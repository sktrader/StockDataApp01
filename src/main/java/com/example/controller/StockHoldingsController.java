package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.service.StockHoldingsService;

@RestController
@RequestMapping("/api/v1/holdings")
public class StockHoldingsController {
	
	@Autowired
	private StockHoldingsService stockHoldingsService;

	@PostMapping("/upload")
	public ResponseEntity<String> uploadCsv(@RequestParam("file") MultipartFile file){
		
		if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload a file!");
        }
		
		stockHoldingsService.saveStocksFromCsv(file);
		
		return ResponseEntity.ok("File uploaded successfully and data saved!");
		
	}
}
