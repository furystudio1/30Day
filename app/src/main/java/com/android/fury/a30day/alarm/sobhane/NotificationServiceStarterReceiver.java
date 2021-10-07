package com.android.fury.a30day.alarm.sobhane;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.google.firebase.crash.FirebaseCrash;

/**
 * Created by klogi
 *
 * Broadcast receiver for: BOOT_COMPLETED, TIMEZONE_CHANGED, and TIME_SET events. Sets Alarm Manager for notification;
 */
public final class NotificationServiceStarterReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationEventReceiver5.setupAlarm(context);
        FirebaseCrash.log("onReceive sobhane log 1");
    }
}