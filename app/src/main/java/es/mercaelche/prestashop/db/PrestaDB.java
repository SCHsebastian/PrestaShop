package es.mercaelche.prestashop.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {UserDb.class}, version = 1, exportSchema = false)
public abstract class PrestaDB extends RoomDatabase {

    public static PrestaDB INSTANCE;

    public static PrestaDB getInstance(Context context){
        if (INSTANCE==null){
            INSTANCE = Room.databaseBuilder(context, PrestaDB.class, "presta-db")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }

    public abstract UserDao userDao();
}
