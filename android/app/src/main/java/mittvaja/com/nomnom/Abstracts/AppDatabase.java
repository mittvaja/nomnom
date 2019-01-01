package mittvaja.com.nomnom.Abstracts;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import mittvaja.com.nomnom.Interfaces.IDoa;
import mittvaja.com.nomnom.Models.PlaceBookmark;


@Database(entities = {PlaceBookmark.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract IDoa iDoa();
}
