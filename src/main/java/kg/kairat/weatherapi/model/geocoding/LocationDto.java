package kg.kairat.weatherapi.model.geocoding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LocationDto(String name,
                          double latitude,
                          double longitude
) {}