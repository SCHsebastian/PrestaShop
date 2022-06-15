
package es.mercaelche.prestashop.db.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Psdata {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("customer_id")
    @Expose
    private String customerId;
    @SerializedName("session_data")
    @Expose
    private Integer sessionData;
    @SerializedName("cart_count")
    @Expose
    private Integer cartCount;
    @SerializedName("user")
    @Expose
    private User user;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getSessionData() {
        return sessionData;
    }

    public void setSessionData(Integer sessionData) {
        this.sessionData = sessionData;
    }

    public Integer getCartCount() {
        return cartCount;
    }

    public void setCartCount(Integer cartCount) {
        this.cartCount = cartCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
