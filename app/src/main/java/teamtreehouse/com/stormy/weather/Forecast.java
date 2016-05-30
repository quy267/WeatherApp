package teamtreehouse.com.stormy.weather;

import teamtreehouse.com.stormy.R;

/**
 * Created by MyPC on 29/05/2016.
 */
public class Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForecast;
    private Day[] mDailyForecast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }

    public static int getIconId(String IconString) {
        int iconId = R.drawable.clear_day;
        if (IconString.equals("clear-day")) {
            iconId = R.drawable.clear_day;
        } else if (IconString.equals("clear-night")) {
            iconId = R.drawable.clear_night;
        } else if (IconString.equals("rain")) {
            iconId = R.drawable.rain;
        } else if (IconString.equals("snow")) {
            iconId = R.drawable.snow;
        } else if (IconString.equals("sleet")) {
            iconId = R.drawable.sleet;
        } else if (IconString.equals("wind")) {
            iconId = R.drawable.wind;
        } else if (IconString.equals("fog")) {
            iconId = R.drawable.fog;
        } else if (IconString.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        } else if (IconString.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        } else if (IconString.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }
        return iconId;
    }
}
