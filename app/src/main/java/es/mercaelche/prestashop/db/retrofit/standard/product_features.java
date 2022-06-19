package es.mercaelche.prestashop.db.retrofit.standard;

import java.util.Date;

public class product_features {
	public product_feature product_feature;
	public String nodeType;
	public String api;
	public Date text;

	public product_feature getProduct_feature() {
		return product_feature;
	}

	public void setProduct_feature(product_feature product_feature) {
		this.product_feature = product_feature;
	}

	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public Date getText() {
		return text;
	}

	public void setText(Date text) {
		this.text = text;
	}
}
