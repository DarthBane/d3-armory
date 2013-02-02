package com.sdfteam.d3armory.domain.hero;

public class Skill {
	private String description;
	private String icon;
	private String name;
	private String simpleDescription;
	private String slug;
	private String tooltipParams;
    private int level;
    private String categorySlug;
    private String skillCalcId;

    public String getSkillCalcId() {
        return skillCalcId;
    }

    public void setSkillCalcId(String skillCalcId) {
        this.skillCalcId = skillCalcId;
    }

    public String getCategorySlug() {
        return categorySlug;
    }

    public void setCategorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSimpleDescription() {
		return this.simpleDescription;
	}

	public void setSimpleDescription(String simpleDescription) {
		this.simpleDescription = simpleDescription;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTooltipParams() {
		return this.tooltipParams;
	}

	public void setTooltipParams(String tooltipParams) {
		this.tooltipParams = tooltipParams;
	}

	@Override
	public String toString() {
		return "Skill [description=" + description + ", icon=" + icon
				+ ", name=" + name + ", simpleDescription=" + simpleDescription
				+ ", slug=" + slug + ", tooltipParams=" + tooltipParams + "]";
	}

}
