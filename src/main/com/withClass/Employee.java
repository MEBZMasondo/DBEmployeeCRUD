package main.com.withClass;

public class Employee {
	
	String id, fname, lname, job;
	 
	public Employee() {}
		
    public Employee(String id, String fname,String lname, String job){
    	this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.job = job;
    }
    
    public String getId(){
        return this.id;
    }
    public String getLname(){
        return this.lname;
    }
    public String getFname(){
        return this.fname;
    }
    public String getJob(){
        return this.job;
    }
}
