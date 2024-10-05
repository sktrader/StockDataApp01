package com.example.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

@RestController
public class StockController {

	@GetMapping("/stockdata")
	public String getStockData() {

		try {

			String stockSymbol = "RELIANCE.NS"; // Stock symbol for NSE
			String url = "https://query1.finance.yahoo.com/v8/finance/chart/" + stockSymbol;

			// Fetch stock data from Yahoo Finance API
			HttpResponse<String> response = Unirest.get(url).asString();

			// Parse JSON response
			JSONObject jsonObject = new JSONObject(response.getBody());

			JSONObject chart = jsonObject.getJSONObject("chart");

			JSONObject result = chart.getJSONArray("result").getJSONObject(0);

			JSONObject meta = result.getJSONObject("meta");

			String stockName = meta.getString("symbol");

			// Closing price
			JSONObject indicators = result.getJSONObject("indicators");
			JSONObject quote = indicators.getJSONArray("quote").getJSONObject(0);
			String closingPrice = quote.getJSONArray("close").toString();

			// Return the fetched data
			return "Stock Name: " + stockName + ", Closing Price: " + closingPrice;

		} catch (Exception e) {
			e.printStackTrace();
			return "Error fetching data";
		}

	}
}
