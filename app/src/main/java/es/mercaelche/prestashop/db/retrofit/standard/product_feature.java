package es.mercaelche.prestashop.db.retrofit.standard;

import java.util.Date;

public class product_feature {
	public int id;
	public id_feature_value id_feature_value;
	public String href;
	public Date text;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public id_feature_value getId_feature_value() {
		return id_feature_value;
	}

	public void setId_feature_value(id_feature_value id_feature_value) {
		this.id_feature_value = id_feature_value;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Date getText() {
		return text;
	}

	public void setText(Date text) {
		this.text = text;
	}
}
