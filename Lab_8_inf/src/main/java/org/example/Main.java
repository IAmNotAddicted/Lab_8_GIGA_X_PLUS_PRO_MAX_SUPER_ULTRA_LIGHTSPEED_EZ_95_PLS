package org.example;

import java.io.IOException;

import static org.example.WeatherAnalyzer.executeHttpGet;

public class Main
{
    public static void main(String[] args) throws IOException {
        // Execute HTTP GET for obtaining data
        String cityName = "Kyiv";
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather" + "?q=" + cityName + "&appid=" + "520282522be72f9bb34fedf9c8c7303b";
        String jsonResponse = executeHttpGet(apiUrl);


        // Example output of the obtained data to the console
        System.out.println("JSON Response: " + jsonResponse);
    }
}