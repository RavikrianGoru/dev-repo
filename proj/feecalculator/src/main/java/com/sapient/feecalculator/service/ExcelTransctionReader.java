package com.sapient.feecalculator.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExcelTransctionReader extends TransactionReader {
	public void loadTransactionsData(String fileLocation) throws IOException {
		File file = new File(fileLocation);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			if (!st.contains("External Transaction Id"))
				saveTransaction(readTransaction(st.split(",")));
		}
	}
}
