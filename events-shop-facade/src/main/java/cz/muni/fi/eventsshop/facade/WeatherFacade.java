package cz.muni.fi.eventsshop.facade;

/**
 * Created by patrik.cyprian on 26.5.2017.
 */
public interface WeatherFacade {

    String getWheatherForecast(String cityName) throws Exception;
}