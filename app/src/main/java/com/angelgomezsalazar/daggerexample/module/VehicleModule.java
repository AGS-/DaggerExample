package com.angelgomezsalazar.daggerexample.module;

import com.angelgomezsalazar.daggerexample.model.Motor;
import com.angelgomezsalazar.daggerexample.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by angelgomez on 9/12/16.
 */
@Module
public class VehicleModule {

    // Provides needed objects with their dependencies satisfied
    // @Singleton annotation indicates that only a single object will be instantiated

    @Provides @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }

}
