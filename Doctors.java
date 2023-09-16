
package project;

/**
 *
 * @author Sifat
 * @param <T>
 */
public class Doctors <T>{
    
    


private String doctorName;
private T  doctorId;
private T  phoneNumber;
private String address ;
private String department;
private String  doctorSpecialization;
private T Salary;
Doctors(){}
   Doctors( T a, String b,T c,String d, String e,String f,T g)
   {
   this.doctorName=b;
   this.doctorId=a;
   this.phoneNumber=c;
   this.address=d;
   this.department=e;
   this.doctorSpecialization=f;
   this.Salary=g;
   }
    public T getdoctorId(){
        return doctorId;
    }
    public void setdoctorId(T doctorId){
        this.doctorId = doctorId;
    }
        
    public String getdoctorName(){
        return doctorName;
    }
    public void setdoctorName(String doctorName){
        this.doctorName = doctorName;
    }
    
    public T getphoneNumber(){
        return phoneNumber;
    }
    public void setphoneNumber(T phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address = address;
    }
    public String getdepartment (){
        return department;
    }
    public void setdepartment(String department){
        this.department = department;
    }
    public String getdoctorSpecialization (){
        return doctorSpecialization;
    }
    public void setdoctorSpecialization(String doctorSpecialization){
        this.doctorSpecialization = doctorSpecialization;
    }
    public void setDoctorSalary(T a)
    {
    this.Salary=a;
    }
    public T getDoctorSalary()
    {
    return this.Salary; 
    }
    
    public void display()
    {
    System.out.println("Doctor Name: "+doctorName+"\nDoctor ID: "+doctorId+"\nPhonenumber: "+phoneNumber+"\nAdress: "+address+"\nDepartment: "+department+"\nSpecialization"+doctorSpecialization+"\nSalary"+Salary);
    }  
}

