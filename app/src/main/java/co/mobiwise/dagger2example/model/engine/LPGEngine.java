package co.mobiwise.dagger2example.model.engine;

import android.util.Log;

import co.mobiwise.dagger2example.model.Engine;

/**
 * Created by mertsimsek on 07/07/15.
 */
public class LPGEngine implements Engine {

    @Override
    public void turnOn() {
        Log.v("DaggerExample", "LPG Engine turned on");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerExample", "LPG Engine turned off.");
    }
}
