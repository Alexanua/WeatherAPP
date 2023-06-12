package org.campusmolndal;

public class WeatherService {
    WeatherServiceAPI weatherServiceAPI;

    public WeatherService(WeatherServiceAPI weatherServiceAPI) {
        this.weatherServiceAPI = weatherServiceAPI;
    }

    public String getWeatherDescription(String city) {
        return weatherServiceAPI.getWeatherDescription(city);
    }

    public double getTemperature(String city) {
        return weatherServiceAPI.getTemperature(city);
    }

    public boolean willItRain(String city) {
        return weatherServiceAPI.willItRain(city);
    }

    public String getWind(String city) {
        return weatherServiceAPI.getWind(city);
    }
}
