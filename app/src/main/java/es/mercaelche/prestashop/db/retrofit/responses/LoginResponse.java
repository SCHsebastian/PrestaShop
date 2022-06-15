
package es.mercaelche.prestashop.db.retrofit.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import es.mercaelche.prestashop.db.classes.Psdata;


public class LoginResponse {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("psdata")
    @Expose
    private Psdata psdata;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Psdata getPsdata() {
        return psdata;
    }

    public void setPsdata(Psdata psdata) {
        this.psdata = psdata;
    }

}
