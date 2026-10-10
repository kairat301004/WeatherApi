package kg.kairat.weatherapi.model.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherApiResponseDto(CurrentWeatherDto current) {
}