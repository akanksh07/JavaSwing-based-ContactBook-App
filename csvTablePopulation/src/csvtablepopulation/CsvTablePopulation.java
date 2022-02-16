
package csvtablepopulation;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.FileReader;  
import com.opencsv.CSVReader;  
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.sql.Types; 

public class CsvTablePopulation {
    public static void main(String[] args) {
        System.out.println("Hello World");   
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;	
        try {           
            myConn = DriverManager.getConnection("jdbc:mysql://bubvhjcwfocodkgqw8py-mysql.services.clever-cloud.com", "uh3hfr8kr8chwzhn" , "sRpGpFx1adXL7ZKy5gnC");
            myStmt = myConn.createStatement();
            myStmt.executeUpdate("USE bubvhjcwfocodkgqw8py;");
            
            //Creating Contact Table
            myStmt.executeUpdate("""
                                 create table  if not exists pb_contact (cont_id INT NOT NULL AUTO_INCREMENT,
                                               fname VARCHAR(20) NOT NULL,
                                               lname VARCHAR(20) NOT NULL,
                                               mname VARCHAR(20),
                                               CONSTRAINT user_info UNIQUE(lname,fname,mname),
                                               PRIMARY KEY (cont_id) );"""); 
            myStmt.executeUpdate("ALTER TABLE pb_contact AUTO_INCREMENT = 1000;");
            //Create address table
            myStmt.executeUpdate("""
                                 create table  if not exists pb_address (add_id INT NOT NULL AUTO_INCREMENT,
                                               cont_id INT NOT NULL,
                                               address_type VARCHAR(10),
                                               st_address VARCHAR(30),
                                               city VARCHAR(12),
                                               state VARCHAR(10),
                                               zipcode VARCHAR(10),
                                               PRIMARY KEY (add_id),
                                               FOREIGN KEY (cont_id) REFERENCES pb_contact(cont_id));""");
            
            //Create phone table
            myStmt.executeUpdate("""
                                 create table  if not exists pb_phone (phone_id INT NOT NULL AUTO_INCREMENT,
                                               cont_id INT NOT NULL,
                                               phone_type VARCHAR(10),
                                               area_code VARCHAR(3),
                                               number VARCHAR(7),
                                               PRIMARY KEY (phone_id),
                                               FOREIGN KEY (cont_id) REFERENCES pb_contact(cont_id));""");
            
            //Create date table
            myStmt.executeUpdate("""
                                 create table  if not exists pb_date (date_id INT NOT NULL  AUTO_INCREMENT,
                                               cont_id INT NOT NULL,
                                               date_type VARCHAR(10),
                                               date date,
                                               PRIMARY KEY (date_id),
                                               FOREIGN KEY (cont_id) REFERENCES pb_contact(cont_id));""");
            
            
            
            myRs=myStmt.executeQuery("Show tables");
            while(myRs.next()){
                 System.out.println(myRs.getString("Tables_in_bubvhjcwfocodkgqw8py"));
             }
             }
        
        catch (Exception exc) {
             exc.printStackTrace();
         }
        
        
        String trail= "5|6|7||8|9||";
        String[] split = trail.split("\\|",-1);
        System.out.println(Arrays.toString(split));
        
        System.out.println("Here");
        //Reading CSV files to populate the member tables
        CSVReader reader = null;  
        try  
        {  
            //parsing a CSV file into CSVReader class constructor  
            reader = new CSVReader(new FileReader("C:\\Users\\ab1997\\Documents\\NetBeansProjects\\csvTablePopulation\\Contacts.cvs.csv"));  
            String [] nextLine;  
            //reads one line at a time  
            while ((nextLine = reader.readNext()) != null)  
            {  
                
                String csvRecord="";
                for(String token : nextLine)  
                {  
                    csvRecord+=token+", ";  
                }  
             
                String[] csvRecordSplit=csvRecord.split(",");
                String fname= csvRecordSplit[1];
                String mname= csvRecordSplit[2];
                String lname= csvRecordSplit[3];
                String home_phone= csvRecordSplit[4];
                String cell_phone= csvRecordSplit[5];
                String home_address= csvRecordSplit[6];
                String home_city= csvRecordSplit[7];
                String home_state= csvRecordSplit[8];
                String home_zip= csvRecordSplit[9];
                String work_phone= csvRecordSplit[10];
                String work_address= csvRecordSplit[11];
                String work_city= csvRecordSplit[12];
                String work_state= csvRecordSplit[13];
                String work_zip= csvRecordSplit[14];
                String birth_date= csvRecordSplit[15];
                
                //Insert values into contact table
                 String query1 = "INSERT INTO pb_contact (fname,mname,lname) VALUES("
                + "?, ?, ?)";
                PreparedStatement st = myConn.prepareStatement(query1);
                st.setString(1,fname);
                st.setString(2,mname);
                st.setString(3,lname);
                // execute the preparedstatement insert
                try{
                      st.executeUpdate();
                }
                catch (Exception exc) {
                      exc.printStackTrace();
                 }
                st.close();
                
                
                //-------------------------------------------------------------
                query1 = "SELECT cont_id from pb_contact where fname=? AND mname=? AND lname=?";
                st = myConn.prepareStatement(query1);
                st.setString(1,fname);
                st.setString(2,mname);
                st.setString(3,lname);
                int cont_id=-1;
                // execute the preparedstatement insert
                try{
                    
                     ResultSet cont_id_holder=st.executeQuery();
                     cont_id_holder.next();
                     cont_id=cont_id_holder.getInt("cont_id");
                     
                }
                catch (SQLException exc) {
                 }
                st.close();
                
                
                //----------------------------------------------------------------------------------
                query1 = "INSERT INTO pb_address (cont_id,address_type,st_address,city,state,zipcode) VALUES (?,?,?,?,?,?)";
                st = myConn.prepareStatement(query1);
                
                st.setInt(1,cont_id);
                st.setString(2,"Home");
                st.setString(3,home_address);
                st.setString(4,home_city);
                st.setString(5,home_state);
                st.setString(6,home_zip);
                // execute the preparedstatement insert
                 try{
                      st.executeUpdate();
                }
                catch (SQLException exc) {
                 }
                st.close();
                
                query1 = "INSERT INTO pb_address (cont_id,address_type,st_address,city,state,zipcode) VALUES (?,?,?,?,?,?)";
                st = myConn.prepareStatement(query1);
                
                st.setInt(1,cont_id);
                st.setString(2,"Work");
                st.setString(3,work_address);
                st.setString(4,work_city);
                st.setString(5,work_state);
                st.setString(6,work_zip);
                // execute the preparedstatement insert
                 try{
                      st.executeUpdate();
                }
                catch (SQLException exc) {
                 }
                st.close();
                
                //--------------------------------------------------------------------------------------
                
                query1 = "INSERT INTO pb_phone (cont_id,phone_type,area_code,number) VALUES (?,?,?,?)";
                st = myConn.prepareStatement(query1);
                
                st.setInt(1,cont_id);
                st.setString(2,"Personal");
                st.setString(3,cell_phone.equals(" ")? " ":String.valueOf(cell_phone.charAt(1))+cell_phone.charAt(2)+cell_phone.charAt(3));
                st.setString(4,cell_phone.equals(" ")? " ":String.valueOf(cell_phone.charAt(5))+cell_phone.charAt(6)+cell_phone.charAt(7)
                                +cell_phone.charAt(9)+cell_phone.charAt(10)+cell_phone.charAt(11)+cell_phone.charAt(12));
               
                // execute the preparedstatement insert
                 try{
                      st.executeUpdate();
                }
                catch (Exception exc) {
                      exc.printStackTrace();
                 }
                st.close();
                
                query1 = "INSERT INTO pb_phone (cont_id,phone_type,area_code,number) VALUES (?,?,?,?)";
                st = myConn.prepareStatement(query1);
                
                st.setInt(1,cont_id);
                st.setString(2,"Home");
                st.setString(3,home_phone.equals(" ")? " ":String.valueOf(home_phone.charAt(1))+home_phone.charAt(2)+home_phone.charAt(3));
                st.setString(4,home_phone.equals(" ")? " ":String.valueOf(home_phone.charAt(5))+home_phone.charAt(6)+home_phone.charAt(7)
                                +home_phone.charAt(9)+home_phone.charAt(10)+home_phone.charAt(11)+home_phone.charAt(12));
               
                // execute the preparedstatement insert
                 try{
                      st.executeUpdate();
                }
                catch (Exception exc) {
                      exc.printStackTrace();
                 }
                st.close();
                
                query1 = "INSERT INTO pb_phone (cont_id,phone_type,area_code,number) VALUES (?,?,?,?)";
                st = myConn.prepareStatement(query1);
                
                st.setInt(1,cont_id);
                st.setString(2,"Work");
                st.setString(3,work_phone.equals(" ")? " ":String.valueOf(work_phone.charAt(1))+work_phone.charAt(2)+work_phone.charAt(3));
                st.setString(4,work_phone.equals(" ")? " ":String.valueOf(work_phone.charAt(5))+work_phone.charAt(6)+work_phone.charAt(7)
                                +work_phone.charAt(9)+work_phone.charAt(10)+work_phone.charAt(11)+work_phone.charAt(12));
               
                // execute the preparedstatement insert
                 try{
                      st.executeUpdate();
                }
                catch (Exception exc) {
                      exc.printStackTrace(); 
                 }
                st.close();

                //--------------------------------------------------------------------------------------
                query1 = "INSERT INTO pb_date (cont_id,date_type,date) VALUES (?,?,?)";
                st = myConn.prepareStatement(query1);
                
                st.setInt(1,cont_id);
                st.setString(2,"Birth date");
                st.setString(3,birth_date.equals(" ")?"0000-00-00":birth_date);
                // execute the preparedstatement insert
                 try{
                      st.executeUpdate();
                }
                catch (Exception exc) {
                      exc.printStackTrace();
                 }
                st.close();
                //--------------------------------------------------------------------------------------
      
                
                //replace ' ' values by NULL
                query1 = """
                         UPDATE pb_contact
                         SET    mname = NULL
                         WHERE  mname = ' ';""";
                myStmt.executeUpdate(query1);
                
                //replace ' ' values by NULL
                query1 = """
                         UPDATE pb_address
                         SET    st_address = NULL
                         WHERE  st_address = ' ';""";
                myStmt.executeUpdate(query1);
                
                //replace ' ' values by NULL
                query1 = "UPDATE pb_address\n" +
                "SET    city = NULL\n" +
                "WHERE  city = ' ';";
                myStmt.executeUpdate(query1);
                
                //replace ' ' values by NULL
                query1 = "UPDATE pb_address\n" +
                "SET    state = NULL\n" +
                "WHERE  state = ' ';";
                myStmt.executeUpdate(query1);
                
                //replace ' ' values by NULL
                query1 = "UPDATE pb_address\n" +
                "SET    zipcode = NULL\n" +
                "WHERE  zipcode = ' ';";
                myStmt.executeUpdate(query1);
                
                //replace ' ' values by NULL
                query1 = "UPDATE pb_phone\n" +
                "SET    area_code = NULL\n" +
                "WHERE  area_code = ' ';";
                myStmt.executeUpdate(query1);
                
                //replace ' ' values by NULL
                query1 = "UPDATE pb_phone\n" +
                "SET    number = NULL\n" +
                "WHERE  number = ' ';";
                myStmt.executeUpdate(query1);

                //replace ' ' values by NULL
                query1 = "UPDATE pb_date\n" +
                "SET    date = NULL\n" +
                "WHERE  date ='0000-00-00';";
                myStmt.executeUpdate(query1);
                
         
            }
        }
         catch (Exception exc) {
             exc.printStackTrace();
         }
    }
    
}
