
package es.mercaelche.prestashop.db.classes;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class User {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("id_shop")
    @Expose
    private String idShop;
    @SerializedName("id_shop_group")
    @Expose
    private String idShopGroup;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("id_gender")
    @Expose
    private String idGender;
    @SerializedName("id_default_group")
    @Expose
    private String idDefaultGroup;
    @SerializedName("id_lang")
    @Expose
    private String idLang;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("newsletter")
    @Expose
    private String newsletter;
    @SerializedName("ip_registration_newsletter")
    @Expose
    private String ipRegistrationNewsletter;
    @SerializedName("newsletter_date_add")
    @Expose
    private String newsletterDateAdd;
    @SerializedName("optin")
    @Expose
    private String optin;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("siret")
    @Expose
    private String siret;
    @SerializedName("ape")
    @Expose
    private String ape;
    @SerializedName("outstanding_allow_amount")
    @Expose
    private String outstandingAllowAmount;
    @SerializedName("show_public_prices")
    @Expose
    private String showPublicPrices;
    @SerializedName("id_risk")
    @Expose
    private String idRisk;
    @SerializedName("max_payment_days")
    @Expose
    private String maxPaymentDays;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("is_guest")
    @Expose
    private String isGuest;
    @SerializedName("deleted")
    @Expose
    private String deleted;
    @SerializedName("date_add")
    @Expose
    private String dateAdd;
    @SerializedName("date_upd")
    @Expose
    private String dateUpd;
    @SerializedName("years")
    @Expose
    private String years;
    @SerializedName("days")
    @Expose
    private String days;
    @SerializedName("months")
    @Expose
    private String months;
    @SerializedName("geoloc_id_country")
    @Expose
    private String geolocIdCountry;
    @SerializedName("geoloc_id_state")
    @Expose
    private String geolocIdState;
    @SerializedName("geoloc_postcode")
    @Expose
    private String geolocPostcode;
    @SerializedName("logged")
    @Expose
    private Integer logged;
    @SerializedName("id_guest")
    @Expose
    private String idGuest;
    @SerializedName("groupBox")
    @Expose
    private String groupBox;
    @SerializedName("id_shop_list")
    @Expose
    private List<Object> idShopList = null;
    @SerializedName("force_id")
    @Expose
    private Boolean forceId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdShop() {
        return idShop;
    }

    public void setIdShop(String idShop) {
        this.idShop = idShop;
    }

    public String getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(String idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getIdGender() {
        return idGender;
    }

    public void setIdGender(String idGender) {
        this.idGender = idGender;
    }

    public String getIdDefaultGroup() {
        return idDefaultGroup;
    }

    public void setIdDefaultGroup(String idDefaultGroup) {
        this.idDefaultGroup = idDefaultGroup;
    }

    public String getIdLang() {
        return idLang;
    }

    public void setIdLang(String idLang) {
        this.idLang = idLang;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    public String getIpRegistrationNewsletter() {
        return ipRegistrationNewsletter;
    }

    public void setIpRegistrationNewsletter(String ipRegistrationNewsletter) {
        this.ipRegistrationNewsletter = ipRegistrationNewsletter;
    }

    public String getNewsletterDateAdd() {
        return newsletterDateAdd;
    }

    public void setNewsletterDateAdd(String newsletterDateAdd) {
        this.newsletterDateAdd = newsletterDateAdd;
    }

    public String getOptin() {
        return optin;
    }

    public void setOptin(String optin) {
        this.optin = optin;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getOutstandingAllowAmount() {
        return outstandingAllowAmount;
    }

    public void setOutstandingAllowAmount(String outstandingAllowAmount) {
        this.outstandingAllowAmount = outstandingAllowAmount;
    }

    public String getShowPublicPrices() {
        return showPublicPrices;
    }

    public void setShowPublicPrices(String showPublicPrices) {
        this.showPublicPrices = showPublicPrices;
    }

    public String getIdRisk() {
        return idRisk;
    }

    public void setIdRisk(String idRisk) {
        this.idRisk = idRisk;
    }

    public String getMaxPaymentDays() {
        return maxPaymentDays;
    }

    public void setMaxPaymentDays(String maxPaymentDays) {
        this.maxPaymentDays = maxPaymentDays;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getIsGuest() {
        return isGuest;
    }

    public void setIsGuest(String isGuest) {
        this.isGuest = isGuest;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    public String getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public String getGeolocIdCountry() {
        return geolocIdCountry;
    }

    public void setGeolocIdCountry(String geolocIdCountry) {
        this.geolocIdCountry = geolocIdCountry;
    }

    public String getGeolocIdState() {
        return geolocIdState;
    }

    public void setGeolocIdState(String geolocIdState) {
        this.geolocIdState = geolocIdState;
    }

    public String getGeolocPostcode() {
        return geolocPostcode;
    }

    public void setGeolocPostcode(String geolocPostcode) {
        this.geolocPostcode = geolocPostcode;
    }

    public Integer getLogged() {
        return logged;
    }

    public void setLogged(Integer logged) {
        this.logged = logged;
    }

    public String getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(String idGuest) {
        this.idGuest = idGuest;
    }

    public String getGroupBox() {
        return groupBox;
    }

    public void setGroupBox(String groupBox) {
        this.groupBox = groupBox;
    }

    public List<Object> getIdShopList() {
        return idShopList;
    }

    public void setIdShopList(List<Object> idShopList) {
        this.idShopList = idShopList;
    }

    public Boolean getForceId() {
        return forceId;
    }

    public void setForceId(Boolean forceId) {
        this.forceId = forceId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", idShop='" + idShop + '\'' +
                ", idShopGroup='" + idShopGroup + '\'' +
                ", note='" + note + '\'' +
                ", idGender='" + idGender + '\'' +
                ", idDefaultGroup='" + idDefaultGroup + '\'' +
                ", idLang='" + idLang + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", newsletter='" + newsletter + '\'' +
                ", ipRegistrationNewsletter='" + ipRegistrationNewsletter + '\'' +
                ", newsletterDateAdd='" + newsletterDateAdd + '\'' +
                ", optin='" + optin + '\'' +
                ", website='" + website + '\'' +
                ", company='" + company + '\'' +
                ", siret='" + siret + '\'' +
                ", ape='" + ape + '\'' +
                ", outstandingAllowAmount='" + outstandingAllowAmount + '\'' +
                ", showPublicPrices='" + showPublicPrices + '\'' +
                ", idRisk='" + idRisk + '\'' +
                ", maxPaymentDays='" + maxPaymentDays + '\'' +
                ", active='" + active + '\'' +
                ", isGuest='" + isGuest + '\'' +
                ", deleted='" + deleted + '\'' +
                ", dateAdd='" + dateAdd + '\'' +
                ", dateUpd='" + dateUpd + '\'' +
                ", years='" + years + '\'' +
                ", days='" + days + '\'' +
                ", months='" + months + '\'' +
                ", geolocIdCountry='" + geolocIdCountry + '\'' +
                ", geolocIdState='" + geolocIdState + '\'' +
                ", geolocPostcode='" + geolocPostcode + '\'' +
                ", logged=" + logged +
                ", idGuest='" + idGuest + '\'' +
                ", groupBox='" + groupBox + '\'' +
                ", idShopList=" + idShopList +
                ", forceId=" + forceId +
                '}';
    }
}
