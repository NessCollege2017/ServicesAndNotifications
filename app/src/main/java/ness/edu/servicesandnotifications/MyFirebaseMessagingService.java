package ness.edu.servicesandnotifications;

import android.content.Intent;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Receive firebase messages here
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public static final String TAG = "Ness";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Log.d(TAG, "onMessageReceived: Received");
    }

    @Override
    public void handleIntent(Intent intent) {
        super.handleIntent(intent);
    }
}
