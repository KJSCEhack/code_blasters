package com.example.dhruv.geofence;

/**
 * Created by Dhruv on 06-Oct-17.
 */

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;


public class Constants {

    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = 12 * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 20;

    public static final HashMap<String, LatLng> LANDMARKS = new HashMap<String, LatLng>();
    static {
        // K.J somaiya College of Engineering
        LANDMARKS.put("College", new LatLng(19.0731, 72.8998));

        // Shiv Shakti Heights
        LANDMARKS.put("Home", new LatLng(19.0835, 72.9101));


    }
}