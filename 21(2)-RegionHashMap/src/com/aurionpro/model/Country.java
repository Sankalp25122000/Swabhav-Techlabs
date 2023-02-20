package com.aurionpro.model;

public class Country {
	private String region;
	private String name;
	private int regionCode;

	public Country(String region, String name, int code) {
		super();
		this.region = region;
		this.name = name;
		this.regionCode = code;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(int code) {
		this.regionCode = code;
	}

	@Override
	public String toString() {
		return "\nCountry [region=" + region + ", name=" + name + ", code=" + regionCode + "]";
	}

}
