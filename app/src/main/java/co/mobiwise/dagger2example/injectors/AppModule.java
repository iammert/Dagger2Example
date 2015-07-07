package co.mobiwise.dagger2example.injectors;

import javax.inject.Singleton;

import co.mobiwise.dagger2example.Dagger2Application;
import co.mobiwise.dagger2example.model.Car;
import co.mobiwise.dagger2example.model.Engine;
import co.mobiwise.dagger2example.model.car.BMWCar;
import co.mobiwise.dagger2example.model.car.MercedesCar;
import co.mobiwise.dagger2example.model.engine.LPGEngine;
import co.mobiwise.dagger2example.model.engine.PetrolEngine;
import dagger.Module;
import dagger.Provides;

/**
 * Created by mertsimsek on 07/07/15.
 */
@Module
public class AppModule {

    private final Dagger2Application dagger2Application;

    public AppModule(Dagger2Application dagger2Application) {
        this.dagger2Application = dagger2Application;
    }

    @Provides @Singleton
    Dagger2Application provideApp(){
        return dagger2Application;
    }

    @Provides @Singleton
    Engine provideEngine(){
        return new LPGEngine();
    }

    @Provides @Singleton
    Car provideCar(Engine engine){
        return new MercedesCar(engine);
    }
}
