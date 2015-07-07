package co.mobiwise.dagger2example.model.car;

import android.util.Log;

import javax.inject.Inject;

import co.mobiwise.dagger2example.model.Car;
import co.mobiwise.dagger2example.model.Engine;

/**
 * Created by mertsimsek on 07/07/15.
 */
public class MercedesCar implements Car {

    Engine engine;

    @Inject
    public MercedesCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.v("DaggerExample","Mercedes Car is about to start.");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.v("DaggerExample", "Mercedes Car is about to stop.");
        engine.turnOff();
    }
}
