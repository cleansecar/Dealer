package com.autobrixusedcar.dealer.utils;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Component
public class SMS {

	public void sendSms(String mobileNumber, String text) {

			try {
				String apiKey = "apikey=" + "ZiJoYTSqfv8-lgucF3tDKx8GGNnp4z0xVemEfjTXls";
				String message = "&message=" + text;
				String sender = "&sender=" + "AUTOBX";
				String numbers = "&numbers=" + "91" + mobileNumber;

				// Send data
				HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/").openConnection();
				String data = apiKey + numbers + message + sender;
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
				conn.getOutputStream().write(data.getBytes("UTF-8"));
				final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				final StringBuffer stringBuffer = new StringBuffer();
				String line;
				while ((line = rd.readLine()) != null) {
					stringBuffer.append(line);
				}

				System.out.println(stringBuffer.toString());

				rd.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

	}




}
