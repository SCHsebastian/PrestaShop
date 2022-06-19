package es.mercaelche.prestashop.db.retrofit.binshop;

import es.mercaelche.prestashop.db.classes.User;

public class Psdata {

    private String status;
    private String message;
    private String customerId;
    private Integer sessionData;
    private Integer cartCount;
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
