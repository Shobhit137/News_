
package com.daos;

import com.beans.Reporter;

import com.pool.ConnectionPool;
import java.sql.*;
import java.util.ArrayList;
import java.util.Base64;

public class ReporterDao {
    public boolean  add(Reporter Reporter){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "Insert into reporter(name,gender,dob,userid,password,photo,contact,email,status,address) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, Reporter.getName());
            
            smt.setString(2, Reporter.getGender());
            smt.setString(3, Reporter.getDob());
           
            smt.setString(4, Reporter.getUserid());
            smt.setString(5,Reporter.getPassword());
            smt.setString(6, Reporter.getPhoto());
            smt.setString(7, Reporter.getContact());
            smt.setString(8, Reporter.getEmail());
            smt.setString(9,Reporter.getStatus());
            smt.setString(10,Reporter.getAddress());
//            System.out.println("Photo"+Reporter.getPhoto());
//            System.out.println("Contact"+Reporter.getContact());

            if(smt.executeUpdate()>0)
                status=true;
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return status;
   }
   
   
   
   public boolean  remove(int id){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "Delete from reporter where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, id);
            
            if(smt.executeUpdate()>0)
                status=true;
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return status;
   }
   
   public Reporter  getById(int id){
      Reporter reporter=null;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, id);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                reporter =new Reporter();
                reporter.setId(rs.getInt("id"));
                reporter.setName(rs.getString("name"));
                reporter.setEmail(rs.getString("email"));
                reporter.setDob(rs.getString("dob"));
                reporter.setGender(rs.getString("gender"));
                reporter.setStatus(rs.getString("status"));
                reporter.setUserid(rs.getString("userid"));
                reporter.setPassword(rs.getString("password"));
                reporter.setPhoto(rs.getString("photo"));
                reporter.setContact(rs.getString("contact"));
                reporter.setAddress(rs.getString("address"));
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return reporter;
   }
   
   public ArrayList<Reporter>  getAllRecords(){
    
       ArrayList<Reporter> reporters =new ArrayList<Reporter>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Reporter reporter=new Reporter();
                reporter.setId(rs.getInt("id"));
                reporter.setName(rs.getString("name"));
                reporter.setEmail(rs.getString("email"));
                reporter.setDob(rs.getString("dob"));
                reporter.setGender(rs.getString("gender"));
                reporter.setStatus(rs.getString("status"));
                reporter.setUserid(rs.getString("userid"));
                reporter.setPassword(rs.getString("password"));
                reporter.setPhoto(rs.getString("photo"));
                reporter.setContact(rs.getString("contact"));
                reporter.setAddress(rs.getString("address"));
                reporters.add(reporter);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return reporters;
   }
   
   
   
   public ArrayList<Reporter>  getRecordByLimit(int start, int end){
    
       ArrayList<Reporter> reporters =new ArrayList<Reporter>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter limit ?,?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, start);
            smt.setInt(2, end);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Reporter reporter=new Reporter();
                reporter.setId(rs.getInt("id"));
                reporter.setName(rs.getString("name"));
                reporter.setEmail(rs.getString("fname"));
                reporter.setDob(rs.getString("dob"));
                reporter.setGender(rs.getString("gender"));
                reporter.setStatus(rs.getString("status"));
                reporter.setUserid(rs.getString("userid"));
                reporter.setPassword(rs.getString("password"));
                reporter.setPhoto(rs.getString("photo"));
                reporter.setContact(rs.getString("contact"));
                reporters.add(reporter);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return reporters;
   }
   
  
   public int  getRecordsCount(){
    
       int total=0;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select count(*) from reporter";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                total = rs.getInt(1);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return total;
   }
   
   public boolean  update(Reporter reporter){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "update Reporter set name=?,gender=?,dob=?,email=?,photo=?,contact=?,address=? where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, reporter.getName());
            smt.setString(3, reporter.getEmail());
            smt.setString(2, reporter.getGender());
            smt.setString(4, reporter.getDob());
            smt.setString(6, reporter.getAddress());
           
            smt.setString(4, reporter.getPhoto());
            smt.setString(5, reporter.getContact());
            smt.setInt(7, reporter.getId());
            if(smt.executeUpdate()>0)
                status=true;
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return status;
   }
    public boolean  isContact(String reporter_id){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where contact=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, reporter_id);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                status=true;
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       return status;
    } 
    public boolean  isEmailExist(String email){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where contact=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, email);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                status=true;
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       return status;
    }
    
    public boolean  isValid(String userid,String password){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where userid=?,password=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, userid);
            smt.setString(2, password);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                status=true;
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       return status;
    }
    public Reporter  getByLoginData(String userid,String password){
      Reporter reporter=null;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where userid=? and password=? and status='approved'";
            PreparedStatement smt = con.prepareStatement(sql);
            String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes("UTF-8"));
            smt.setString(1, userid);
            smt.setString(2, encodedPassword);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                reporter =new Reporter();
                reporter.setId(rs.getInt("id"));
                reporter.setName(rs.getString("name"));
                reporter.setDob(rs.getString("dob"));
                reporter.setGender(rs.getString("gender"));
                reporter.setUserid(rs.getString("userid"));
                reporter.setPassword(rs.getString("password"));
                reporter.setPhoto(rs.getString("photo"));
                reporter.setContact(rs.getString("contact"));
                reporter.setEmail(rs.getString("email"));
                reporter.setStatus(rs.getString("status"));
                reporter.setAddress(rs.getString("address"));
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
       return reporter;
   }  
    
}
