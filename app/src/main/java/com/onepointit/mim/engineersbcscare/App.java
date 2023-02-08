package com.onepointit.mim.engineersbcscare;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import androidx.appcompat.app.AppCompatDelegate;

import com.onepointit.mim.engineersbcscare.dependency.AppComponent;
import com.onepointit.mim.engineersbcscare.dependency.DaggerAppComponent;
import com.onepointit.mim.engineersbcscare.net.RequestServices;

import io.realm.Realm;



public class App extends Application {

    private static AppComponent appComponent;

    private static App mInstance;
    private static final String CHANNEL_ID = "CHANNEL_ID";

    private RequestServices requestServices = new RequestServices();


    public static synchronized App getInstance() {
        return mInstance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        mInstance = this;
        Realm.init(this);
        createNotificationChannel();
        //appComponent = DaggerAppComponent.Initializer.init(this, requestServices);
        appComponent = DaggerAppComponent.Initializer.init(this, requestServices);

    }

    public static AppComponent getComponent() {
        return appComponent;
    }


    public App getActivity() {
        return this;
    }

    //    @Override
//    protected void attachBaseContext(Context base) {
//        super.attachBaseContext(base);
//        MultiDex.install(this);
//    }
    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel serviceChannel = new NotificationChannel(
                    CHANNEL_ID,
                    "Foreground Service Channel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(serviceChannel);
        }
    }

}
