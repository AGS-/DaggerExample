package com.angelgomezsalazar.daggerexample.component;

import com.angelgomezsalazar.daggerexample.model.Vehicle;
import com.angelgomezsalazar.daggerexample.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by angelgomez on 9/12/16.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    // In the @Component annotation we specify which modules are going to be used

    // Here we specify methods for objects we will need and it will give us the object with all its
    // dependencies satisfied.
    Vehicle provideVehicle();

}
