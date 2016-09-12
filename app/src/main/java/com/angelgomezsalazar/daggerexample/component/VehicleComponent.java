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

    Vehicle provideVehicle();

}
