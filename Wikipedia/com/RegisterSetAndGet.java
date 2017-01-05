package com;

public class RegisterSetAndGet {
	private String name;
	private String surname;
	private String email;
	private String username;
	private String password;
	private String re_password;
	private int code;
	
	//sets
	public void setName(String name){ this.name = name;}
	public void setSurname(String surname){ this.surname = surname;}
	public void setEmail(String email){ this.email = email;}
	public void setUsername(String username){ this.username = username;}
	public void setPassword(String password){ this.password = password;}
	public void setRePassword(String re_password){ this.re_password = re_password;}
	public void setCode(int code){ this.code = code;}
	
	//gets
	public String getName(){ return name;}
	public String getSurname(){ return surname;}
	public String getEmail(){ return email;}
	public String getUsername(){ return username;}
	public String getPassword(){ return password;}
	public String getRePassword(){ return re_password;}
	public int getCode(){ return code;}
}
