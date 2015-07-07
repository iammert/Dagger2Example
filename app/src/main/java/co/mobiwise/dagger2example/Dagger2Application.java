package co.mobiwise.dagger2example;

import android.app.Application;

import co.mobiwise.dagger2example.injectors.AppComponent;
import co.mobiwise.dagger2example.injectors.AppModule;
import co.mobiwise.dagger2example.injectors.DaggerAppComponent;

/**
 * Created by mertsimsek on 07/07/15.
 */
public class Dagger2Application extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();

    }

    private void initializeInjector(){
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
