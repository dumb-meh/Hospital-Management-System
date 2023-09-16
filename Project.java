
package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sifat
 */
public class Project {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner i = new Scanner(System.in);
         File file=new File("Hospital Management.txt");
         PrintWriter write = new PrintWriter(file);
         ArrayList<Patients> PatientsList=new ArrayList<>();
         ArrayList<Doctors> DoctorsList=new ArrayList<>();
         ArrayList<Employees> EmployeesList=new ArrayList<>();
         
         x:
while (true) {
System.out.println("1.Add \n 2.Delete \n 3.Print \n 4.Search \n 5.Exit");
String select1 = i.next();
switch (select1.charAt(0)) {
case '1': {
while (true){
System.out.println("a. Add a Patient");
System.out.println("b. Add a Doctor");
System.out.println("c. Add an Emplyoee");
System.out.println("d. Go To Main Menu");

String select2 = i.next();
switch (select2.charAt(0)) {
case 'a': {
    System.out.println("1.Outdoor Patient\n 2.Indoor Patient");
    int select3=i.nextInt();
    
    switch (select3) {
        case 1:
            int a,d;
            String b;
            String c;
            System.out.println("Patient ID :");
            a=i.nextInt();
            System.out.println("Patient Name:");
            b=i.next();
            System.out.println("Patient Age:");
            d=i.nextInt();
            System.out.println("Patient Gender:");
            c=i.next();
            Patients p1 = new OutdoorPatient(a,b,c,d);
            PatientsList.add(p1);
            write.print(p1);
            System.out.println("Patient added \n");
            break;
        case 2:
            int e,h,j,k,l,m;
            String f;
            String g;
            System.out.println("Patient ID :");
            e=i.nextInt();
            System.out.println("Patient Name:");
            f=i.next();
            System.out.println("Patient Age:");
            h=i.nextInt();
            System.out.println("Patient Gender:");
            g=i.next();
            System.out.println("Bed Fee:");
            j=i.nextInt();
            System.out.println("Medicine Fee: ");
            k=i.nextInt();
            System.out.println("Labtest Fee: ");
            l=i.nextInt();
            System.out.println("Room number: ");
            m=i.nextInt();
            Patients p2 = new IndoorPatient(e,f,g,h,j,k,l,m);
            PatientsList.add(p2);
            write.print(p2);
            System.out.println("Patient added \n");
            
            break;
        default:
            System.out.println("Invalid choice");
            
    }}
    
    break;
    case 'b':
    { Doctors doc=new Doctors();
    System.out.println("Enter Doctor Name: ");
    doc.setdoctorId(i.next());
    
    System.out.println("Enter Doctor Id: ");
    doc.setdoctorId(i.nextInt());
    
    System.out.println("Enter Department: ");
    doc.setdepartment(i.next());
    
    System.out.println("Enter Doctor Specialization: ");
    doc.setdoctorSpecialization(i.next());
    
    System.out.println("Enter Salary: ");
    doc.setDoctorSalary(i.nextInt());
    
    System.out.println("Enter Phonenumber");
       doc.setphoneNumber(i.next());
    
   System.out.println("Enter Adress: ");
   doc.setaddress(i.next());
   DoctorsList.add(doc);
   write.print(doc);
   System.out.println("Doctor added \n");
}
    break;
    case 'c':
    {
        Employees emp=new Employees();
        System.out.println("Enter Employee Name: ");
    emp.setemployeeName(i.next());
    
    System.out.println("Enter Employee Id: ");
    emp.setemployeeId(i.nextInt());
    
    System.out.println("Enter Working Shift: ");
    emp.setshift(i.next());
    
    System.out.println("Enter Designation: ");
    emp.setdesignation(i.next());
    
    System.out.println("Enter Salary: ");
    emp.setSalary(i.nextInt());
    
    System.out.println("Enter Phonenumber");
       emp.setphoneNumber(i.next());
    
   System.out.println("Enter Adress: ");
   emp.setaddress(i.next());
   EmployeesList.add(emp);
   write.print(emp);
   System.out.println("Doctor added \n");
    }
    break;
    case 'd': continue x;
    default: {
System.out.println("Not a valid choice " +select2.charAt(0));}

}}}
case'2':{
    while (true){
System.out.println("a. Delete a Patient");
System.out.println("b. Deelete a Doctor");
System.out.println("c. Delete an Emplyoee");
System.out.println("d. Go To Main Menu");

String select4= i.next();
switch (select4.charAt(0)) {
case 'a': {
System.out.println("Patient Id:");
int pID =i.nextInt();
i.nextLine();
for (int x = 0; x < PatientsList.size(); x++) {
if (pID == PatientsList.get(x).getPatientID()) {
PatientsList.remove(x);
System.out.println("Patient removed \n");
}
else{
if( x == PatientsList.size()-1 )
System.out.println("No Patient data found for " + pID);
}
}
}
break;
case 'b': {
System.out.println("Doctor Id:");
String dID = i.next();
for (int y = 0; y < DoctorsList.size(); y++) {
if (dID ==DoctorsList.get(y).getdoctorId()) {
DoctorsList.remove(y);
System.out.println("Doctor removed \n");
}
else{
if( y == DoctorsList.size() -1)
System.out.println("No Doctor data found for " + dID);
}
}
}
break;
case 'c': {
System.out.println ("Employee Id:");
int eID = i.nextInt();
i.nextLine();
for (int z = 0; z < EmployeesList.size(); z++) {
if ( eID == EmployeesList.get(z).getemployeeId() ) {
EmployeesList.remove(z);
System.out.println("Employee removed \n");
}
else{
if( z == EmployeesList.size()-1)
System.out.println("No Employee data found for " + eID);
}
}
}
break;
case 'd': {
continue x;
}
default: {
System.out.println("Not a valid choice " +select4.charAt(0));
}
    
    }
}
}
case '3':{
  
while (true){
System.out.println("a. Print Hospital Information");
System.out.println("b. Print Patients List");
System.out.println("c. Print Doctors List");
System.out.println("d. Print Employees List");
System.out.println("e. Go To Main Menu");    
  String select5 = i.next();
switch (select5.charAt(0)) {

case 'a':{  HospitalInformation hos=new HospitalInformation();

hos.hospitalInformation();
}
break;
case 'b': {
System.out.println(PatientsList);
}

break;
case 'c': {
System.out.println(DoctorsList);
}

break;
case 'd': {
System.out.println(EmployeesList);
}

break;
case 'e': {
continue x;
}

default: {
System.out.println("No option in character " +select5.charAt(0));
}  
}}}
case '4':{
    while (true) {
System.out.println("a. Search a Patient");
System.out.println("b. Search a Doctor");
System.out.println("c. Search a Employee");
System.out.println("d. Go To Main Menu");    
String select6 = i.next();
switch (select6.charAt(0)) {
case 'a': {
System.out.println("Enter Patient ID:");
int pID = i.nextInt();

for (int x = 0; x < PatientsList.size(); x++) {
if (pID == PatientsList.get(x).getPatientID()) {
System.out.println(PatientsList.get(x).toString());
}
else{
if( x == PatientsList.size() - 1)
System.out.println("No Patient data found for " + pID);
}
}
}
break;
case 'b': {
System.out.println("Enter Doctor ID:");
String dID = i.next();
for (int y = 0; y< DoctorsList.size(); y++) {
if (dID == DoctorsList.get(y).getdoctorId()) {
System.out.println(DoctorsList.get(y).toString());
}
else{
if( y == DoctorsList.size() - 1)
System.out.println("No Doctor data found for " + dID);
}
}
}
break;
case 'c': {
System.out.println("Entter Employee ID:");
int eID = i.nextInt();
i.nextLine();
for (int z = 0; z < EmployeesList.size(); z++) {
if (eID == EmployeesList.get(z).getemployeeId()) {
System.out.println(EmployeesList.get(z).toString());
}
else{
if( z == EmployeesList.size() - 1)
System.out.println("No Employee data found for " + eID);
}
}}
break;
case'd': continue x;

default: {
System.out.println("No option in character " +select6.charAt(0));
}}}}


case '5': {break x;}
default: {
System.out.println("No option in character " +select1.charAt(0));
  
}
}}}}

