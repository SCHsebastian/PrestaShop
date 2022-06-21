package es.mercaelche.prestashop.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {
    @Query("SELECT * FROM UserDb")
    UserDb getUser();

    @Insert
    void insert(UserDb user);

    @Delete
    void delete(UserDb user);
}
