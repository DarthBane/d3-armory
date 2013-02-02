package com.sdfteam.d3armory.domain.hero;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HeroSkillContainer {
    @SerializedName("active")
    private List<SkillElement> skillElement;
    private List<Skill> passive;

    public List<SkillElement> getSkillElement() {
        return skillElement;
    }

    public void setSkillElement(List<SkillElement> skillElement) {
        this.skillElement = skillElement;
    }

	public List<Skill> getPassive() {
		return passive;
	}

	public void setPassive(List<Skill> passive) {
		this.passive = passive;
	}

	@Override
	public String toString() {
		return "HeroSkillContainer [active=" + skillElement.toString() + ", passive=" + passive
				+ "]";
	}

}
