package com.example.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.StockHoldings;
import com.example.repository.StockHoldingsRepository;

@Service
public class StockHoldingsService {
	
	@Autowired
	private StockHoldingsRepository stockHoldingsRepository;

	
	public void saveStocksFromCsv(MultipartFile file){
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
			String line;
			boolean firstRow = true; //To Skip header
			while((line = reader.readLine()) != null) {
				if(firstRow) {
					firstRow = false;
					continue; //skip header row
				}
				
				String[] columns = line.split(",");
				StockHoldings stockHoldings = new StockHoldings();
				
				stockHoldings.setExchange(columns[0]);
				stockHoldings.setInstrument(columns[1]);
				stockHoldings.setQty(Integer.parseInt(columns[2]));
				stockHoldings.setSalable(Integer.parseInt(columns[3]));
				stockHoldings.setAvgCost(Double.parseDouble(columns[4]));
				stockHoldings.setInvVal(Double.parseDouble(columns[5].replaceAll("[\",]", "")));  // Remove commas
				stockHoldings.setLtp(Double.parseDouble(columns[6]));
				stockHoldings.setCurVal(Double.parseDouble(columns[7].replaceAll("[\",]", "")));
				stockHoldings.setpAndL(Double.parseDouble(columns[8]));
				stockHoldings.setNetChange(Double.parseDouble(columns[9].replaceAll("[\",]", "")));
				stockHoldings.setDayChange(columns[10]);
				stockHoldings.setNpoaQty(Integer.parseInt(columns[11]));
				stockHoldings.setT1Qty(Integer.parseInt(columns[12]));
				stockHoldings.setPledgedQty(Integer.parseInt(columns[13]));
				stockHoldings.setT1Nonpoa(Integer.parseInt(columns[14]));
                
				stockHoldingsRepository.save(stockHoldings);
                
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
