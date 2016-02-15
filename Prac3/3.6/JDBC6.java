import java.sql.*;
import java.util.*;
class JDBC6{
    public static void main(String args[]){
        PreparedStatement stmt=null;
        Connection con=null;
        String PhNo,AcNo;
        String Name,Address;
        Double Balance;
        int i=0;
        
        try{
            System.out.println("Enroll no:130050131058");
            MyData m1=new MyData();
            con=m1.SetConnection("s2c130050131058");
            stmt=con.prepareStatement("create table Bank (AcNo varchar,Name varchar(50),Balance integer,PhNo varchar,Address varchar(50))");
            stmt.executeUpdate();
            System.out.println("Table Created");
            Scanner sc=new Scanner(System.in);
            while(i!=1){
                System.out.println("Enter the operation to be performed:\n1.Insert\n2.Update\n3.Delete\n4.View \n5.Exit");
                int ch=sc.nextInt();
                
                switch(ch){
                    
                    case 1:
                        stmt=con.prepareStatement("insert into Bank values(?,?,?,?,?)");
                        System.out.println("Enter Account No:");
                        AcNo=sc.next();
                        System.out.println("Enter Customer Name:");
                        Name=sc.next();
                        System.out.println("Enter Balance::");
                        Balance=sc.nextDouble();
                        System.out.println("Enter Phone No:");
                        PhNo=sc.next();
                        System.out.println("Enter Address:");
                        Address=sc.next();
                        stmt.setString(1,AcNo);
                        stmt.setString(2,Name);
                        stmt.setDouble(3,Balance);
                        stmt.setString(4,PhNo);
                        stmt.setString(5,Address);
                        stmt.executeUpdate();
                        System.out.println("Data inserted successfully.");
                        break;
                
                    case 2:
                        stmt=con.prepareStatement("update Bank set balance=? where acno= ?;");  
                        System.out.println("Enter Account No:");
                        AcNo=sc.next();
                        System.out.println("Enter Balance::");
                        Balance=sc.nextDouble();
                        stmt.setString(2,AcNo);
                        stmt.setDouble(1,Balance);
                        stmt.executeUpdate();
                        System.out.println("Data Updated successfully");
                        break;
                    case 3:
                        stmt=con.prepareStatement("delete from Bank where acno=?");
                        System.out.println("Enter Account No:");
                        AcNo=sc.next();
                        stmt.setString(1,AcNo);
                        stmt.executeUpdate();
                        System.out.println("Data Deleted successfully");
                        break;
					case 4:
						stmt=con.prepareStatement("select * from Bank where Balance>?");
						System.out.print("balance greater then:");
						Balance=sc.nextDouble();
						stmt.setDouble(3,Balance);
						ResultSet r=stmt.executeQuery();
						while(r.next()){
							System.out.println(r.getString("Account No")+"\t"+r.getString("Customer Name")+"\t"+r.getString("Balance")+"\t"+r.getString("Phone No")+"\t"+r.getString("Address"));
						}
						break; 
					
                    case 5:
                        i=1;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                        
                }
            }
        }
        catch(Exception e){
            
            System.out.println(e.getMessage());
        }
        
    }
        

}
