package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Serialization {

	public static void main(String[] args) throws IOException {
		
		
		Employee obj = new Employee("Manish", 120, 28,"IT","Manish@gmail.com", "2348756349", "M");
		
	    
	    FileOutputStream fos= null;
	    ObjectOutputStream oos= null;
	    
	    try{ 
	      fos = new FileOutputStream("C:/Users/Shraddha/.eclipse/Employee.ser"); 
	      oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj);
	      System.out.println("Serialzation Done!!");
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
	    finally{
		      oos.close();
		      fos.close();
	    }
     
     //Deserialization
	    Employee o=null;
	    
     try{
       FileInputStream fis = new FileInputStream("C:/Users/Shraddha/.eclipse/Employee.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       o = (Employee)ois.readObject();
       ois.close();
       fis.close();
     }
     catch(IOException ioe)
     {
        ioe.printStackTrace();
        return;
     }catch(ClassNotFoundException cnfe)
      {
        System.out.println("Employee Class is not found.");
        cnfe.printStackTrace();
        return;
      }
     System.out.println("Employee Name:"+o.getEmpName());
     System.out.println("Employee Id:"+o.getEmpId());
     System.out.println("Employee Age:"+o.getEmpAge());
     System.out.println("Employee Deptname:"+o.getEmpDeptname());
     System.out.println("Employee Email:"+o.getEmpEmail());
     System.out.println("Employee Contact:"+o.getEmpContact());
     System.out.println("Employee Email:"+o.getEmpGender());

	}

}


class Employee implements java.io.Serializable{
	  
	  private String EmpName;
	  private int EmpId;
	  private int EmpAge;
	  private String EmpDeptname;
	  private String EmpEmail;  
	  private String EmpContact;
	  private String EmpGender;//
	  
	  public Employee(String name, int id,int age, String dname,String email, String cont, String gender) {
	    this.EmpName = name;
	    this.EmpId = id;
	    this.EmpAge = age;
	    this.EmpDeptname = dname;
	    this.EmpEmail = email;
	    this.EmpContact = cont;
	    this.EmpGender = gender;
	    
	  }
	  
	public String getEmpName() {
	    return EmpName;
	  }
	  public void setEmpName(String EmpName) {
	    this.EmpName = EmpName;
	  }
	  public int getEmpId() {
	    return EmpId;
	  }
	  public void setEmpId(int EmpId) {
	    this.EmpId = EmpId;
	  }
	  public int getEmpAge() {
	    return EmpAge;
	  }
	  public void setEmpAge(int EmpAge) {
	    this.EmpAge = EmpAge;
	  }
	  public String getEmpDeptname() {
	    return EmpDeptname;
	  }
	  public void setEmpDeptname(String EmpDeptname) {
	    this.EmpDeptname = EmpDeptname;
	  }
	  public String getEmpEmail() {
	    return EmpEmail;
	  }
	  public void setEmpEmail(String EmpEmail) {
	    this.EmpEmail = EmpEmail;
	  }
	  
	  public String getEmpContact() {
		    return EmpContact;
		  }
		  public void setEmpContact(String EmpContact) {
		    this.EmpContact = EmpContact;
		  }
		  
		  public String getEmpGender() {
			    return EmpGender;
			  }
			  public void setEmpGender(String EmpGender) {
			    this.EmpGender = EmpGender;
			  }
	}
