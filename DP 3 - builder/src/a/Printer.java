package a;

public class Printer {

	// required
	private String type;
	private String ink;
	private String series;
	// optional
	private boolean isScannerEnabled;
	private boolean isFaxEnabled;

	private Printer(Builder builder) {
		this.type = builder.type;
		this.ink = builder.ink;
		this.series = builder.series;
		this.isScannerEnabled = builder.isScannerEnabled;
		this.isFaxEnabled = builder.isFaxEnabled;
	}

	public String getType() {
		return type;
	}

	public String getInk() {
		return ink;
	}

	public String getSeries() {
		return series;
	}

	public boolean isScannerEnabled() {
		return isScannerEnabled;
	}

	public boolean isFaxEnabled() {
		return isFaxEnabled;
	}

	@Override
	public String toString() {
		return "Printer [type=" + type + ", ink=" + ink + ", series=" + series + ", isScannerEnabled="
				+ isScannerEnabled + ", isFaxEnabled=" + isFaxEnabled + "]";
	}

	public static class Builder {
		// required
		private String type;
		private String ink;
		private String series;
		// optional
		private boolean isScannerEnabled;
		private boolean isFaxEnabled;

		public Builder(String type, String ink, String series) {
			super();
			this.type = type;
			this.ink = ink;
			this.series = series;
		}

		public Builder setScannerEnabled(boolean isScannerEnabled) {
			this.isScannerEnabled = isScannerEnabled;
			return this;
		}

		public Builder setFaxEnabled(boolean isFaxEnabled) {
			this.isFaxEnabled = isFaxEnabled;
			return this;
		}

		public Printer build() {
			return new Printer(this);
		}

	}

}
