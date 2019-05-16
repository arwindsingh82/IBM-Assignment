import java.util.ArrayList;
import java.util.*;
class Laptop{
private	Integer ramSize, hardDisk, id;
private	String brand;

	Laptop( Integer id, Integer ramSize, Integer hardDisk, String brand){
        this.id = id;
		this.ramSize = ramSize;
		this.hardDisk = hardDisk;
		this.brand = brand;

	}



	public Integer getId(){
		return this.id;
	}

	public Integer getRamSize(){
         return this.ramSize;
       
	}

	public Integer getHardDisk(){
          return this.hardDisk;

	}

	public String getBrand(){
          return this.brand;

	}


// setter by set()
		public Integer setId(){
		return this.id;
	}

	public Integer setRamSize(Integer rs){
         return this.ramSize=rs;
       
	}

	public Integer setHardDisk(){
          return this.hardDisk;

	}

	public String setBrand(){
          return this.brand;

	}


@Override
	public String toString() // used to covert all thing in string that concatinate.
	{
		return "Laptop Details:\nID:"+this.getId()+"RAM Size:"+this.getRamSize()+"HDD Size:"+this.getHardDisk()+"BRAND:"+this.getBrand();
	}
	// public void setId(int id)
	// {this.id=id;}

}


class LapCollectionDemo{
   		Scanner sc = new Scanner(System.in);
   	   ArrayList list = new ArrayList();
void addItem()
{
		System.out.print("Enter ID:" ); 
		int id=sc.nextInt();
		System.out.print("Enter RAM Size:"); 
		int rs=sc.nextInt();
		System.out.print("Enter HDD Size:"); 
		int hs=sc.nextInt();
		System.out.print("Enter Brand name:"); 
		String b=sc.next();
         list.add(new Laptop(id,rs,hs,b));	
}
void showItem()
{
    for(Object obj: list)   //created one object and obj is the link for list 
       {
        System.out.println(obj.toString());  // to avoid hexa value output we used string tostring.
       }
}

void removeItem()
{
System.out.println("Enter ID of ITEM want to delete: ");
int id = sc.nextInt();
int flag=0;
for (Object obj : list ){ 

	if(((Laptop)obj).getId()==id){
	this.list.remove(this.list.indexOf(((Laptop)obj)));
	System.out.println("Item deleted from list");
	flag=1;
	break;
}
  
}
if(flag==0)
	System.out.println("Id does not exist");
	
}



void searchItem()
{
System.out.println("Enter ID of ITEM want to search: ");
int id = sc.nextInt();
int flag=0;
for (Object obj : list ) {
	if(((Laptop)obj).getId()==id){
		System.out.println("Id Exist: ");
		System.out.println(obj.toString());
	flag=1;
	break;
}

}
if(flag==0)
	System.out.println("Id does not exist");

	
}



void updateItem()
{


	
		System.out.println("enter id of that item you want to update: ");
		int id = sc.nextInt();
		sc.nextLine();
			System.out.print("Enter item name you want to update:" ); 
		String name=sc.nextLine();
		name=name.toLowerCase();
int flag=0;
for (Object obj : list ) {
	if(((Laptop)obj).getId()==id){
		System.out.println("Id Exist: ");
}

	switch(name){

		case "ramsize":	 	{

	 	System.out.print("Enter RAM Size:");

	 	Integer rs=sc.nextInt();

	 	((Laptop)obj).setRamSize(rs);	
	

	 	}
	 	break;
 
	 	case "harddisk":	 	{     

	 	System.out.print("Enter Harddisk size:");

	 	Integer rs=sc.nextInt();

	 	((Laptop)obj).setHardDisk();	

	 	}
        break;
	 	case "brand":	 	{

	 	System.out.print("Enter Brand name:");

	 	String rs=sc.nextLine();

	 	((Laptop)obj).setBrand();	

	 	}

	}
	flag=1;
	break;
}


if(flag==0){
	System.out.println("Id does not exist");
}

}

	public static void main(String[] args) {
   		Scanner sc1 = new Scanner(System.in);
   		LapCollectionDemo lp=new LapCollectionDemo();
   ArrayList list = new ArrayList();

   		  list.add(new Laptop(4, 500, 1000, "IBM"));
        list.add(new Laptop(8, 800, 2000, "IBM"));     
        list.add(new Laptop(6, 500, 3000, "Sony"));

       System.out.println("Contents of list : " + list);

String choice="y";

           do{

           	/*	 System.out.print("select choice (Y/N):");
            choice=sc1.next();*/
    
            System.out.println("Enter your option to perform task: ");
 System.out.println("INSERT ");
 System.out.println("SEARCH ");
 System.out.println("VIEW ");
 System.out.println("REMOVE ");
 System.out.println("UPDATE ");

String name = sc1.nextLine();

name = name.toLowerCase();
 //sc1.nextLine();
switch(name){
	case "insert":{
   		System.out.println("Enter how many items u want to insert:");
   		int ch=sc1.nextInt();
   		for(int i=0;i<ch;i++)
   		{
   		System.out.println("Enter details of "+(i+1)+" items:");
		lp.addItem();
			    }
			    lp.showItem();
	}
	break;

	case "view":{
		lp.showItem();
}
break;

case "remove":{
		lp.removeItem();
		lp.showItem();
	}
	break;

case "search":{
		lp.searchItem();
	}
	break;

case "update":{
		lp.updateItem();
		lp.showItem();
		}
		break;

default: 
		System.out.println("wrong entry");
		break;

	}

	 System.out.print("select choice (Y/N):");
            choice=sc1.next();
	}	
         while(choice.equalsIgnoreCase("Y"));
          
		
}
 }



