package main.service;

import javax.servlet.http.HttpServletRequest;

import main.externalapi.model.openweathermap.OpenWeatherMap;

public interface ExternalAPIsService {

	public OpenWeatherMap getData(HttpServletRequest request);
	
}
