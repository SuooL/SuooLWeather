package net.suool.suoolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import net.suool.suoolweather.service.AutoUpdateService;

public class AutoUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }

}