import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcCrud {
	public static void main(String args[]) {
		try {
			//Step 1 Include the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2 Establish the Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false","root","admin");
			
			while(true) {
				System.out.println("1. Select");
				System.out.println("2. Insert");
				System.out.println("3. Delete");
				System.out.println("4. Update");
				System.out.println("5. Stop");
				
				System.out.println("What do you want to do ? ");
				System.out.println();
				Scanner sc=new Scanner(System.in);
				int ch=sc.nextInt();
				
				if(ch==1) {
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("select * from student");
					while(rs.next()) 
						System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
					System.out.println("All the Rows fetched from the table");
					System.out.println();
				} else if(ch==2) {
					System.out.println("Enter the Roll No:");
					int roll=sc.nextInt();
					System.out.println("Enter the Name:");
					String name=sc.next();
					System.out.println("Enter the Class:");
					String classs=sc.next();
					
					PreparedStatement pstmt=con.prepareStatement("insert into student(roll,name,class) values(?,?,?)");
					pstmt.setInt(1, roll);
					pstmt.setString(2, name);
					pstmt.setString(3, classs);
					
					int rows=pstmt.executeUpdate();
					if(rows>0) {
						System.out.println("New Student added Successfully");
					}else {
						System.out.println("New Student not added Successfully");
					}
					System.out.println();
				} else if(ch==3) {
					System.out.println("Enter the Roll No of Student to be Deleted:");
					int roll=sc.nextInt();
					
					PreparedStatement pstmt=con.prepareStatement("delete from student where roll=?");
					pstmt.setInt(1, roll);
					
					int res=pstmt.executeUpdate();
					if(res>0) {
						System.out.println("Student having Roll No " + roll + "deleted successfully");
					}else {
						System.out.println("No Student with Roll No " + roll);
					}
					System.out.println();
				} else if(ch==4) {
					System.out.println("Enter the Roll No of Student details to be Updated:");
					int roll=sc.nextInt();
					
					System.out.println("Enter the correct Class of this student:");
					String classs=sc.next();
					
					PreparedStatement pstmt=con.prepareStatement("update student set class=?");
					pstmt.setString(1, classs);
					
					int res=pstmt.executeUpdate();
					if(res>0) {
						System.out.println("Student having Roll No " + roll + "details updated successfully");
					}else {
						System.out.println("No Student with Roll No " + roll);
					}
					System.out.println();
				} else if(ch==5){
					System.out.println("Database has been Terminated");
					con.close();
					System.out.println("Connection has been Closed");
					break;
				} else {
					System.out.println("Invalid Input");
					con.close();
					System.out.println("Connection has been Closed");
					break;
				}
					
			}//while	    
		}//try
		catch(Exception e) {
			System.out.println("Exception Occured : " + e);
		}
	}
}
