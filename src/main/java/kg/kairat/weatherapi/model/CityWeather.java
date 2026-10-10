package kg.kairat.weatherapi.model;

public record CityWeather (
    String city,
    Double temperature,
    Integer humidity,
    Double windSpeed
){}

