package es.mercaelche.prestashop.db.retrofit.prestashop;

import java.util.Date;
import java.util.List;

public class ResponseProduct {

    public class id_manufacturer {
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class id_category_default {
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class id_default_image {
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public boolean getnotFilterable() {
            return this.notFilterable; }
        public void setnotFilterable(boolean notFilterable) {
            this.notFilterable = notFilterable; }
        boolean notFilterable;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class id_default_combination {
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public boolean getnotFilterable() {
            return this.notFilterable; }
        public void setnotFilterable(boolean notFilterable) {
            this.notFilterable = notFilterable; }
        boolean notFilterable;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class id_tax_rules_group {
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class position_in_category {
        public boolean getnotFilterable() {
            return this.notFilterable; }
        public void setnotFilterable(boolean notFilterable) {
            this.notFilterable = notFilterable; }
        boolean notFilterable;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class manufacturer_name {
        public boolean getnotFilterable() {
            return this.notFilterable; }
        public void setnotFilterable(boolean notFilterable) {
            this.notFilterable = notFilterable; }
        boolean notFilterable;
        public String gettext() {
            return this.text; }
        public void settext(String text) {
            this.text = text; }
        String text;
    }

    public class quantity {
        public boolean getnotFilterable() {
            return this.notFilterable; }
        public void setnotFilterable(boolean notFilterable) {
            this.notFilterable = notFilterable; }
        boolean notFilterable;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class type {
        public boolean getnotFilterable() {
            return this.notFilterable; }
        public void setnotFilterable(boolean notFilterable) {
            this.notFilterable = notFilterable; }
        boolean notFilterable;
        public String gettext() {
            return this.text; }
        public void settext(String text) {
            this.text = text; }
        String text;
    }

    public class language {
        public int getid() {
            return this.id; }
        public void setid(int id) {
            this.id = id; }
        int id;
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public String gettext() {
            return this.text; }
        public void settext(String text) {
            this.text = text; }
        String text;
    }

    public class delivery_in_stock {
        public List<language> getlanguage() {
            return this.language; }
        public void setlanguage(List<language> language) {
            this.language = language; }
        List<language> language;
    }

    public class delivery_out_stock {
        public List<language> getlanguage() {
            return this.language; }
        public void setlanguage(List<language> language) {
            this.language = language; }
        List<language> language;
    }

    public class meta_description {
        public List<language> getlanguage() {
            return this.language; }
        public void setlanguage(List<language> language) {
            this.language = language; }
        List<language> language;
    }

    public class meta_keywords {
        public List<language> getlanguage() {
            return this.language; }
        public void setlanguage(List<language> language) {
            this.language = language; }
        List<language> language;
    }

    public class meta_title {
        public List<language> getlanguage() {
            return this.language; }
        public void setlanguage(List<language> language) {
            this.language = language; }
        List<language> language;
    }

    public class link_rewrite {
        public List<language> getlanguage() {
            return this.language; }
        public void setlanguage(List<language> language) {
            this.language = language; }
        List<language> language;
    }

    public class name {
        public List<language> getlanguage() {
            return this.language; }
        public void setlanguage(List<language> language) {
            this.language = language; }
        List<language> language;
    }

    public class description {
        public List<language> getlanguage() {
            return this.language; }
        public void setlanguage(List<language> language) {
            this.language = language; }
        List<language> language;
    }

    public class description_short {
        public List<language> getlanguage() {
            return this.language; }
        public void setlanguage(List<language> language) {
            this.language = language; }
        List<language> language;
    }

    public class available_now {
        public List<language> getlanguage() {
            return this.language; }
        public void setlanguage(List<language> language) {
            this.language = language; }
        List<language> language;
    }

    public class available_later {
        public List<language> getlanguage() {
            return this.language; }
        public void setlanguage(List<language> language) {
            this.language = language; }
        List<language> language;
    }

    public class category {
        public int getid() {
            return this.id; }
        public void setid(int id) {
            this.id = id; }
        int id;
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class categories {
        public List<category> getcategory() {
            return this.category; }
        public void setcategory(List<category> category) {
            this.category = category; }
        List<category> category;
        public String getnodeType() {
            return this.nodeType; }
        public void setnodeType(String nodeType) {
            this.nodeType = nodeType; }
        String nodeType;
        public String getapi() {
            return this.api; }
        public void setapi(String api) {
            this.api = api; }
        String api;
        public Date gettext() {
            return this.text; }
        public void settext(Date text) {
            this.text = text; }
        Date text;
    }

    public class image {
        public int getid() {
            return this.id; }
        public void setid(int id) {
            this.id = id; }
        int id;
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class images {
        public image getimage() {
            return this.image; }
        public void setimage(image image) {
            this.image = image; }
        image image;
        public String getnodeType() {
            return this.nodeType; }
        public void setnodeType(String nodeType) {
            this.nodeType = nodeType; }
        String nodeType;
        public String getapi() {
            return this.api; }
        public void setapi(String api) {
            this.api = api; }
        String api;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class combination {
        public int getid() {
            return this.id; }
        public void setid(int id) {
            this.id = id; }
        int id;
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class combinations {
        public List<combination> getcombination() {
            return this.combination; }
        public void setcombination(List<combination> combination) {
            this.combination = combination; }
        List<combination> combination;
        public String getnodeType() {
            return this.nodeType; }
        public void setnodeType(String nodeType) {
            this.nodeType = nodeType; }
        String nodeType;
        public String getapi() {
            return this.api; }
        public void setapi(String api) {
            this.api = api; }
        String api;
        public String gettext() {
            return this.text; }
        public void settext(String text) {
            this.text = text; }
        String text;
    }

    public class product_option_value {
        public int getid() {
            return this.id; }
        public void setid(int id) {
            this.id = id; }
        int id;
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class product_option_values {
        public List<product_option_value> getproduct_option_value() {
            return this.product_option_value; }
        public void setproduct_option_value(List<product_option_value> product_option_value) {
            this.product_option_value = product_option_value; }
        List<product_option_value> product_option_value;
        public String getnodeType() {
            return this.nodeType; }
        public void setnodeType(String nodeType) {
            this.nodeType = nodeType; }
        String nodeType;
        public String getapi() {
            return this.api; }
        public void setapi(String api) {
            this.api = api; }
        String api;
        public String gettext() {
            return this.text; }
        public void settext(String text) {
            this.text = text; }
        String text;
    }

    public class id_feature_value {
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public int gettext() {
            return this.text; }
        public void settext(int text) {
            this.text = text; }
        int text;
    }

    public class product_feature {
        public int getid() {
            return this.id; }
        public void setid(int id) {
            this.id = id; }
        int id;
        public id_feature_value getid_feature_value() {
            return this.id_feature_value; }
        public void setid_feature_value(id_feature_value id_feature_value) {
            this.id_feature_value = id_feature_value; }
        id_feature_value id_feature_value;
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public Date gettext() {
            return this.text; }
        public void settext(Date text) {
            this.text = text; }
        Date text;
    }

    public class product_features {
        public List<product_feature> getproduct_feature() {
            return this.product_feature; }
        public void setproduct_feature(List<product_feature> product_feature) {
            this.product_feature = product_feature; }
        List<product_feature> product_feature;
        public String getnodeType() {
            return this.nodeType; }
        public void setnodeType(String nodeType) {
            this.nodeType = nodeType; }
        String nodeType;
        public String getapi() {
            return this.api; }
        public void setapi(String api) {
            this.api = api; }
        String api;
        public String gettext() {
            return this.text; }
        public void settext(String text) {
            this.text = text; }
        String text;
    }

    public class tags {
        public String getnodeType() {
            return this.nodeType; }
        public void setnodeType(String nodeType) {
            this.nodeType = nodeType; }
        String nodeType;
        public String getapi() {
            return this.api; }
        public void setapi(String api) {
            this.api = api; }
        String api;
    }

    public class stock_available {
        public int getid() {
            return this.id; }
        public void setid(int id) {
            this.id = id; }
        int id;
        public int getid_product_attribute() {
            return this.id_product_attribute; }
        public void setid_product_attribute(int id_product_attribute) {
            this.id_product_attribute = id_product_attribute; }
        int id_product_attribute;
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
        public String gettext() {
            return this.text; }
        public void settext(String text) {
            this.text = text; }
        String text;
    }

    public class stock_availables {
        public List<stock_available> getstock_available() {
            return this.stock_available; }
        public void setstock_available(List<stock_available> stock_available) {
            this.stock_available = stock_available; }
        List<stock_available> stock_available;
        public String getnodeType() {
            return this.nodeType; }
        public void setnodeType(String nodeType) {
            this.nodeType = nodeType; }
        String nodeType;
        public String getapi() {
            return this.api; }
        public void setapi(String api) {
            this.api = api; }
        String api;
        public String gettext() {
            return this.text; }
        public void settext(String text) {
            this.text = text; }
        String text;
    }

    public class attachments {
        public String getnodeType() {
            return this.nodeType; }
        public void setnodeType(String nodeType) {
            this.nodeType = nodeType; }
        String nodeType;
        public String getapi() {
            return this.api; }
        public void setapi(String api) {
            this.api = api; }
        String api;
    }

    public class accessories {
        public String getnodeType() {
            return this.nodeType; }
        public void setnodeType(String nodeType) {
            this.nodeType = nodeType; }
        String nodeType;
        public String getapi() {
            return this.api; }
        public void setapi(String api) {
            this.api = api; }
        String api;
    }

    public class product_bundle {
        public String getnodeType() {
            return this.nodeType; }
        public void setnodeType(String nodeType) {
            this.nodeType = nodeType; }
        String nodeType;
        public String getapi() {
            return this.api; }
        public void setapi(String api) {
            this.api = api; }
        String api;
    }

    public class associations {
        public categories getcategories() {
            return this.categories; }
        public void setcategories(categories categories) {
            this.categories = categories; }
        categories categories;
        public images getimages() {
            return this.images; }
        public void setimages(images images) {
            this.images = images; }
        images images;
        public combinations getcombinations() {
            return this.combinations; }
        public void setcombinations(combinations combinations) {
            this.combinations = combinations; }
        combinations combinations;
        public product_option_values getproduct_option_values() {
            return this.product_option_values; }
        public void setproduct_option_values(product_option_values product_option_values) {
            this.product_option_values = product_option_values; }
        product_option_values product_option_values;
        public product_features getproduct_features() {
            return this.product_features; }
        public void setproduct_features(product_features product_features) {
            this.product_features = product_features; }
        product_features product_features;
        public tags gettags() {
            return this.tags; }
        public void settags(tags tags) {
            this.tags = tags; }
        tags tags;
        public stock_availables getstock_availables() {
            return this.stock_availables; }
        public void setstock_availables(stock_availables stock_availables) {
            this.stock_availables = stock_availables; }
        stock_availables stock_availables;
        public attachments getattachments() {
            return this.attachments; }
        public void setattachments(attachments attachments) {
            this.attachments = attachments; }
        attachments attachments;
        public accessories getaccessories() {
            return this.accessories; }
        public void setaccessories(accessories accessories) {
            this.accessories = accessories; }
        accessories accessories;
        public product_bundle getproduct_bundle() {
            return this.product_bundle; }
        public void setproduct_bundle(product_bundle product_bundle) {
            this.product_bundle = product_bundle; }
        product_bundle product_bundle;
    }

    public class product {
        public int getid() {
            return this.id; }
        public void setid(int id) {
            this.id = id; }
        int id;
        public id_manufacturer getid_manufacturer() {
            return this.id_manufacturer; }
        public void setid_manufacturer(id_manufacturer id_manufacturer) {
            this.id_manufacturer = id_manufacturer; }
        id_manufacturer id_manufacturer;
        public int getid_supplier() {
            return this.id_supplier; }
        public void setid_supplier(int id_supplier) {
            this.id_supplier = id_supplier; }
        int id_supplier;
        public id_category_default getid_category_default() {
            return this.id_category_default; }
        public void setid_category_default(id_category_default id_category_default) {
            this.id_category_default = id_category_default; }
        id_category_default id_category_default;
        public String get_new() {
            return this._new; }
        public void set_new(String _new) {
            this._new = _new; }
        String _new;
        public int getcache_default_attribute() {
            return this.cache_default_attribute; }
        public void setcache_default_attribute(int cache_default_attribute) {
            this.cache_default_attribute = cache_default_attribute; }
        int cache_default_attribute;
        public id_default_image getid_default_image() {
            return this.id_default_image; }
        public void setid_default_image(id_default_image id_default_image) {
            this.id_default_image = id_default_image; }
        id_default_image id_default_image;
        public id_default_combination getid_default_combination() {
            return this.id_default_combination; }
        public void setid_default_combination(id_default_combination id_default_combination) {
            this.id_default_combination = id_default_combination; }
        id_default_combination id_default_combination;
        public id_tax_rules_group getid_tax_rules_group() {
            return this.id_tax_rules_group; }
        public void setid_tax_rules_group(id_tax_rules_group id_tax_rules_group) {
            this.id_tax_rules_group = id_tax_rules_group; }
        id_tax_rules_group id_tax_rules_group;
        public position_in_category getposition_in_category() {
            return this.position_in_category; }
        public void setposition_in_category(position_in_category position_in_category) {
            this.position_in_category = position_in_category; }
        position_in_category position_in_category;
        public manufacturer_name getmanufacturer_name() {
            return this.manufacturer_name; }
        public void setmanufacturer_name(manufacturer_name manufacturer_name) {
            this.manufacturer_name = manufacturer_name; }
        manufacturer_name manufacturer_name;
        public quantity getquantity() {
            return this.quantity; }
        public void setquantity(quantity quantity) {
            this.quantity = quantity; }
        quantity quantity;
        public type gettype() {
            return this.type; }
        public void settype(type type) {
            this.type = type; }
        type type;
        public int getid_shop_default() {
            return this.id_shop_default; }
        public void setid_shop_default(int id_shop_default) {
            this.id_shop_default = id_shop_default; }
        int id_shop_default;
        public String getreference() {
            return this.reference; }
        public void setreference(String reference) {
            this.reference = reference; }
        String reference;
        public String getsupplier_reference() {
            return this.supplier_reference; }
        public void setsupplier_reference(String supplier_reference) {
            this.supplier_reference = supplier_reference; }
        String supplier_reference;
        public String getlocation() {
            return this.location; }
        public void setlocation(String location) {
            this.location = location; }
        String location;
        public double getwidth() {
            return this.width; }
        public void setwidth(double width) {
            this.width = width; }
        double width;
        public double getheight() {
            return this.height; }
        public void setheight(double height) {
            this.height = height; }
        double height;
        public double getdepth() {
            return this.depth; }
        public void setdepth(double depth) {
            this.depth = depth; }
        double depth;
        public double getweight() {
            return this.weight; }
        public void setweight(double weight) {
            this.weight = weight; }
        double weight;
        public int getquantity_discount() {
            return this.quantity_discount; }
        public void setquantity_discount(int quantity_discount) {
            this.quantity_discount = quantity_discount; }
        int quantity_discount;
        public String getean13() {
            return this.ean13; }
        public void setean13(String ean13) {
            this.ean13 = ean13; }
        String ean13;
        public String getisbn() {
            return this.isbn; }
        public void setisbn(String isbn) {
            this.isbn = isbn; }
        String isbn;
        public String getupc() {
            return this.upc; }
        public void setupc(String upc) {
            this.upc = upc; }
        String upc;
        public String getmpn() {
            return this.mpn; }
        public void setmpn(String mpn) {
            this.mpn = mpn; }
        String mpn;
        public int getcache_is_pack() {
            return this.cache_is_pack; }
        public void setcache_is_pack(int cache_is_pack) {
            this.cache_is_pack = cache_is_pack; }
        int cache_is_pack;
        public int getcache_has_attachments() {
            return this.cache_has_attachments; }
        public void setcache_has_attachments(int cache_has_attachments) {
            this.cache_has_attachments = cache_has_attachments; }
        int cache_has_attachments;
        public int getis_virtual() {
            return this.is_virtual; }
        public void setis_virtual(int is_virtual) {
            this.is_virtual = is_virtual; }
        int is_virtual;
        public int getstate() {
            return this.state; }
        public void setstate(int state) {
            this.state = state; }
        int state;
        public int getadditional_delivery_times() {
            return this.additional_delivery_times; }
        public void setadditional_delivery_times(int additional_delivery_times) {
            this.additional_delivery_times = additional_delivery_times; }
        int additional_delivery_times;
        public delivery_in_stock getdelivery_in_stock() {
            return this.delivery_in_stock; }
        public void setdelivery_in_stock(delivery_in_stock delivery_in_stock) {
            this.delivery_in_stock = delivery_in_stock; }
        delivery_in_stock delivery_in_stock;
        public delivery_out_stock getdelivery_out_stock() {
            return this.delivery_out_stock; }
        public void setdelivery_out_stock(delivery_out_stock delivery_out_stock) {
            this.delivery_out_stock = delivery_out_stock; }
        delivery_out_stock delivery_out_stock;
        public String getproduct_type() {
            return this.product_type; }
        public void setproduct_type(String product_type) {
            this.product_type = product_type; }
        String product_type;
        public int geton_sale() {
            return this.on_sale; }
        public void seton_sale(int on_sale) {
            this.on_sale = on_sale; }
        int on_sale;
        public int getonline_only() {
            return this.online_only; }
        public void setonline_only(int online_only) {
            this.online_only = online_only; }
        int online_only;
        public double getecotax() {
            return this.ecotax; }
        public void setecotax(double ecotax) {
            this.ecotax = ecotax; }
        double ecotax;
        public int getminimal_quantity() {
            return this.minimal_quantity; }
        public void setminimal_quantity(int minimal_quantity) {
            this.minimal_quantity = minimal_quantity; }
        int minimal_quantity;
        public String getlow_stock_threshold() {
            return this.low_stock_threshold; }
        public void setlow_stock_threshold(String low_stock_threshold) {
            this.low_stock_threshold = low_stock_threshold; }
        String low_stock_threshold;
        public int getlow_stock_alert() {
            return this.low_stock_alert; }
        public void setlow_stock_alert(int low_stock_alert) {
            this.low_stock_alert = low_stock_alert; }
        int low_stock_alert;
        public double getprice() {
            return this.price; }
        public void setprice(double price) {
            this.price = price; }
        double price;
        public double getwholesale_price() {
            return this.wholesale_price; }
        public void setwholesale_price(double wholesale_price) {
            this.wholesale_price = wholesale_price; }
        double wholesale_price;
        public String getunity() {
            return this.unity; }
        public void setunity(String unity) {
            this.unity = unity; }
        String unity;
        public double getunit_price_ratio() {
            return this.unit_price_ratio; }
        public void setunit_price_ratio(double unit_price_ratio) {
            this.unit_price_ratio = unit_price_ratio; }
        double unit_price_ratio;
        public double getadditional_shipping_cost() {
            return this.additional_shipping_cost; }
        public void setadditional_shipping_cost(double additional_shipping_cost) {
            this.additional_shipping_cost = additional_shipping_cost; }
        double additional_shipping_cost;
        public int getcustomizable() {
            return this.customizable; }
        public void setcustomizable(int customizable) {
            this.customizable = customizable; }
        int customizable;
        public int gettext_fields() {
            return this.text_fields; }
        public void settext_fields(int text_fields) {
            this.text_fields = text_fields; }
        int text_fields;
        public int getuploadable_files() {
            return this.uploadable_files; }
        public void setuploadable_files(int uploadable_files) {
            this.uploadable_files = uploadable_files; }
        int uploadable_files;
        public int getactive() {
            return this.active; }
        public void setactive(int active) {
            this.active = active; }
        int active;
        public int getredirect_type() {
            return this.redirect_type; }
        public void setredirect_type(int redirect_type) {
            this.redirect_type = redirect_type; }
        int redirect_type;
        public int getid_type_redirected() {
            return this.id_type_redirected; }
        public void setid_type_redirected(int id_type_redirected) {
            this.id_type_redirected = id_type_redirected; }
        int id_type_redirected;
        public int getavailable_for_order() {
            return this.available_for_order; }
        public void setavailable_for_order(int available_for_order) {
            this.available_for_order = available_for_order; }
        int available_for_order;
        public String getavailable_date() {
            return this.available_date; }
        public void setavailable_date(String available_date) {
            this.available_date = available_date; }
        String available_date;
        public int getshow_condition() {
            return this.show_condition; }
        public void setshow_condition(int show_condition) {
            this.show_condition = show_condition; }
        int show_condition;
        public String getcondition() {
            return this.condition; }
        public void setcondition(String condition) {
            this.condition = condition; }
        String condition;
        public int getshow_price() {
            return this.show_price; }
        public void setshow_price(int show_price) {
            this.show_price = show_price; }
        int show_price;
        public int getindexed() {
            return this.indexed; }
        public void setindexed(int indexed) {
            this.indexed = indexed; }
        int indexed;
        public String getvisibility() {
            return this.visibility; }
        public void setvisibility(String visibility) {
            this.visibility = visibility; }
        String visibility;
        public int getadvanced_stock_management() {
            return this.advanced_stock_management; }
        public void setadvanced_stock_management(int advanced_stock_management) {
            this.advanced_stock_management = advanced_stock_management; }
        int advanced_stock_management;
        public Date getdate_add() {
            return this.date_add; }
        public void setdate_add(Date date_add) {
            this.date_add = date_add; }
        Date date_add;
        public Date getdate_upd() {
            return this.date_upd; }
        public void setdate_upd(Date date_upd) {
            this.date_upd = date_upd; }
        Date date_upd;
        public int getpack_stock_type() {
            return this.pack_stock_type; }
        public void setpack_stock_type(int pack_stock_type) {
            this.pack_stock_type = pack_stock_type; }
        int pack_stock_type;
        public meta_description getmeta_description() {
            return this.meta_description; }
        public void setmeta_description(meta_description meta_description) {
            this.meta_description = meta_description; }
        meta_description meta_description;
        public meta_keywords getmeta_keywords() {
            return this.meta_keywords; }
        public void setmeta_keywords(meta_keywords meta_keywords) {
            this.meta_keywords = meta_keywords; }
        meta_keywords meta_keywords;
        public meta_title getmeta_title() {
            return this.meta_title; }
        public void setmeta_title(meta_title meta_title) {
            this.meta_title = meta_title; }
        meta_title meta_title;
        public link_rewrite getlink_rewrite() {
            return this.link_rewrite; }
        public void setlink_rewrite(link_rewrite link_rewrite) {
            this.link_rewrite = link_rewrite; }
        link_rewrite link_rewrite;
        public name getname() {
            return this.name; }
        public void setname(name name) {
            this.name = name; }
        name name;
        public description getdescription() {
            return this.description; }
        public void setdescription(description description) {
            this.description = description; }
        description description;
        public description_short getdescription_short() {
            return this.description_short; }
        public void setdescription_short(description_short description_short) {
            this.description_short = description_short; }
        description_short description_short;
        public available_now getavailable_now() {
            return this.available_now; }
        public void setavailable_now(available_now available_now) {
            this.available_now = available_now; }
        available_now available_now;
        public available_later getavailable_later() {
            return this.available_later; }
        public void setavailable_later(available_later available_later) {
            this.available_later = available_later; }
        available_later available_later;
        public associations getassociations() {
            return this.associations; }
        public void setassociations(associations associations) {
            this.associations = associations; }
        associations associations;
    }

    public class prestashop {
        public product getproduct() {
            return this.product; }
        public void setproduct(product product) {
            this.product = product; }
        product product;
        public String getxlink() {
            return this.xlink; }
        public void setxlink(String xlink) {
            this.xlink = xlink; }
        String xlink;
        public String gettext() {
            return this.text; }
        public void settext(String text) {
            this.text = text; }
        String text;
    }


}
