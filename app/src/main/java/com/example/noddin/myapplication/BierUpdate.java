package com.example.noddin.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


/**
 * Created by Noddin on 14/11/2016.
 */

public class BierUpdate extends BroadcastReceiver  {

    onListener listener;

    BierUpdate(onListener listener){
        this.listener = listener;
    }


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, R.string.toast2, Toast.LENGTH_LONG).show();
        listener.onFinish();
    }

}

