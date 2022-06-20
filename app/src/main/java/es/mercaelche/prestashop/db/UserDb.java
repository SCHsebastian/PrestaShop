package es.mercaelche.prestashop.db;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Query;
import androidx.room.RoomDatabase;

public class UserDb {

    @Database(entities = {User.class}, version = 1)
    public abstract class AppDatabase extends RoomDatabase {
        public abstract UserDao userDao();
    }

    @Dao
    public interface UserDao {
        @Query("SELECT * FROM User WHERE uid = 1")
        User getUser();

        @Insert
        void insert(User user);

        @Delete
        void delete(User user);
    }

    @Entity
    public static class User {
        @PrimaryKey
        public int uid;

        @ColumnInfo(name = "first_name")
        public String firstName;

        @ColumnInfo(name = "last_name")
        public String lastName;

        @ColumnInfo(name = "email")
        public String email;

        @ColumnInfo(name = "cookie-name")
        public String cookieName;

        @ColumnInfo(name = "cookie-value")
        public String cookieValue;

        public User(String firstName, String lastName, String email, String cookieName, String cookieValue) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.cookieName = cookieName;
            this.cookieValue = cookieValue;
        }
    }
}
