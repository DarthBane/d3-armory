
package com.sdfteam.d3armory.domain.career;

import java.util.List;

import com.sdfteam.d3armory.domain.artisanblacksmith.Item;
import com.sdfteam.d3armory.domain.hero.Skill;

public class Scoundrel{
   	private Item items;
   	private Number level;
   	private List<Skill> skills;
   	private String slug;

 	public Item getItems(){
		return this.items;
	}
	public void setItems(Item items){
		this.items = items;
	}
 	public Number getLevel(){
		return this.level;
	}
	public void setLevel(Number level){
		this.level = level;
	}
 	public List<Skill> getSkills(){
		return this.skills;
	}
	public void setSkills(List<Skill> skills){
		this.skills = skills;
	}
 	public String getSlug(){
		return this.slug;
	}
	public void setSlug(String slug){
		this.slug = slug;
	}
}
