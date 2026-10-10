package kg.kairat.weatherapi.model.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CurrentWeatherDto(
        String name,
        @JsonProperty("temperature_2m")
        double temperature,

        @JsonProperty("relative_humidity_2m")
        Integer humidity,

        @JsonProperty("wind_speed_10m")
        double windSpeed
) {}
