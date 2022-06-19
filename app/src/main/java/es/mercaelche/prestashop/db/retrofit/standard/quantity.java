package es.mercaelche.prestashop.db.retrofit.standard;

public class quantity {
	public boolean notFilterable;
	public int text;

	public boolean isNotFilterable() {
		return notFilterable;
	}

	public void setNotFilterable(boolean notFilterable) {
		this.notFilterable = notFilterable;
	}

	public int getText() {
		return text;
	}

	public void setText(int text) {
		this.text = text;
	}
}
