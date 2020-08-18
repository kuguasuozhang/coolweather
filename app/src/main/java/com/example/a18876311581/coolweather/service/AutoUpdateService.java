package com.example.a18876311581.coolweather.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AutoUpdateService extends Service {
    public AutoUpdateService() {
    }



    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;

    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}
