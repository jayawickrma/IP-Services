package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Geolocation {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        String apiKey = "Ip2LocationExporter";
        String ipAddress = "175.157.236.246";

        Request request = new Request.Builder()
                .url("https://api.ipgeolocation.io/ipgeo?apiKey=" + apiKey + "&ip=" + ipAddress)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                String responseData = response.body().string();
                JsonObject jsonObject = JsonParser.parseString(responseData).getAsJsonObject();
                System.out.println("IP Address Location: " + jsonObject.get("city").getAsString() + ", " +
                        jsonObject.get("country_name").getAsString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
