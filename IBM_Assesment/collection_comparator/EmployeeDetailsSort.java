import java.util.ArrayList;
import java.util.*;
class EmployeeDetailsSort{

   static java.util.List list = new java.util.ArrayList();
    public static void main(String[] args) {

   list.add(new EmployeeDetail(1, "Ats", 22, "Lucknow"));
        list.add(new EmployeeDetail(2, "Rahul", 13, "Delhi"));
        list.add(new EmployeeDetail(3, "shivam", 24, "White"));
        
 
        System.out.println("Contents of list : " + list);

      EmployeeDetailsSort ref = new EmployeeDetailsSort();
       System.out.println("Enter how many details you want to insert in employee details:");
         Scanner sc1 = new Scanner(System.in);
        int ch=sc1.nextInt();

        for(int i=0;i<ch;i++){

        System.out.println("Enter details of "+(i+1)+" employee:");
         ref.addDetails();

        }

        ref.showDetails();

    System.out.println("Enter detail through which you want to sort: ");
    Scanner sc2 = new Scanner(System.in);
    String value = sc2.next();
    //sc2.nextLine();
    value=value.toLowerCase();

    switch(value){

        case "id":{
        java.util.Collections.sort(list, new SortByID());
       
    } break;

    case "name":{
        java.util.Collections.sort(list, new SortByName());
       
    } break;

   case "age":{
      java.util.Collections.sort(list, new SortByAge());
      
  } break;

case "address":{
       java.util.Collections.sort(list, new SortByAddress());
       
} break;

}

 
        System.out.println("Contents of list after sorting : " + list);
        ref.showDetails();

    }


    void addDetails()
    {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter EMPLOYEE_ID:" ); 
        Integer id=sc.nextInt();
        System.out.print("Enter EMPLOYEE_NAME:"); 
        String en=sc.nextLine();
        System.out.print("Enter EMPLOYEE_AGE:"); 
        Integer ea=sc.nextInt();
        System.out.print("Enter EMPLOYEE_ADDRESS:"); 
        String eaa=sc.next();
         list.add(new EmployeeDetail(id,en,ea,eaa)); 

    }

    void showDetails()
{
    for(Object obj: list)   //created one object and obj is the link for list 
       {
        System.out.println(obj.toString());  // to avoid hexa value output we used string tostring.
       }
}
}



class EmployeeDetail{
    private Integer employeeID, employeeAge ;
    private String employeeName, employeeAddress;
 
    EmployeeDetail(Integer employeeID, String employeeName, Integer employeeAge, String employeeAddress){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeAge = employeeAge;
    }
 
    @Override
    public String toString(){
        return "EmployeeDetail with ID: " + this.getEmployeeId() + ", Name : " + this.getEmployeeName() +  ", Age : " + this.getEmployeeAge() +  /*",  LName : " + this.getEmployeeLName() +*/ ", Address : " + this.getEmployeeAddress();
    }

    public Integer getEmployeeId(){
        return this.employeeID;
    }
 
    public String getEmployeeName(){
        return this.employeeName;
    }


      public String getEmployeeFName(){
         return this.employeeName.split(" ")[0];
    }


  public String getEmployeeLName(){
   String[] tokens = this.employeeName.split(" ");
       return tokens[tokens.length -1]; 
    }
 
    public Integer getEmployeeAge(){
        return this.employeeAge;
    }

        public String getEmployeeAddress(){
        return this.employeeAddress;
    }

}

class SortByID implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
return ((EmployeeDetail)firstObject).getEmployeeId().compareTo(((EmployeeDetail)secondObject).getEmployeeId()); 
    }
}

class SortByName implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
return ((EmployeeDetail)firstObject).getEmployeeName().compareTo(((EmployeeDetail)secondObject).getEmployeeName()); 
    }
}


class SortByAge implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
return ((EmployeeDetail)firstObject).getEmployeeAge().compareTo(((EmployeeDetail)secondObject).getEmployeeAge()); 
    }
}


class SortByAddress implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
return ((EmployeeDetail)firstObject).getEmployeeAddress().compareTo(((EmployeeDetail)secondObject).getEmployeeAddress()); 
    }
}


