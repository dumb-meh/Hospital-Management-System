
package project;

import java.util.ArrayList;

/**
 *
 * @author Sifat
 */
abstract class Information 
{
abstract void hospitalInformation();
abstract void hospitalDoctors();
abstract void hospitalPatients();
abstract void hospitalEmployees();
}

public class HospitalInformation extends Information {

    private final int NumberOfBeds=500;
    private int NumberOfIndoorPatients;
    private final int AvailableBeds=NumberOfBeds-NumberOfIndoorPatients;
    private final String Adress="91/5....";
    private final int NumberOfAmbulance=5;
    private final String ImergencyNumber="01......";
    private final ArrayList<Patients> PatientsList=new ArrayList<>();
    private final ArrayList<Doctors> DoctorsList=new ArrayList<>();
    private final ArrayList<Employees> EmployeesList=new ArrayList<>();
    
    
    public int getNumberofBeds()
    {
    return this.NumberOfBeds;
    }
    public void setNumberOfIndoorPatients(int a)
    {
     this.NumberOfIndoorPatients=a;
    }
    public int getNumberOfIndoorPatients()
    {
    return this.NumberOfIndoorPatients;
    }
    public int getAvailableBeds()
    {
    return this.AvailableBeds;
    }
    
    public String getAdress()
    {
    return this.Adress;
    }
    public int getNumberOfAmbulance()
    {
    return this.NumberOfAmbulance;
    }
    public String getImergencyNumber()
    {
    return this.ImergencyNumber;
    }
    
    
    
    @Override
   public void hospitalInformation() 
    {
        System.out.println ("Adress: "+this.getAdress()+"Imergency Number: "+this.ImergencyNumber+" Number of Ambulance: "+this.NumberOfAmbulance+"Number of Beds: "+this.NumberOfBeds);
    }

    @Override
    public void hospitalDoctors() 
    {
        System.out.println("Doctors: "+this.DoctorsList);
    }
    @Override
    public void hospitalPatients()
    {
    System.out.println("Patients: "+this.PatientsList);
    }
    @Override
    public void hospitalEmployees()
    {
    System.out.println("Employees: "+this.EmployeesList);
    }
    
}
