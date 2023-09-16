
package project;

/**
 *
 * @author Sifat
 */
public class Employees implements Comparable

{
 private String  employeeName;
private int  employeeId,Salary;
private String  phoneNumber;
private String address ;
private String shift;
private String  designation;

   
    Employees(){}
    Employees( int employeeId , String employeeName ,String phoneNumber,String address, String shift, String designation,int Salary )
    {   
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.shift=shift;
        this.designation=designation;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.Salary=Salary;
        
    
    }
    
   
    public int getemployeeId(){
        return employeeId;
    }
    public void setemployeeId(int employeeId){
        this.employeeId = employeeId;
    }
        
    public String getemployeeName(){
        return employeeName;
    }
    public void setemployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    
    public String getphoneNumber(){
        return phoneNumber;
    }
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address = address;
    }
    public String getshift (){
        return shift;
    }
    public void setshift(String shift){
        this.shift = shift;
    }
    public String getdesignation (){
        return designation;
    }
    public void setdesignation(String designation){
        this.designation = designation;
    }
    
    public int getSalary(){
        return Salary;
    }
    public void setSalary(int Salary){
        this.Salary= Salary;
    }
    
    public void Display(){
        System.out.println( "Employee ID: "+employeeId+"\nEmployee Name: "+employeeName+"\nWorking Shift: "+shift+"\nDesignation: "+designation+"\nPhone Number: "+phoneNumber+"\nAdress:  "+address+"\nSalary"+Salary);
    
 }  

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    

