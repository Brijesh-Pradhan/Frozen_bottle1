package poojo;
public class ProjectLibrary {	
	String email;
	int id;
	String name;
	String password;
	int phone;	
	public ProjectLibrary()
	{	
	}

	public ProjectLibrary(String email, int id, String name, String password, int phone) {
		super();
		this.email = email;
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}
	public String getEmail()
	{
		return email;		
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public int getId()
	{
		return id;		
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;	
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getPassword()
	{
		return password;		
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public int getPhone()
	{
		return phone;		
	}
	public void setPhone(int phone)
	{
		this.phone=phone;
	}
}
