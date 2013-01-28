package com.sdfteam.d3armory.domain.career;

public class Quest {
	private String slug;
	private String name;

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Quest [slug=" + slug + ", name=" + name + "]";
	}

}
