package jp.co.prodigy.test;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ContactForm implements Serializable {
	private static final long serialVersionUID = -157143280035400042L;
	
	@NotNull
	@Size(min = 1, max = 20)
	private String surname1;

	@NotNull
	@Size(min = 1, max = 20)
	private String name1;

	@NotNull
	@Size(min = 1, max = 20)
	private String surname2;

	@NotNull
	@Size(min = 1, max = 20)
	private String name2;
	
	@NotNull
	@Size(min = 1, max = 20)
	private String school_name;

	@NotNull
	@Size(min = 1, max = 20)
	private String school_name2;
	
	@NotNull
	private String prefecture;

	@NotNull
	@Size(min = 1, max = 500)
	private String example;
	
	public String getSurname1()
	{
		return surname1;
	}
	
	public void setSurname1(String surname1)
	{
		this.surname1 = surname1;
	}
	
	public String getName1()
	{
		return name1;
	}
	
	public void setName1(String name1)
	{
		this.name1 = name1;
	}

	public String getSurname2()
	{
		return surname2;
	}
	
	public void setSurname2(String surname2)
	{
		this.surname2 = surname2;
	}
	
	public String getName2()
	{
		return name2;
	}
	
	public void setName2(String name2)
	{
		this.name2 = name2;
	}
	public String getSchool_name()
	{
		return school_name;
	}
	
	public void setSchool_name(String school_name)
	{
		this.school_name = school_name;
	}
	public String getSchool_name2()
	{
		return school_name2;
	}
	
	public void setSchool_name2(String school_name2)
	{
		this.school_name2 = school_name2;
	}

	public String getPrefecture()
	{
		return prefecture;
	}

	public void setPrefecture(String prefecture)
	{
		this.prefecture = prefecture;
	}
	
	public String getExample()
	{
		return example;
	}

	public void setExample(String example)
	{
		this.example = example;
	}
}