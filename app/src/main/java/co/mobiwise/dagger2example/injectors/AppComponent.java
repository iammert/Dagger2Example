package co.mobiwise.dagger2example.injectors;

import javax.inject.Singleton;

import co.mobiwise.dagger2example.views.CarActivity;
import dagger.Component;

/**
 * Created by mertsimsek on 07/07/15.
 */
@Singleton @Component(modules = AppModule.class)
public interface AppComponent {
    void inject(CarActivity carActivity);
}
