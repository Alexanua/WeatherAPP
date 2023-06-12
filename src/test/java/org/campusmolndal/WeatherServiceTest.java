package org.campusmolndal;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class WeatherServiceTest {

    @Mock
    private WeatherServiceAPI weatherServiceAPI;

    private WeatherService weatherService;

    @BeforeEach
    public void setUp() {
        // Initialize the mocks before each test
        MockitoAnnotations.initMocks(this);

        // Create an instance of WeatherService and pass in the mocked WeatherServiceAPI object
        weatherService = new WeatherService(weatherServiceAPI);
    }

    @Test
    public void testGetWeatherDescription() {
        // Simulate the behavior of weatherServiceAPI using the mock
        when(weatherServiceAPI.getWeatherDescription("Karlstad")).thenReturn("Cloudy");

        // Test WeatherService
        String description = weatherService.getWeatherDescription("Karlstad");
        // Verify that the result is as expected
        assertEquals("Cloudy", description);
    }

    @Test
    public void testGetTemperature() {
        // Simulate the behavior of weatherServiceAPI using the mock
        when(weatherServiceAPI.getTemperature("Karlstad")).thenReturn(20.0);

        // Test WeatherService
        double temperature = weatherService.getTemperature("Karlstad");
        // Verify that the result is as expected
        assertEquals(20.0, temperature);
    }

    @Test
    public void testGetWind() {
        // Simulate the behavior of weatherServiceAPI using the mock
        when(weatherServiceAPI.getWind("Karlstad")).thenReturn("5 m/s");

        // Test WeatherService
        String wind = weatherService.getWind("Karlstad");
        // Verify that the result is as expected
        assertEquals("5 m/s", wind);
    }

    @Test
    public void testWillItRain() {
        // Simulate the behavior of weatherServiceAPI using the mock
        when(weatherServiceAPI.willItRain("Karlstad")).thenReturn(false);

        // Test WeatherService
        boolean willItRain = weatherService.willItRain("Karlstad");
        // Verify that the result is as expected
        assertEquals(false, willItRain);
    }
}
