package com.xtc.example;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.xtc.diydial.iplugin.IPlugin;
import com.xtc.diydial.iplugin.IMessageCallback;

/**
 * Example plugin component for XTC compose dials.
 * Implements the IPlugin interface required by the Launcher.
 */
public class Plugin implements IPlugin {
    private TextView view;
    private IMessageCallback callback;

    @Override
    public String getSourceName() {
        return "example_plugin";
    }

    @Override
    public View getView(String extra) {
        if (view == null) {
            view = new TextView(null);
        }
        view.setText("Hello XTC");
        view.setTextColor(Color.WHITE);
        view.setTextSize(18);
        view.setBackgroundColor(Color.parseColor("#33000000"));
        return view;
    }

    @Override
    public void initPlugin(Context context, String apkPath) {
        if (context != null && view == null) {
            view = new TextView(context);
        }
    }

    @Override
    public void registerCallback(IMessageCallback callback) {
        this.callback = callback;
    }

    @Override
    public Object sendMessage(int action, Object data) {
        if (callback != null) {
            callback.callback(0, data);
        }
        return null;
    }

    @Override
    public void sendMessage(int action, Object data, IMessageCallback callback) {
    }
}
