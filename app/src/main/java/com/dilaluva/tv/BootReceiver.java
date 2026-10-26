package com.dilaluva.tv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/** Abre DILALUVA TV automáticamente cuando el aparato (p. ej. un Fire TV) arranca. */
public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String a = intent != null ? intent.getAction() : null;
        if (Intent.ACTION_BOOT_COMPLETED.equals(a)
                || "android.intent.action.LOCKED_BOOT_COMPLETED".equals(a)) {
            Intent launch = new Intent(context, MainActivity.class);
            launch.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(launch);
        }
    }
}
