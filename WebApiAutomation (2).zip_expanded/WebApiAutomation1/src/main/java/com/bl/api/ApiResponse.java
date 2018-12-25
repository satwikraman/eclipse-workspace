package com.bl.api;

import java.io.FileReader;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.bl.utils.Constants;

public class ApiResponse {
	private JSONParser parser = new JSONParser();
	private JSONObject configObj;

	public ApiResponse() {
		getConfigFile();
	}

	public void getConfigFile() {
		try {
			configObj = (JSONObject) parser.parse(new FileReader(Constants.datajson));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	@Test(priority=1)
	public void zillowResponce() throws Exception {
		HttpClient client = HttpClients.createDefault();
		String stubsApiBaseUri = (String) configObj.get("ZillowApi");
		URIBuilder builder = new URIBuilder(stubsApiBaseUri);
		String listStubsUri = builder.build().toString();
		HttpGet getStubMethod = new HttpGet(listStubsUri);
		HttpResponse getStubResponse = client.execute(getStubMethod);
		int getStubStatusCode = getStubResponse.getStatusLine().getStatusCode();
		String responseBody = EntityUtils.toString(getStubResponse.getEntity());
		System.out.println(responseBody);
	}
}
