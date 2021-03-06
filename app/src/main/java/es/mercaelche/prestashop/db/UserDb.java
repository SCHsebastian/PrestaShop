package es.mercaelche.prestashop.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserDb {

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

    public UserDb(String firstName, String lastName, String email, String cookieName, String cookieValue) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cookieName = cookieName;
        this.cookieValue = cookieValue;
    }
}
