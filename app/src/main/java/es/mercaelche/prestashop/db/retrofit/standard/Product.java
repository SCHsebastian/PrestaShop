package es.mercaelche.prestashop.db.retrofit.standard;

import java.util.Date;

public class product {
	public int id;
	public id_manufacturer id_manufacturer;
	public int id_supplier;
	public id_category_default id_category_default;
	public String _new;
	public int cache_default_attribute;
	public id_default_image id_default_image;
	public id_default_combination id_default_combination;
	public id_tax_rules_group id_tax_rules_group;
	public position_in_category position_in_category;
	public manufacturer_name manufacturer_name;
	public quantity quantity;
	public type type;
	public int id_shop_default;
	public String reference;
	public String supplier_reference;
	public String location;
	public double width;
	public double height;
	public double depth;
	public double weight;
	public int quantity_discount;
	public String ean13;
	public String isbn;
	public String upc;
	public String mpn;
	public int cache_is_pack;
	public int cache_has_attachments;
	public int is_virtual;
	public int state;
	public int additional_delivery_times;
	public delivery_in_stock delivery_in_stock;
	public delivery_out_stock delivery_out_stock;
	public String product_type;
	public int on_sale;
	public int online_only;
	public double ecotax;
	public int minimal_quantity;
	public String low_stock_threshold;
	public int low_stock_alert;
	public double price;
	public double wholesale_price;
	public String unity;
	public double unit_price_ratio;
	public double additional_shipping_cost;
	public int customizable;
	public int text_fields;
	public int uploadable_files;
	public int active;
	public String redirect_type;
	public int id_type_redirected;
	public int available_for_order;
	public String available_date;
	public int show_condition;
	public String condition;
	public int show_price;
	public int indexed;
	public String visibility;
	public int advanced_stock_management;
	public Date date_add;
	public Date date_upd;
	public int pack_stock_type;
	public meta_description meta_description;
	public meta_keywords meta_keywords;
	public meta_title meta_title;
	public link_rewrite link_rewrite;
	public name name;
	public description description;
	public description_short description_short;
	public available_now available_now;
	public available_later available_later;
	public associations associations;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public id_manufacturer getId_manufacturer() {
		return id_manufacturer;
	}

	public void setId_manufacturer(id_manufacturer id_manufacturer) {
		this.id_manufacturer = id_manufacturer;
	}

	public int getId_supplier() {
		return id_supplier;
	}

	public void setId_supplier(int id_supplier) {
		this.id_supplier = id_supplier;
	}

	public id_category_default getId_category_default() {
		return id_category_default;
	}

	public void setId_category_default(id_category_default id_category_default) {
		this.id_category_default = id_category_default;
	}

	public String get_new() {
		return _new;
	}

	public void set_new(String _new) {
		this._new = _new;
	}

	public int getCache_default_attribute() {
		return cache_default_attribute;
	}

	public void setCache_default_attribute(int cache_default_attribute) {
		this.cache_default_attribute = cache_default_attribute;
	}

	public id_default_image getId_default_image() {
		return id_default_image;
	}

	public void setId_default_image(id_default_image id_default_image) {
		this.id_default_image = id_default_image;
	}

	public id_default_combination getId_default_combination() {
		return id_default_combination;
	}

	public void setId_default_combination(id_default_combination id_default_combination) {
		this.id_default_combination = id_default_combination;
	}

	public id_tax_rules_group getId_tax_rules_group() {
		return id_tax_rules_group;
	}

	public void setId_tax_rules_group(id_tax_rules_group id_tax_rules_group) {
		this.id_tax_rules_group = id_tax_rules_group;
	}

	public position_in_category getPosition_in_category() {
		return position_in_category;
	}

	public void setPosition_in_category(position_in_category position_in_category) {
		this.position_in_category = position_in_category;
	}

	public manufacturer_name getManufacturer_name() {
		return manufacturer_name;
	}

	public void setManufacturer_name(manufacturer_name manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}

	public quantity getQuantity() {
		return quantity;
	}

	public void setQuantity(quantity quantity) {
		this.quantity = quantity;
	}

	public type getType() {
		return type;
	}

	public void setType(type type) {
		this.type = type;
	}

	public int getId_shop_default() {
		return id_shop_default;
	}

