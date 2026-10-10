package kg.kairat.weatherapi.model.geocoding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GeocodingResponseDto(
        List<LocationDto> results
) {}

