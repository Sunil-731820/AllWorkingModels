package com.java.jsp;

public class Questions {
	private int id ;
	private String nickName;
	private String schoolName;
	private String petName;
	private String favSports;
	private String favIdeal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getFavSports() {
		return favSports;
	}
	public void setFavSports(String favSports) {
		this.favSports = favSports;
	}
	public String getFavIdeal() {
		return favIdeal;
	}
	public void setFavIdeal(String favIdeal) {
		this.favIdeal = favIdeal;
	}
	@Override
	public String toString() {
		return "Questions [id=" + id + ", nickName=" + nickName + ", schoolName=" + schoolName + ", petName=" + petName
				+ ", favSports=" + favSports + ", favIdeal=" + favIdeal + "]";
	}
	
	
	

}
