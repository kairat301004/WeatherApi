package kg.kairat.weatherapi.model;

import java.util.List;

public record WeatherResponce(
        List<CityWeather> results
){}
