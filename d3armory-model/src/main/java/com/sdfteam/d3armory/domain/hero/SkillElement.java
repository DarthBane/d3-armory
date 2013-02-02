package com.sdfteam.d3armory.domain.hero;

public class SkillElement {
    Skill skill;
    Rune rune;

    public Rune getRune() {
        return rune;
    }

    public void setRune(Rune rune) {
        this.rune = rune;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Skill [active=" + skill.toString() + ", rune=" + rune.toString() + "]";
    }
}