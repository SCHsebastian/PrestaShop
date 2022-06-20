package es.mercaelche.prestashop.db.retrofit.binshop;


import com.google.gson.JsonObject;

public class BaseResponse {

    private Boolean success;
    private Integer code;
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
