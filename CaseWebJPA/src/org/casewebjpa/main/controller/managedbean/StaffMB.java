package org.casewebjpa.main.controller.managedbean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.faces.model.SelectItem;

import org.casewebjpa.main.bean.CompanyStaff;
import org.casewebjpa.main.bean.Gender;

public class StaffMB {

	private Gender gender;

	private String genderString[] = { "male", "female" };

	private String genderValue;

	private CompanyStaff companyStaff;

	List<SelectItem> selectItems;

	{
		fillSelectItems();
	}

	public String getGenderValue() {
		return genderValue;
	}

	public void setGenderValue(String genderValue) {
		this.genderValue = genderValue;
	}

	public String[] getGenderString() {
		return genderString;
	}

	public void setGenderString(String[] genderString) {
		this.genderString = genderString;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Collection<SelectItem> getGenderItem() {
		return null;
	}

	public CompanyStaff getCompanyStaff() {
		return companyStaff;
	}

	public void setCompanyStaff(CompanyStaff companyStaff) {
		this.companyStaff = companyStaff;
	}

	public List<SelectItem> getSelectItems() {
		return selectItems;
	}

	public void setSelectItems(List<SelectItem> selectItems) {
		this.selectItems = selectItems;
	}

	private void fillSelectItems() {

		List<CompanyStaff> companyStaffs = new ArrayList<CompanyStaff>();
		
		companyStaffs.add(new CompanyStaff("key1","id1"));
		companyStaffs.add(new CompanyStaff("key2","id2"));
		companyStaffs.add(new CompanyStaff("key3","id3"));
		
		selectItems = new ArrayList<SelectItem>();
		
		for (CompanyStaff companyStaff : companyStaffs) {
			selectItems.add(new SelectItem(companyStaff,companyStaff.getValue()));
		}	

	}
	
	public void saveBean(){
		
	}
	
	

}
