/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicepackage;

import Dbpackage.Dbclass;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class Androidservice {
    
    ResultSet rs;
    Statement st;
    Statement st1;

    
    public Androidservice()
            {
                try
                {
                    Dbclass db=new Dbclass();
                    Connection con=db.getc();
                    st=con.createStatement();
                    st1=con.createStatement();
                }
                catch(Exception ex)
                {
                    
                }
            }
    
    public String androidlogin(String username,String password)
    {
        String lid="",type="",full="";
        try
        {
           
            rs=st.executeQuery("select * from login where username='"+username+"' and password='"+password+"'");
            if(rs.next())
            {
                lid=rs.getString(1);
                type=rs.getString(4);
                full=lid+"#"+type;
            }
            else
            {
                full="no";
            }
            
        }
        catch(Exception ex)
        {
            
        }
        return full;
    }
    
    public String login(String username,String password,String type)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into login values(null,'"+username+"','"+password+"','"+type+"')");
            flag="1";
        }
        catch(Exception ex)
        {
            System.err.println(ex.toString()); 
        }
        return flag;
        
    }
    public int maxlogins()
    {
        int lid=0;
        try
        {
            rs=st.executeQuery("select max(lid) from login");
            if(rs.next())
            {
                lid=rs.getInt(1);
            }
        }
        catch(Exception ex)
        {
            
        }
        return lid;
    }
    
    public String userreg(int lid,String name,String gender,String phone,String email,String hname,String post,String city,String district,String pin)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into users values(null,'"+lid+"','"+name+"','"+gender+"','"+phone+"','"+email+"','"+hname+"','"+post+"','"+city+"','"+district+"','"+pin+"')");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public String postdisaster(String lid,String type,String details,String file,String place,String district)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into disaster values(null,'"+lid+"','"+type+"','"+details+"','"+file+"',now(),'"+place+"','"+district+"')");
            flag="1";
           
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    public int maxdisaster()
    {
        int lid=0;
        try
        {
            rs=st.executeQuery("SELECT MAX(dsid) FROM `disaster`");
            if(rs.next())
            {
                lid=rs.getInt(1);
            }
        }
        catch(Exception ex)
        {
            
        }
        return lid;
    }
    
    public String updatedisaster(String did,String filename)
    {
        String flag="0";
        try
        {
            st.executeUpdate("UPDATE `disaster` SET `file`='"+filename+"' WHERE `dsid`='"+did+"'");
            flag="1";
           
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public String donatefund(String name,String fund)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into fund values(null,'"+name+"','"+fund+"',now())");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public String helprequest(String name,String gender,String phone,String place,String noperson,String district,String details,String longi,String lati,String imei)
    {
        String flag="0";
        String qry="INSERT INTO help(hid,name,gender,phone,place,no_persons,district,date,details,latitude,longitude,imei) VALUES(NULL,'"+name+"','"+gender+"','"+phone+"','"+place+"','"+noperson+"','"+district+"',now(),'"+details+"','"+longi+"','"+lati+"','"+imei+"')";
        try
        {
            st.executeUpdate(qry);
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public String postcomplaints(String lid,String dept,String complaints)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into complaints(comid,uid,dept,complaint,cdate,status)values(null,'"+lid+"','"+dept+"','"+complaints+"',now(),'Pending')");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
                
    }
    
    public String uservictimgen(String caid,String name,String gender,String phone,String email,String place,String post,String city,String district,String pin,String hname)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into victim values(null,'"+caid+"','"+name+"','"+gender+"','"+phone+"','"+email+"','"+place+"','"+post+"','"+city+"','"+district+"','"+pin+"',now(),'Pending','"+hname+"')");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public ResultSet userprofileview(String lid)
    {
        try
        {
            rs=st.executeQuery("select * from users where lid='"+lid+"'");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public ResultSet useradminnotiview()
    {
        try
        {
            rs=st.executeQuery("select * from notification");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public ResultSet userpublicinfoview()
    {
        try
        {
            rs=st.executeQuery("select * from public_info");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public int uservolunteerreq(String lid,String area_vo,String details)
    {
        String qry="INSERT INTO `volunteer_req`(`ucid`,`type`,`area_vo`,`details`,`date`,`status`)VALUES('"+lid+"','user','"+area_vo+"','"+details+"',curdate(),'pending')";
        int flag=0;
        try
        {
            st.executeUpdate(qry);
            flag=1;
        }
        catch(Exception ex)
        {
            System.err.println(ex.toString());
        }
        return flag;
      
    }
    
    public ResultSet usercomplaintstatus(String lid)
    {
        try
        {
            rs=st.executeQuery("select * from complaints where uid='"+lid+"'");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public ResultSet userdisnotiview(String lid)
    {
        try
        {
            rs=st.executeQuery("SELECT `district_noti`.* FROM `district_noti`,`users` WHERE `district_noti`.`district`=`users`.`district` and users.lid='"+lid+"'");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public ResultSet uservictimgenstatus(String lid)
    {
        try
        {
            rs=st.executeQuery("select * from victim where caid='"+lid+"'");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public ResultSet userviewmaterialreq()
    {
        try
        {
            rs=st.executeQuery("SELECT `material_req`.*,`camp`.* FROM `material_req`,`camp` WHERE `material_req`.`caid`=`camp`.`lid` AND `material_req`.`status`='Approved' AND `camp`.`Status`='Approved'");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public ResultSet uservolunteerreqstatus(String lid)
    {
        try
        {
            rs=st.executeQuery("select * from volunteer_req where ucid='"+lid+"'");
            
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public String Volunteerreg(int lid,String v_name,String gender,String phone,String email,String ho_name,String post,String city,String district,String state,String pin,String organization,String area_vo)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into volunteer values(null,'"+lid+"','"+v_name+"','"+gender+"','"+phone+"','"+email+"','"+ho_name+"','"+post+"','"+city+"','"+district+"','"+state+"','"+pin+"','"+organization+"','"+area_vo+"')");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public ResultSet volunteerprofileview(String lid)
    {
        try
        {
           rs=st.executeQuery("select * from volunteer where lid='"+lid+"'");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public String volunteerupdation(String lid,String vname,String phone,String email,String hname,String post,String city,String district,String state,String pin,String org,String area)
    {
        String flag="0";
        try
        {
            st.executeUpdate("update volunteer set v_name='"+vname+"',phone='"+phone+"',email='"+email+"',ho_name='"+hname+"',post='"+post+"',city='"+city+"',district='"+district+"',state='"+state+"',pin='"+pin+"',organization='"+org+"',area_vo='"+area+"' where lid='"+lid+"'");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
        
    }
    
    public ResultSet volunteerreqview(String types)
    {
        try
        {
            if(types.equalsIgnoreCase("Camp"))
                    {
                        
                    
            rs=st.executeQuery("SELECT * FROM `volunteer_req`,`Camp` WHERE `volunteer_req`.`type`='camp' AND `volunteer_req`.`ucid`=`camp`.`lid`");
                    }
            else
            {
                rs=st.executeQuery("SELECT * FROM `volunteer_req`,`users` WHERE `volunteer_req`.`type`='user' AND `volunteer_req`.`ucid`=`users`.`lid`");
            }
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public ResultSet volunteerdisnotiview(String lid)
    {
        try
        {
            rs=st.executeQuery("SELECT `district_noti`.* FROM `district_noti`,`volunteer` WHERE `district_noti`.`district`=`volunteer`.`district` AND `volunteer`.`lid`='"+lid+"'");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public int userprofileupdate(String lid,String name,String phone,String email,String hname,String post,String city,String district,String pin)
    {
        int flag=0;
        String qry="UPDATE users SET name='"+name+"',phone='"+phone+"',email='"+email+"',ho_name='"+hname+"',post='"+post+"',city='"+city+"',district='"+district+"',pin='"+pin+"' WHERE lid='"+lid+"'";
        try
        {
            st.executeUpdate(qry);
            flag=1;
        }
        catch(Exception ex)
        {
            System.err.println(ex.toString());
        }
        return flag;
        
    }
    
    public ResultSet viewhelpstatus(String imei)
    {
        try
        {
           rs=st.executeQuery("select * from help where imei='"+imei+"'");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public ResultSet userviewdisaster()
    {
        try
        {
            rs=st.executeQuery("select * from disaster");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public ResultSet userviewfundcertificate(String lid)
    {
        try
        {
            rs=st.executeQuery("select * from certificate_fund where uid='"+lid+"'");
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    public ResultSet publicviewdisnoti(String district)
    {
        try
        {
            rs=st.executeQuery("SELECT * FROM `district_noti` WHERE `district`='"+district+"'");  
        }
        catch(Exception ex)
        {
            
        }
        return rs;
    }
    
    
      public int maxcetifund()
    {
        int lid=0;
        try
        {
            rs=st.executeQuery("select max(cfid) from certificate_fund");
            if(rs.next())
            {
                lid=rs.getInt(1);
            }
        }
        catch(Exception ex)
        {
            
        }
        return lid;
    }
    
    
    public String addusercertificatefundreq(String uid,String type,String details,String file)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into certificate_fund(cfid,uid,type,details,file,date,status)values(null,'"+uid+"','"+type+"','"+details+"','"+file+"',now(),'pending')");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
 
     public String updatecertifund(String cid,String filename)
    {
        String flag="0";
        try
        {
            st.executeUpdate("UPDATE `certificate_fund` SET `file`='"+filename+"' WHERE `cfid`='"+cid+"'");
            flag="1";
           
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
}