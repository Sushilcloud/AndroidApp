package com.example.shiva.daburemployee;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyfirebaseInstanceIdService extends FirebaseMessagingService {
    public MyfirebaseInstanceIdService() {
    }

    @Override
    public void onNewToken(String token) {
        Log.d("Fcm Token", "Refreshed Token: " + token);
        sendRegistrationtoServer(token);
    }

    private void sendRegistrationtoServer(String token) {
    }
}
