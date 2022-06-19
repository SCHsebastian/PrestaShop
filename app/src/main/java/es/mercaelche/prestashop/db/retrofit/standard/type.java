package es.mercaelche.prestashop.db.retrofit.standard;

public class type {
	public boolean notFilterable;
	public String text;

	public boolean isNotFilterable() {
		return notFilterable;
	}

	public void setNotFilterable(boolean notFilterable) {
		this.notFilterable = notFilterable;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
