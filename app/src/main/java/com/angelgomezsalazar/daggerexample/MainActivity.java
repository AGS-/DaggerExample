package com.angelgomezsalazar.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.angelgomezsalazar.daggerexample.component.DaggerVehicleComponent;
import com.angelgomezsalazar.daggerexample.component.VehicleComponent;
import com.angelgomezsalazar.daggerexample.model.Vehicle;
import com.angelgomezsalazar.daggerexample.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent component =
                DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();
        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
