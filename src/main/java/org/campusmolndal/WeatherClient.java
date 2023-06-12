package org.campusmolndal;

public class WeatherClient {

    public static void main(String[] args) {
        WeatherServiceAPI weatherServiceAPI = new WeatherServiceAPI(); // Du kan mocka eller implementera WeatherServiceAPI
        WeatherService weatherService = new WeatherService(weatherServiceAPI);

        String city = "Karlstad";

        System.out.println("Weather in " + city + ":");
        System.out.println("Description: " + weatherService.getWeatherDescription(city));
        System.out.println("Temperature: " + weatherService.getTemperature(city) + " degrees");
        System.out.println("Wind: " + weatherService.getWind(city));
        System.out.println("Will it rain? " + (weatherService.willItRain(city) ? "Yes" : "No"));
    }
}
