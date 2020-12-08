import java.io.*;
class Employee
{
    double basic,da=0.2,hra=0.15;
    String Emp_name,Emp_code,Address,Ph_no;
    void entry()
    {    try{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Give the employee name: ");
         Emp_name = br.readLine();
         System.out.println("Give the employee code: ");
         Emp_code = br.readLine();
         System.out.println("Give the employee address: ");
         Address = br.readLine();
         System.out.println("Give the employee ph no: ");
         Ph_no = br.readLine();
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
    }
}
class Manager extends Employee
{ 
    void entM()
    {   try{
        entry();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give the manager basic: ");
        basic=Double.parseDouble(br.readLine());
        da=basic*0.15;
        hra=basic*0.2;
        }
        catch(Exception e)
         {
             System.out.println(e);
         }
    }
    void display()
    {   
        double sal=basic+da+hra;
        System.out.println("Employee name is "+Emp_name);
        System.out.println("Employee code is "+Emp_code);
        System.out.println("Employee address is "+Address);
        System.out.println("Employee contact number is "+Ph_no);
        System.out.println("Employee Salary is "+sal);
    }
}
class Officer extends Employee
{ 
    void entO()
    {   try{
        entry();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give the Officer basic: ");
        basic=Double.parseDouble(br.readLine());
        da=basic*0.15;
        hra=basic*0.2;
        }
        catch(Exception e)
         {
             System.out.println(e);
         }
    }
    void display()
    {   
        double sal=basic+da+hra;
        System.out.println("Employee name is "+Emp_name);
        System.out.println("Employee code is "+Emp_code);
        System.out.println("Employee address is "+Address);
        System.out.println("Employee contact number is "+Ph_no);
        System.out.println("Employee Salary is "+sal);
    }
}
class Typist extends Employee
{  
    void entT()
    {   try{
        entry();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give the typist basic: ");
        basic=Double.parseDouble(br.readLine());
        da=basic*0.15;
        hra=basic*0.2;
        }
        catch(Exception e)
         {
             System.out.println(e);
         }
    }
    void display()
    {   
        double sal=basic+da+hra;
        System.out.println("Employee name is "+Emp_name);
        System.out.println("Employee code is "+Emp_code);
        System.out.println("Employee address is "+Address);
        System.out.println("Employee contact number is "+Ph_no);
        System.out.println("Employee Salary is "+sal);
    }
}
public class SingInh
{
  public static void main(String args[])
    { try{ 
      int i,num=5;
      System.out.println("\nEnter 5 Manager Details\n");
      Manager[] man=new Manager[num];
        for(i=0;i<num;i++)
        {
            man[i]=new Manager();
            man[i].entM();
        }
      System.out.println("\nEnter 5 Typist Details\n");
      Typist[] typ=new Typist[num];
        for(i=0;i<num;i++)
        {
            typ[i]=new Typist();
            typ[i].entT();
        }
      System.out.println("\nEnter 5 Officer Details\n");
      Officer[] off=new Officer[num];
        for(i=0;i<num;i++)
        {
            off[i]=new Officer();
            off[i].entO();
        }
      System.out.println("\nManager details\n");
         for(i=0;i<num;i++)
        {
         man[i].display();
        }
      System.out.println("\nTypist Details\n");
         for(i=0;i<num;i++)
        {
         typ[i].display();
        }
      System.out.println("\nOfficer Details\n");
         for(i=0;i<num;i++)
        {
         off[i].display();
        }
      }
      catch(Exception e){

        }

    }
}