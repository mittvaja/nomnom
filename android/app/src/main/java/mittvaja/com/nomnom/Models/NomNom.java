package mittvaja.com.nomnom.Models;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.multidex.MultiDex;

import mittvaja.com.nomnom.Abstracts.AppDatabase;

/**
 * Created by Nachiket on 17-Mar-18.
 */

public class NomNom extends Application {

    public static AppDatabase database;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        database = Room
                .databaseBuilder(getApplicationContext(), AppDatabase.class, "bookmarks")
                .allowMainThreadQueries()
                .build();
    }
}
