package co.mobiwise.dagger2example.views;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import javax.inject.Inject;

import co.mobiwise.dagger2example.Dagger2Application;
import co.mobiwise.dagger2example.R;
import co.mobiwise.dagger2example.model.Car;


public class CarActivity extends Activity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        inject();

        car.start();
        car.stop();

    }

    private void inject(){
        Dagger2Application app = (Dagger2Application) getApplication();
        app.getAppComponent().inject(this);
    }
}
