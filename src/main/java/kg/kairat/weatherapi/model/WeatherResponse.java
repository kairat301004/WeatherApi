package kg.kairat.weatherapi.model;

import java.util.List;

public record WeatherResponse(
        List<CityWeather> results
){}