	public void setId_shop_default(int id_shop_default) {
		this.id_shop_default = id_shop_default;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getSupplier_reference() {
		return supplier_reference;
	}

	public void setSupplier_reference(String supplier_reference) {
		this.supplier_reference = supplier_reference;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getQuantity_discount() {
		return quantity_discount;
	}

	public void setQuantity_discount(int quantity_discount) {
		this.quantity_discount = quantity_discount;
	}

	public String getEan13() {
		return ean13;
	}

	public void setEan13(String ean13) {
		this.ean13 = ean13;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public int getCache_is_pack() {
		return cache_is_pack;
	}

	public void setCache_is_pack(int cache_is_pack) {
		this.cache_is_pack = cache_is_pack;
	}

	public int getCache_has_attachments() {
		return cache_has_attachments;
	}

	public void setCache_has_attachments(int cache_has_attachments) {
		this.cache_has_attachments = cache_has_attachments;
	}

	public int getIs_virtual() {
		return is_virtual;
	}

	public void setIs_virtual(int is_virtual) {
		this.is_virtual = is_virtual;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getAdditional_delivery_times() {
		return additional_delivery_times;
	}

	public void setAdditional_delivery_times(int additional_delivery_times) {
		this.additional_delivery_times = additional_delivery_times;
	}

	public delivery_in_stock getDelivery_in_stock() {
		return delivery_in_stock;
	}

	public void setDelivery_in_stock(delivery_in_stock delivery_in_stock) {
		this.delivery_in_stock = delivery_in_stock;
	}

	public delivery_out_stock getDelivery_out_stock() {
		return delivery_out_stock;
	}

	public void setDelivery_out_stock(delivery_out_stock delivery_out_stock) {
		this.delivery_out_stock = delivery_out_stock;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public int getOn_sale() {
		return on_sale;
	}

	public void setOn_sale(int on_sale) {
		this.on_sale = on_sale;
	}

	public int getOnline_only() {
		return online_only;
	}

	public void setOnline_only(int online_only) {
		this.online_only = online_only;
	}

	public double getEcotax() {
		return ecotax;
	}

	public void setEcotax(double ecotax) {
		this.ecotax = ecotax;
	}

	public int getMinimal_quantity() {
		return minimal_quantity;
	}

	public void setMinimal_quantity(int minimal_quantity) {
		this.minimal_quantity = minimal_quantity;
	}

	public String getLow_stock_threshold() {
		return low_stock_threshold;
	}

	public void setLow_stock_threshold(String low_stock_threshold) {
		this.low_stock_threshold = low_stock_threshold;
	}

	public int getLow_stock_alert() {
		return low_stock_alert;
	}

	public void setLow_stock_alert(int low_stock_alert) {
		this.low_stock_alert = low_stock_alert;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWholesale_price() {
		return wholesale_price;
	}

	public void setWholesale_price(double wholesale_price) {
		this.wholesale_price = wholesale_price;
	}

	public String getUnity() {
		return unity;
	}

	public void setUnity(String unity) {
		this.unity = unity;
	}

	public double getUnit_price_ratio() {
		return unit_price_ratio;
	}

	public void setUnit_price_ratio(double unit_price_ratio) {
		this.unit_price_ratio = unit_price_ratio;
	}

	public double getAdditional_shipping_cost() {
		return additional_shipping_cost;
	}

	public void setAdditional_shipping_cost(double additional_shipping_cost) {
		this.additional_shipping_cost = additional_shipping_cost;
	}

	public int getCustomizable() {
		return customizable;
	}

	public void setCustomizable(int customizable) {
		this.customizable = customizable;
	}

	public int getText_fields() {
		return text_fields;
	}

	public void setText_fields(int text_fields) {
		this.text_fields = text_fields;
	}

	public int getUploadable_files() {
		return uploadable_files;
	}

	public void setUploadable_files(int uploadable_files) {
		this.uploadable_files = uploadable_files;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getRedirect_type() {
		return redirect_type;
	}

	public void setRedirect_type(String redirect_type) {
		this.redirect_type = redirect_type;
	}

	public int getId_type_redirected() {
		return id_type_redirected;
	}

	public void setId_type_redirected(int id_type_redirected) {
		this.id_type_redirected = id_type_redirected;
	}

	public int getAvailable_for_order() {
		return available_for_order;
	}

	public void setAvailable_for_order(int available_for_order) {
		this.available_for_order = available_for_order;
	}

	public String getAvailable_date() {
		return available_date;
	}

	public void setAvailable_date(String available_date) {
		this.available_date = available_date;
	}

	public int getShow_condition() {
		return show_condition;
	}

	public void setShow_condition(int show_condition) {
		this.show_condition = show_condition;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getShow_price() {
		return show_price;
	}

	public void setShow_price(int show_price) {
		this.show_price = show_price;
	}

	public int getIndexed() {
		return indexed;
	}

	public void setIndexed(int indexed) {
		this.indexed = indexed;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public int getAdvanced_stock_management() {
		return advanced_stock_management;
	}

	public void setAdvanced_stock_management(int advanced_stock_management) {
		this.advanced_stock_management = advanced_stock_management;
	}

	public Date getDate_add() {
		return date_add;
	}

	public void setDate_add(Date date_add) {
		this.date_add = date_add;
	}

	public Date getDate_upd() {
		return date_upd;
	}

	public void setDate_upd(Date date_upd) {
		this.date_upd = date_upd;
	}

	public int getPack_stock_type() {
		return pack_stock_type;
	}

	public void setPack_stock_type(int pack_stock_type) {
		this.pack_stock_type = pack_stock_type;
	}

	public meta_description getMeta_description() {
		return meta_description;
	}

	public void setMeta_description(meta_description meta_description) {
		this.meta_description = meta_description;
	}

	public meta_keywords getMeta_keywords() {
		return meta_keywords;
	}

	public void setMeta_keywords(meta_keywords meta_keywords) {
		this.meta_keywords = meta_keywords;
	}

	public meta_title getMeta_title() {
		return meta_title;
	}

	public void setMeta_title(meta_title meta_title) {
		this.meta_title = meta_title;
	}

	public link_rewrite getLink_rewrite() {
		return link_rewrite;
	}

	public void setLink_rewrite(link_rewrite link_rewrite) {
		this.link_rewrite = link_rewrite;
	}

	public name getName() {
		return name;
	}

	public void setName(name name) {
		this.name = name;
	}

	public description getDescription() {
		return description;
	}

	public void setDescription(description description) {
		this.description = description;
	}

	public description_short getDescription_short() {
		return description_short;
	}

	public void setDescription_short(description_short description_short) {
		this.description_short = description_short;
	}

	public available_now getAvailable_now() {
		return available_now;
	}

	public void setAvailable_now(available_now available_now) {
		this.available_now = available_now;
	}

	public available_later getAvailable_later() {
		return available_later;
	}

	public void setAvailable_later(available_later available_later) {
		this.available_later = available_later;
	}

	public associations getAssociations() {
		return associations;
	}

	public void setAssociations(associations associations) {
		this.associations = associations;
	}
}
