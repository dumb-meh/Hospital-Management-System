
package project;

/**
 *
 * @author Sifat
 */
public class Patients 

{
 
private int id;
private String Name;
private String Gender;
private int Age;



Patients (int id,String Name,String Gender,int Age)
{
this.id=id;
this.Name=Name;
this.Gender=Gender;
this.Age=Age;
}

public void setPatientID(int id)
{
this.id=id;
}
public void setPatientName(String Name)
{
this.Name=Name;
}
public void setPatientGender(String Gender)
{
this.Gender=Gender;
}
public void setPatientAge(int Age)
{
this.Age=Age;
}
public int getPatientID()
{
return this.id;
}
public String getPatientName()
{
return this.Name;
}
public String getPatientGender()
{
return this.Gender;
}
public int getPatientAge()
{
return this.Age;
}


@Override
public String toString ()
{
return id+Name+Gender+Age;
}

public void bill()
{}
}
class OutdoorPatient extends Patients
{
private final int visitingFee=500;

OutdoorPatient(int id,String Name,String Gender,int Age)
{
super(id,Name,Gender,Age);
}

    


public void Display ()
{
System.out.println ("Patirnt Name: "+this.getPatientName()+"\nPatient id: "+this.getPatientID()+"\nPatient Age: "+this.getPatientAge()+"\nPatient Gender"+this.getPatientGender()+"\nVisiting Fee: "+visitingFee);
}
@Override
public void bill ()

{
System.out.println("Bill: "+ visitingFee );
}
}
class IndoorPatient extends Patients

{
    private int bedFee,medicineFee,labTestFee,roomnumber;
    
    
    
    IndoorPatient (int id, String Name,String Gender,int Age, int bedFee,int medicineFee,int labTestFee,int roomnumber)
    {
    super(id,Name,Gender,Age);
    this.bedFee=bedFee;
    this.medicineFee=medicineFee;
    this.labTestFee=labTestFee;
    this.roomnumber=roomnumber;
    }
    
    public void setBedFee(int a)
    {
    this.bedFee=a;
    }
    public void setMedicineFee(int b)
    {
    this.medicineFee=b;
    }
    public void setLabTestFee(int c)
    {
    this.labTestFee=c;
    }
    public void setRoomnumber(int d)
    {
    this.roomnumber=d;
    }
    public int getBedFee()
    {
    return this.bedFee;
    }
    public int getMedicineFee()
    {
    return this.medicineFee;
    }
    public int getLabTestFee()
    {
    return this.labTestFee;
    }
    public int getRoomnumber()
    {
    return this.roomnumber;
    }
    
    
    public void Display  ()
    {
    System.out.println("Patirnt Name: "+this.getPatientName()+"\n Patient id: "+ this.getPatientID()+"\nPatient Age:"+this.getPatientAge()+"\nPatient Gender:"+this.getPatientGender()+"\nRoom Number"+roomnumber+"\nBed Fee: "+bedFee+"\nMedicine Fee: "+medicineFee+" Lab Test Fee: "+labTestFee);
    
    }
    
    @Override
    public void bill ()
    {
        System.out.println("Bill: "+ (bedFee+medicineFee+labTestFee));
    }

    
}
