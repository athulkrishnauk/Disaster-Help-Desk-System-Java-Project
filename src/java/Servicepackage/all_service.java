/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicepackage;

import Dbpackage.Dbclass;
import Modalpackage.AdminRescueModel;
import Modalpackage.Admincollectormodel;
import Modalpackage.Adminnotificationmodel;
import Modalpackage.Adminpublicinfomodel;
import Modalpackage.Campregistrationmodel;
import Modalpackage.Certificatefundmodel;
import Modalpackage.Certificatefunduser;
import Modalpackage.Collectorcoordinatormodel;
import Modalpackage.Complaintmodel;
import Modalpackage.Complaintviewmodel;
import Modalpackage.Disastermodel;
import Modalpackage.Disasterviewmodel;
import Modalpackage.Districtnotificationmodel;
import Modalpackage.Fundmodel;
import Modalpackage.Helpmodel;
import Modalpackage.Loginpackage;
import Modalpackage.Materialmodel;
import Modalpackage.Materialreqviewmodel;
import Modalpackage.Usersmodel;
import Modalpackage.Victimmodel;
import Modalpackage.Volunteermodel;
import Modalpackage.Volunteerreqmodel;
import Modalpackage.Volunteerreqviewmodel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class all_service {
    
    ResultSet rs;
    ResultSet rs1;
    Statement st;
    Statement st1;
    Statement st2;
    Statement st3;
    
    
    public all_service()
    {
      try
      {
          Dbclass db=new Dbclass();
          Connection con=db.getc();
          st=con.createStatement();
          st1=con.createStatement();
          st2=con.createStatement();
          st3=con.createStatement();
          
      }
      catch(Exception ex)
      {
          
      }
    }
    
    
    public String collectors(Admincollectormodel am)
    {
        String flag="0";
        try
        {
            
            st.executeUpdate("insert into collector values(null,'"+am.getLid()+"','"+am.getName()+"','"+am.getDistrict()+"','"+am.getPhone()+"','"+am.getEmail()+"')");
            
          
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public String noti(Adminnotificationmodel am)
    {
        String flag="0";
        try
        {
            
            st.executeUpdate("insert into notification values(null,'"+am.getSubject()+"','"+am.getDetails()+"',now())");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
     public String recues(AdminRescueModel ar)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into rescue_team values(null,'"+ar.getLid()+"','"+ar.getB_name()+"','"+ar.getL_name()+"','"+ar.getType()+"','"+ar.getNo_members()+"','"+ar.getPhone()+"','"+ar.getEmail()+"','"+ar.getDistrict()+"')");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
      public String logins(Loginpackage lo)
    {
       String flag="0";
       try
       {
         
           st.executeUpdate("insert into login values(null,'"+lo.getUsername()+"','"+lo.getPassword()+"','"+lo.getType()+"')");
           flag="1";
           
       }
       catch(Exception ex)
       {
           
       }
        return flag;
    }
    
    public int maxLogin(){
        int lid=0;
        try
       {
       
           rs=st.executeQuery("SELECT MAX(lid) FROM login");
           if(rs.next()){
               lid=rs.getInt(1);
           }
           
       }
       catch(Exception ex)
       {
           
       }
       return lid;
    }
    
    public ArrayList<Adminnotificationmodel> notiview()
    {
       ArrayList<Adminnotificationmodel> an=new ArrayList<>();
       try
       {
           rs=st.executeQuery("select * from notification");
           while(rs.next())
           {
               Adminnotificationmodel am=new Adminnotificationmodel();
               am.setSubject(rs.getString(2));
               am.setDetails(rs.getString(3));
               am.setDate(rs.getString(4));
               an.add(am);
           }
           
       }
       catch(Exception ex)
       {
           
       }
        return an;
    }
    
    public ArrayList<Admincollectormodel> collectorview()
    {
        ArrayList<Admincollectormodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("select * from collector");
            while(rs.next())
            {
                Admincollectormodel am=new Admincollectormodel();
                am.setId(rs.getInt(1));
                am.setName(rs.getString(3));
                am.setDistrict(rs.getString(4));
                am.setPhone(rs.getString(5));
                am.setEmail(rs.getString(6));
                ac.add(am);
            }
            
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    public ArrayList<Admincollectormodel> collectorupdate(int value)
    {
        ArrayList<Admincollectormodel> am=new ArrayList<>();
        try
        {
            
            rs=st.executeQuery("select * from collector where cid='"+value+"'");
            while(rs.next())
            {
                Admincollectormodel ac=new Admincollectormodel();
                ac.setId(rs.getInt(1));
                ac.setName(rs.getString(3));
                ac.setDistrict(rs.getString(4));
                ac.setPhone(rs.getString(5));
                ac.setEmail(rs.getString(6));
                am.add(ac);
            }
           
            
        }
        catch(Exception ex)
        {
            
        }
        return am;
    }
    public String collectorupdates(Admincollectormodel ac)
    {
        String flag="0";
        try
        {
            st.executeUpdate("update collector set dc_name='"+ac.getName()+"',district='"+ac.getDistrict()+"',phone='"+ac.getPhone()+"',email='"+ac.getEmail()+"' where cid='"+ac.getId()+"'");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public String camp(Campregistrationmodel am)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into camp values(null,'"+am.getLid()+"','"+am.getCname()+"','"+am.getConame()+"','"+am.getPhone()+"','"+am.getEmail()+"','"+am.getPlace()+"','"+am.getDistrict()+"','"+am.getTotalp()+"','"+am.getLati()+"','"+am.getLongi()+"','Pending')");
            flag="1";
            
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public ArrayList<AdminRescueModel> rescueview()
    {
        ArrayList<AdminRescueModel> am=new ArrayList<>();
        try
        {
            rs=st.executeQuery("select * from rescue_team");
            while(rs.next())
            {
                AdminRescueModel ar=new AdminRescueModel();
                ar.setRid(rs.getInt(1));
                ar.setB_name(rs.getString(3));
                ar.setL_name(rs.getString(4));
                ar.setType(rs.getString(5));
                ar.setNo_members(rs.getString(6));
                ar.setPhone(rs.getString(7));
                ar.setEmail(rs.getString(8));
                ar.setDistrict(rs.getString(9));
                am.add(ar);
            }
            
        }
        catch(Exception ex)
        {
            
        }
        return am;
    }
    
    public ArrayList<AdminRescueModel> rescueupdate(int value)
    {
        ArrayList<AdminRescueModel> am=new ArrayList<>();
        try
        {
            rs=st.executeQuery("select * from rescue_team where rid='"+value+"'");
            while(rs.next())
            {
                AdminRescueModel ar=new AdminRescueModel();
                ar.setRid(rs.getInt(1));
                ar.setB_name(rs.getString(3));
                ar.setL_name(rs.getString(4));
                ar.setType(rs.getString(5));
                ar.setNo_members(rs.getString(6));
                ar.setPhone(rs.getString(7));
                ar.setEmail(rs.getString(8));
                ar.setDistrict(rs.getString(9));
                am.add(ar);
                
            }
            
        }
        catch(Exception ex)
        {
            
        }
        return am;
    }
    
    public String rescueupdates(AdminRescueModel ar)
    {
        ArrayList<AdminRescueModel> am=new ArrayList<AdminRescueModel>();
        String flag="0";
        try
        {
            st.executeUpdate("update rescue_team set b_name='"+ar.getB_name()+"',l_name='"+ar.getL_name()+"',type='"+ar.getType()+"',no_members='"+ar.getNo_members()+"',phone='"+ar.getPhone()+"',email='"+ar.getEmail()+"',district='"+ar.getDistrict()+"' where rid='"+ar.getRid()+"'");
            flag="1";
            
        }
        catch(Exception ex)
        {
            
        }
        return flag;
       
    }
    
    public String publicinfo(Adminpublicinfomodel ap)
    {
        String flag="0";
        try
        {
            String qry="insert into public_info values(null,'"+ap.getSubject()+"','"+ap.getDetails()+"','"+ap.getType()+"','"+ap.getFile()+"')";
          st.executeUpdate(qry);
          flag="1";
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        return flag;
    }
    public ArrayList<Adminpublicinfomodel> publicinfoview()
    {
        ArrayList<Adminpublicinfomodel> am=new ArrayList<>();
        try
        {
            rs=st.executeQuery("select * from public_info");
            while(rs.next())
            {
                Adminpublicinfomodel aa=new Adminpublicinfomodel();
                aa.setSubject(rs.getString(2));
                aa.setDetails(rs.getString(3));
                aa.setType(rs.getString(4));
                aa.setFile(rs.getString(5));
                am.add(aa);
            }
        }
        catch(Exception ex)
        {
            
        }
        return am;
    }
    
   public ArrayList<Campregistrationmodel> adminviewcamp()
   {
       ArrayList<Campregistrationmodel> ac=new ArrayList<>();
       try
       {
           rs=st.executeQuery("select * from camp");
           while(rs.next())
           {
               Campregistrationmodel ca=new Campregistrationmodel();
               ca.setCname(rs.getString(3));
               ca.setConame(rs.getString(4));
               ca.setPhone(rs.getString(5));
               ca.setEmail(rs.getString(6));
               ca.setPlace(rs.getString(7));
               ca.setDistrict(rs.getString(8));
               ca.setTotalp(rs.getString(9));
               ca.setLati(rs.getString(10));
               ca.setLongi(rs.getString(11));
               ac.add(ca);
           }
       }
       catch(Exception ex)
       {
           
       }
        return ac;
   }
   
   
   
   public ArrayList<Campregistrationmodel> collectorviewcamp()
   {
       ArrayList<Campregistrationmodel> ac=new ArrayList<>();
       try
       {
           rs=st.executeQuery("SELECT `camp`.* FROM `camp`,`collector` WHERE `camp`.`district`=`collector`.`district`");
           while(rs.next())
           {
               Campregistrationmodel ca=new Campregistrationmodel();
               ca.setCname(rs.getString(3));
               ca.setConame(rs.getString(4));
               ca.setPhone(rs.getString(5));
               ca.setEmail(rs.getString(6));
               ca.setPlace(rs.getString(7));
               ca.setDistrict(rs.getString(8));
               ca.setTotalp(rs.getString(9));
               ca.setLati(rs.getString(10));
               ca.setLongi(rs.getString(11));
               ac.add(ca);
           }
       }
       catch(Exception ex)
       {
           
       }
        return ac;
   }
   
   
   
   
   
   
   public ArrayList<Complaintviewmodel> complaintview()
   {
      ArrayList<Complaintviewmodel> ac=new ArrayList<>();
      
      try
      {
          rs=st.executeQuery("SELECT `complaints`.*,`users`.* FROM `complaints`,`users` WHERE `complaints`.`uid`=`users`.`lid` AND `complaints`.`status`='Forward'");
          while(rs.next())
          {
              Complaintviewmodel cm=new Complaintviewmodel();
              cm.setComid(rs.getInt(1));
              cm.setDepartment(rs.getString(3));
              cm.setComplaint(rs.getString(4));
              cm.setCdate(rs.getString(5));
              cm.setName(rs.getString(11));
              cm.setPhone(rs.getString(12));
              cm.setEmail(rs.getString(13));
              cm.setHoname(rs.getString(14));
              cm.setPost(rs.getString(15));
              cm.setCity(rs.getString(16));
              cm.setDistrict(rs.getString(17));
              cm.setPin(rs.getString(18));
              
              
              ac.add(cm);
              
          }
      }
      catch(Exception ex)
      {
          
      }
        return ac;            
   }     
   
   public ArrayList<Fundmodel> fundview()
   {
       ArrayList<Fundmodel> af=new ArrayList<>();
       try
       {
           rs=st.executeQuery("select * from fund");
           while(rs.next())
           {
               Fundmodel fm=new Fundmodel();
               fm.setName(rs.getString(2));
               fm.setAmount(rs.getString(3));
               fm.setDate(rs.getString(4));
               af.add(fm);
           }
       }
       catch(Exception ex)
       {
           
       }
        return af;
   }
   
   public String coordinatorreg(Collectorcoordinatormodel am)
   {
      String flag="0";
      try
      {
          st.executeUpdate("insert into coordinator values(null,'"+am.getLid()+"','"+am.getCname()+"','"+am.getDistrict()+"','"+am.getPhone()+"','"+am.getEmail()+"')");
          flag="1";
      }
      catch(Exception ex)
      {
          
      }
        return flag;
   }
   
   public ArrayList<Collectorcoordinatormodel> coordinatorview()
   {
       ArrayList<Collectorcoordinatormodel> ac=new ArrayList<>();
       try
       {
           rs=st.executeQuery("select * from coordinator");
           while(rs.next())
           {
               Collectorcoordinatormodel cm=new Collectorcoordinatormodel();
               cm.setCname(rs.getString(3));
               cm.setDistrict(rs.getString(4));
               cm.setPhone(rs.getString(5));
               cm.setEmail(rs.getString(6));
               cm.setCoid(rs.getInt(1));
               ac.add(cm);
           }
       }
       catch(Exception ex)
       {
           
       }
        return ac;
   }
   
  public ArrayList<Collectorcoordinatormodel> coordinatorupdate(int value)
  {
      ArrayList<Collectorcoordinatormodel> ac=new ArrayList<>();
      try
      {
          rs=st.executeQuery("select * from coordinator where coid='"+value+"'");
          while(rs.next())
          {
              Collectorcoordinatormodel ca=new Collectorcoordinatormodel();
              ca.setCoid(rs.getInt(1));
              ca.setCname(rs.getString(3));
              ca.setDistrict(rs.getString(4));
              ca.setPhone(rs.getString(5));
              ca.setEmail(rs.getString(6));
              ac.add(ca);
          }
      }
      catch(Exception ex)
      {
          
      }
        return ac;
  }
   
   public String coordinatorupdates(Collectorcoordinatormodel cm)
   {
       String flag="0";
       try
       {
           st.executeUpdate("update coordinator set c_name='"+cm.getCname()+"',district='"+cm.getDistrict()+"',phone='"+cm.getPhone()+"',email='"+cm.getEmail()+"' where coid='"+cm.getCoid()+"'");
           flag="1";
       }    
       catch(Exception ex)
       {
           
       }
        return flag;
   }
   
   public String districtnotificationadd(Districtnotificationmodel dm)
   {
       String flag="0";
       try
       {
           st.executeUpdate("insert into district_noti values(null,'"+dm.getDistrict()+"','"+dm.getSubject()+"','"+dm.getDetails()+"',now())");
           flag="1";
       }
       catch(Exception ex)
       {
           
       }
        return flag;
   }
   
    public ArrayList<Districtnotificationmodel> districtnotificationview(String lid)
    {
        ArrayList<Districtnotificationmodel> ad=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT district_noti.* FROM district_noti,collector WHERE district_noti.district=collector.district AND `collector`.`lid`='"+lid+"'");
            while(rs.next())
            {
                Districtnotificationmodel dm=new Districtnotificationmodel();
                
                dm.setSubject(rs.getString(3));
                dm.setDetails(rs.getString(4));
                dm.setDate(rs.getString(5));
                ad.add(dm);
            }
        }
        catch(Exception ex)
        {
            
        }
        return ad;
    }
    
    public ArrayList<Helpmodel> collectorhelpview()
    {
        ArrayList<Helpmodel> ah=new ArrayList<>();
        try
        {
            rs=st.executeQuery("select * from help");
            while(rs.next())
            {
                Helpmodel hp=new Helpmodel();
                hp.setHid(rs.getInt(1));
                hp.setName(rs.getString(2));
                hp.setGender(rs.getString(3));
                hp.setPhone(rs.getString(4));
                hp.setPlace(rs.getString(5));
                hp.setNopersons(rs.getString(6));
                hp.setDistrict(rs.getString(7));
                hp.setDate(rs.getString(8));
                hp.setDetails(rs.getString(9));
                hp.setLati(rs.getString(10));
                hp.setLongi(rs.getString(11));
                ah.add(hp);
            }
        }
        catch(Exception ex)
        {
            
        }
        return ah;
    }
    
    public ArrayList<Complaintviewmodel> collectorcomplaintview()
    {
        ArrayList<Complaintviewmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT `complaints`.*,`users`.* FROM `complaints`,`users` WHERE `complaints`.`uid`=`users`.`lid`");
          while(rs.next())
          {
              Complaintviewmodel cm=new Complaintviewmodel();
              cm.setComid(rs.getInt(1));
              cm.setDepartment(rs.getString(3));
              cm.setComplaint(rs.getString(4));
              cm.setCdate(rs.getString(5));
              cm.setName(rs.getString(11));
              cm.setPhone(rs.getString(12));
              cm.setEmail(rs.getString(13));
              cm.setHoname(rs.getString(14));
              cm.setPost(rs.getString(15));
              cm.setCity(rs.getString(16));
              cm.setDistrict(rs.getString(17));
              cm.setPin(rs.getString(18));
              
              
              ac.add(cm);
              
          }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    public String addvictim(Victimmodel vm)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into victim values(null,'"+vm.getCaid()+"','"+vm.getVname()+"','"+vm.getGender()+"','"+vm.getPhone()+"','"+vm.getEmail()+"','"+vm.getPlace()+"','"+vm.getPost()+"','"+vm.getCity()+"','"+vm.getDistrict()+"','"+vm.getPin()+"',now(),'Approved','"+vm.getHoname()+"')");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public String login(Loginpackage lp)
    {
        String lid="",type="",full="";
        try
        {
                  rs=st.executeQuery("select * from login where username='"+lp.getUsername()+"' and password='"+lp.getPassword()+"'");
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
    
    
    public String getdistrict(int lid)
    {
       String dis="";
       
        try
        {
                  rs=st.executeQuery("select district from collector where lid='"+lid+"'");
                  while(rs.next())
                  {
                      dis=rs.getString(1);
                      
                  }
        }
        catch(Exception ex)
        {
            
        }
        return dis;
    }
    
    public ArrayList<Victimmodel> adminviewvictim()
    {
        ArrayList<Victimmodel> av=new ArrayList<>();
        try
        {
            rs=st.executeQuery("select * from victim");
            while(rs.next())
            {
                Victimmodel vm=new Victimmodel();
                vm.setCaid(rs.getInt(2));
                vm.setVname(rs.getString(3));
                vm.setPhone(rs.getString(4));
                vm.setEmail(rs.getString(5));
                vm.setPlace(rs.getString(6));
                vm.setPost(rs.getString(7));
                vm.setCity(rs.getString(8));
                vm.setDistrict(rs.getString(9));
                vm.setPin(rs.getString(10));
                vm.setDate(rs.getString(11));
                vm.setStatus(rs.getString(12));
                vm.setHoname(rs.getString(13));
                
                av.add(vm);
                
            }
            
        }
        catch(Exception ex)
        {
            
        }
        return av;
    }
    
    public String addmaterialreq(Materialmodel mm)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into material_req values(null,'"+mm.getCaid()+"','"+mm.getMtype()+"','"+mm.getDetails()+"',now(),'Pending')");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public ArrayList<Materialmodel> campmaterialstatusview(String lid)
    {
        ArrayList<Materialmodel> am=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT * from material_req where caid='"+lid+"'");
            while(rs.next())
            {
                Materialmodel mm=new Materialmodel();
                mm.setMtype(rs.getString(3));
                mm.setDetails(rs.getString(4));
                mm.setDate(rs.getString(5));
                mm.setStatus(rs.getString(6));
                am.add(mm);
            }
        }
        catch(Exception ex)
        {
            
        }
        return am;
    }
    
    public ArrayList<Campregistrationmodel> campownview(String lid)
    {
        ArrayList<Campregistrationmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("select * from camp where lid='"+lid+"'");
            while(rs.next())
            {
                Campregistrationmodel cm=new Campregistrationmodel();
                cm.setCaid(rs.getInt(1));
                cm.setLid(rs.getInt(2));
                cm.setCname(rs.getString(3));
                cm.setConame(rs.getString(4));
                cm.setPhone(rs.getString(5));
                cm.setEmail(rs.getString(6));
                cm.setPlace(rs.getString(7));
                cm.setDistrict(rs.getString(8));
                cm.setTotalp(rs.getString(9));
                cm.setLati(rs.getString(10));
                cm.setLongi(rs.getString(11));
                cm.setStatus(rs.getString(12));
                ac.add(cm);
            }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    public ArrayList<Campregistrationmodel> campupdate(int value)
    {
       ArrayList<Campregistrationmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("select * from camp where caid='"+value+"'");
            while(rs.next())
            {
                Campregistrationmodel ca=new Campregistrationmodel();
                ca.setCaid(rs.getInt(1));
                ca.setLid(rs.getInt(2));
                ca.setCname(rs.getString(3));
                ca.setConame(rs.getString(4));
                ca.setPhone(rs.getString(5));
                ca.setEmail(rs.getString(6));
                ca.setPlace(rs.getString(7));
                ca.setDistrict(rs.getString(8));
                ca.setTotalp(rs.getString(9));
                ca.setLati(rs.getString(10));
                ca.setLongi(rs.getString(11));
                ac.add(ca);
            }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
        
    }
    
    public String campownupdates(Campregistrationmodel cm)
    {
        String flag="0";
        try
        {
            st.executeUpdate("update camp set ca_name='"+cm.getCname()+"',co_name='"+cm.getConame()+"',phone='"+cm.getPhone()+"',email='"+cm.getEmail()+"',place='"+cm.getPlace()+"',district='"+cm.getDistrict()+"',total_people='"+cm.getTotalp()+"',latitude='"+cm.getLati()+"',longitude='"+cm.getLongi()+"' where caid='"+cm.getCaid()+"'");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public String campvolunteerreq(Volunteerreqmodel vr)
    {
        String flag="0";
        try
        {
            st.executeUpdate("insert into volunteer_req values(null,'"+vr.getUcid()+"','Camp','"+vr.getArea()+"','"+vr.getDetails()+"',now(),'Pending')");
            flag="1";
            
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public ArrayList<Volunteerreqmodel> campvolunteerreqview(String lid)
    {
        ArrayList<Volunteerreqmodel> av=new ArrayList<>();
        try
        {
            rs=st.executeQuery("select * from volunteer_req where ucid='"+lid+"'");
            while(rs.next())
            {
                Volunteerreqmodel vm=new Volunteerreqmodel();
                vm.setVid(rs.getInt(1));
                vm.setUcid(rs.getInt(2));
                vm.setType(rs.getString(3));
                vm.setArea(rs.getString(4));
                vm.setDetails(rs.getString(5));
                vm.setDate(rs.getString(6));
                vm.setStatus(rs.getString(7));
                av.add(vm);
                        
            }
        }
        catch(Exception ex)
        {
            
        }
        return av;
    }
    
    public ArrayList<Campregistrationmodel> coordinatorcampview(String lid)
    {
        ArrayList<Campregistrationmodel> ac=new ArrayList<>();
        try
        {
          rs=st.executeQuery("select camp.* from camp,coordinator where camp.district=coordinator.district and coordinator.lid='"+lid+"'");
          while(rs.next())
          {
              Campregistrationmodel cr=new Campregistrationmodel();
              cr.setCaid(rs.getInt(1));
              cr.setLid(rs.getInt(2));
              cr.setCname(rs.getString(3));
              cr.setConame(rs.getString(4));
              cr.setPhone(rs.getString(5));
              cr.setEmail(rs.getString(6));
              cr.setPlace(rs.getString(7));
              cr.setDistrict(rs.getString(8));
              cr.setTotalp(rs.getString(9));
              cr.setLati(rs.getString(10));
              cr.setLongi(rs.getString(11));
              cr.setStatus(rs.getString(12));
              ac.add(cr);
          }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    public String campapprove(Campregistrationmodel cm)
    {
       String flag="0";
       try
       {
           st.executeUpdate("update camp set status='Approved' where caid='"+cm.getCaid()+"'");
           flag="1";
           
       }
       catch(Exception ex)
       {
           
       }
        return flag;
    }
    
     public String campreject(Campregistrationmodel cm)
    {
       String flag="0";
       try
       {
           st.executeUpdate("update camp set status='Rejected' where caid='"+cm.getCaid()+"'");
           flag="1";
           
       }
       catch(Exception ex)
       {
           
       }
        return flag;
    }
     
     public ArrayList<Districtnotificationmodel> districtnoticoordinatorview(String lid)
     {
         ArrayList<Districtnotificationmodel> ad=new ArrayList<>();
         try
         {
            rs=st.executeQuery("select district_noti.* from district_noti,coordinator where district_noti.district=coordinator.district and coordinator.lid='"+lid+"'");
            while(rs.next())
            {
                Districtnotificationmodel dm=new Districtnotificationmodel();
                dm.setDid(rs.getInt(1));
                dm.setDistrict(rs.getString(2));
                dm.setSubject(rs.getString(3));
                dm.setDetails(rs.getString(4));
                dm.setDate(rs.getString(5));
                ad.add(dm);
            }
         }
         catch(Exception ex)
         {
             
         }
        return ad;
     }
     
     public ArrayList<Materialreqviewmodel> coordinatormaterialreqview(String lid)
     {
         ArrayList<Materialreqviewmodel> am=new ArrayList<>();
         try
         {
             rs=st.executeQuery("SELECT `material_req`.*,camp.* FROM `material_req`,`camp`,`coordinator` WHERE `material_req`.`caid`=`camp`.`lid` AND `camp`.`district`=`coordinator`.`district`");
             while(rs.next())
             {
                 Materialreqviewmodel mm=new Materialreqviewmodel();
                 mm.setMid(rs.getInt(1));
                 mm.setCaid(rs.getInt(2));
                 mm.setMtype(rs.getString(3));
                 mm.setDetails(rs.getString(4));
                 mm.setDate(rs.getString(5));
                 mm.setStatus(rs.getString(6));
                 mm.setCa_name(rs.getString(9));
                 mm.setCo_name(rs.getString(10));
                 mm.setPhone(rs.getString(11));
                 mm.setEmail(rs.getString(12));
                 mm.setPlace(rs.getString(13));
                 
                 am.add(mm);
             }
         }
         catch(Exception ex)
         {
             
         }
        return am;
     }
     
     
     
     public ArrayList<Materialreqviewmodel> publicmaterialreqview()
     {
         ArrayList<Materialreqviewmodel> am=new ArrayList<>();
         try
         {
             rs=st.executeQuery("SELECT `material_req`.*,camp.* FROM `material_req`,`camp`,`coordinator` WHERE `material_req`.`caid`=`camp`.`lid` AND `camp`.`Status`='Approved'");
             while(rs.next())
             {
                 Materialreqviewmodel mm=new Materialreqviewmodel();
                 mm.setMid(rs.getInt(1));
                 mm.setCaid(rs.getInt(2));
                 mm.setMtype(rs.getString(3));
                 mm.setDetails(rs.getString(4));
                 mm.setDate(rs.getString(5));
                 mm.setStatus(rs.getString(6));
                 mm.setCa_name(rs.getString(9));
                 mm.setCo_name(rs.getString(10));
                 mm.setPhone(rs.getString(11));
                 mm.setEmail(rs.getString(12));
                 mm.setPlace(rs.getString(13));
                 mm.setDistrict(rs.getString(14));
                 mm.setTotalp(rs.getString(15));
                 mm.setLati(rs.getString(16));
                 mm.setLongi(rs.getString(17));
                 am.add(mm);
             }
         }
         catch(Exception ex)
         {
             
         }
        return am;
     }
     
     
     
     public String materialreqapprove(Materialmodel mm)
     {
         String flag="0";
         try
         {
             st.executeUpdate("update material_req set status='Approved' where mid='"+mm.getMid()+"'");
             flag="1";
         }
         catch(Exception ex)
         {
             
         }
        return flag;
     }
     
     public String materialreqreject(Materialmodel mm)
     {
         String flag="0";
         try
         {
             st.executeUpdate("update material_req set status='Rejected' where mid='"+mm.getMid()+"'");
             flag="1";
         }
         catch(Exception ex)
         {
             
         }
        return flag;
     }
     
     public ArrayList<Victimmodel> coordinatorvictimview()
     {
         ArrayList<Victimmodel> av=new ArrayList<>();
         try
         {
             rs=st.executeQuery("SELECT DISTINCT `victim`.*,`users`.* FROM `victim`,`users`,`coordinator` WHERE `victim`.`district`=`coordinator`.`district` AND `victim`.`caid`=`users`.`lid`");
             while(rs.next())
             {
                 Victimmodel vm=new Victimmodel();
                 vm.setVcid(rs.getInt(1));
                 vm.setCaid(rs.getInt(2));
                 vm.setVname(rs.getString(3));
                 vm.setGender(rs.getString(4));
                 vm.setPhone(rs.getString(5));
                 vm.setEmail(rs.getString(6));
                 vm.setPlace(rs.getString(7));
                 vm.setPost(rs.getString(8));
                 vm.setCity(rs.getString(9));
                 vm.setDistrict(rs.getString(10));
                 vm.setPin(rs.getString(11));
                 vm.setDate(rs.getString(12));
                 vm.setStatus(rs.getString(13));
                 vm.setHoname(rs.getString(14));
                 av.add(vm);
             }
         }
         catch(Exception ex)
         {
             
         }
        return av;
     }
     
     public String victimapprove(Victimmodel vm)
     {
         String flag="0";
         try
         {
           st.executeUpdate("update victim set status='Approved' where vcid='"+vm.getVcid()+"'");
           flag="1";
         }
         catch(Exception ex)
         {
             
         }
        return flag;
     }
     
     public String victimreject(Victimmodel vm)
     {
         String flag="0";
         try
         {
           st.executeUpdate("update victim set status='Rejected' where vcid='"+vm.getVcid()+"'");
           flag="1";
         }
         catch(Exception ex)
         {
             
         }
        return flag;
     }
     
     public ArrayList<Volunteerreqviewmodel> coordinatorvolunteerreqview()
     {
         ArrayList<Volunteerreqviewmodel> av=new ArrayList<>();
         try
         {
             rs=st.executeQuery("SELECT DISTINCT `volunteer_req`.*,`camp`.* FROM `volunteer_req`,`camp`,`coordinator` WHERE `volunteer_req`.`ucid`=`camp`.`lid` AND `coordinator`.`district`=`camp`.`district`");
             while(rs.next())
             {
                 Volunteerreqviewmodel vm=new Volunteerreqviewmodel();
                 vm.setVid(rs.getInt(1));
                 vm.setUcid(rs.getInt(2));
                 vm.setArea_vo(rs.getString(4));
                 vm.setDetails(rs.getString(5));
                 vm.setDate(rs.getString(6));
                 vm.setStatus(rs.getString(7));
                 vm.setCa_name(rs.getString(10));
                 vm.setCo_name(rs.getString(11));
                 vm.setPhone(rs.getString(12));
                 vm.setEmail(rs.getString(13));
                 vm.setPlace(rs.getString(14));
                 vm.setDistrict(rs.getString(15));
                 vm.setTotal_p(rs.getString(16));
                 vm.setLatitude(rs.getString(17));
                 vm.setLongitude(rs.getString(18));
                 av.add(vm);
             }
         }
         catch(Exception ex)
         {
             
         }
        return av;
     }
     
     public ArrayList<Volunteerreqviewmodel> coordinatoruservolunteerreqview()
     {
         ArrayList<Volunteerreqviewmodel> av=new ArrayList<>();
         try
         {
             rs=st.executeQuery("SELECT DISTINCT `volunteer_req`.*,`users`.* FROM `volunteer_req`,`users`,`coordinator` WHERE `volunteer_req`.`ucid`=`users`.`lid` AND `coordinator`.`district`=`users`.`district`");
             while(rs.next())
             {
                 Volunteerreqviewmodel vm=new Volunteerreqviewmodel();
                 vm.setVid(rs.getInt(1));
                 vm.setUcid(rs.getInt(2));
                 vm.setArea_vo(rs.getString(4));
                 vm.setDetails(rs.getString(5));
                 vm.setDate(rs.getString(6));
                 vm.setStatus(rs.getString(7));
                 vm.setName(rs.getString(10));
                 vm.setPhone(rs.getString(12));
                 vm.setEmail(rs.getString(13));
                 vm.setHo_name(rs.getString(14));
                 vm.setPost(rs.getString(15));
                 vm.setCity(rs.getString(16));
                 vm.setDistrict(rs.getString(17));
                 vm.setPin(rs.getString(18));
                 av.add(vm);
             }
         }
         catch(Exception ex)
         {
             
         }
        return av;
     }
     
     
     
     
     public String volunteerrqapprove(Volunteerreqmodel vm)
     {
         String flag="0";
         try
         {
             st.executeUpdate("update volunteer_req set status='Approved' where vid='"+vm.getVid()+"'");
             flag="1";
         }
         catch(Exception ex)
         {
             
           }
        return flag;
    }
     
      public String volunteerrqreject(Volunteerreqmodel vm)
     {
         String flag="0";
         try
         {
             st.executeUpdate("update volunteer_req set status='Rejected' where vid='"+vm.getVid()+"'");
             flag="1";
         }
         catch(Exception ex)
         {
             
           }
        return flag;
    }
      
      public ArrayList<Volunteermodel> coordinatorvolunteerview()
      {
          ArrayList<Volunteermodel> av=new ArrayList<>();
          try
          {
              rs=st.executeQuery("select * from volunteer");
              while(rs.next())
              {
                  Volunteermodel vm=new Volunteermodel();
                  vm.setVrid(rs.getInt(1));
                  vm.setLid(rs.getInt(2));
                  vm.setV_name(rs.getString(3));
                  vm.setGender(rs.getString(4));
                  vm.setPhone(rs.getString(5));
                  vm.setEmail(rs.getString(6));
                  vm.setHoname(rs.getString(7));
                  vm.setPost(rs.getString(8));
                  vm.setCity(rs.getString(9));
                  vm.setDistrict(rs.getString(10));
                  vm.setState(rs.getString(11));
                  vm.setPin(rs.getString(12));
                  vm.setOrg(rs.getString(13));
                  vm.setArea(rs.getString(14));
                  av.add(vm);
              }   
          }
          catch(Exception ex)
          {
              
          }
        return av;
      }
      
   public ArrayList<Disasterviewmodel> disasterview()
   {
      ArrayList<Disasterviewmodel> ad=new ArrayList<>();
      try
      {
          rs=st.executeQuery("SELECT DISTINCT `disaster`.*,`users`.* FROM `disaster`,`users`,`rescue_team` WHERE `disaster`.`district`=`rescue_team`.`district` AND `disaster`.`uid`=`users`.`lid`");
          while(rs.next())
          {
              Disasterviewmodel dm=new Disasterviewmodel();
              dm.setDsid(rs.getInt(1));
              dm.setUid(rs.getInt(2));
              dm.setType(rs.getString(3));
              dm.setDetails(rs.getString(4));
              dm.setFile(rs.getString(5));
              dm.setDate(rs.getString(6));
              dm.setPlace(rs.getString(7));
              dm.setDistrict(rs.getString(8));
              dm.setName(rs.getString(11));
              dm.setPhone(rs.getString(13));
              dm.setHoname(rs.getString(15));
              dm.setPost(rs.getString(16));
              dm.setCity(rs.getString(17));
              dm.setPin(rs.getString(19));
              ad.add(dm);
          }
      }
      catch(Exception ex)
      {
          
      }
        return ad;
      
   }
    
    public String complaintreply(Complaintmodel cm)
    {
        String flag="0";
        try
        {
            st.executeUpdate("update complaints set reply='"+cm.getReply()+"',rdate=now() where comid='"+cm.getComid()+"'");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public ArrayList<Certificatefunduser> cerificatefundview()
    {
       ArrayList<Certificatefunduser> ac=new ArrayList<>();
       try
       {
           rs=st.executeQuery("SELECT `certificate_fund`.*,`users`.* FROM `certificate_fund`,`users` WHERE `certificate_fund`.`uid`=`users`.`lid`");
           while(rs.next())
           {
               Certificatefunduser cu=new Certificatefunduser();
               cu.setCfid(rs.getInt(1));
               cu.setType(rs.getString(3));
               cu.setDetails(rs.getString(4));
               cu.setFile(rs.getString(5));
               cu.setDate(rs.getString(6));
               cu.setStatus(rs.getString(7));
               cu.setName(rs.getString(12));
               cu.setPhone(rs.getString(13));
               cu.setEmail(rs.getString(14));
               cu.setHoname(rs.getString(15));
               cu.setPost(rs.getString(16));
               cu.setCity(rs.getString(17));
               cu.setDistrict(rs.getString(18));
               cu.setPin(rs.getString(19));
               
               ac.add(cu);
           }
       }
       catch(Exception ex)
       {
           
       }
        return ac;
    }
    
    public String certificatefundapprove(Certificatefunduser cu)
    {
        String flag="0";
        try
        {
            st.executeUpdate("update certificate_fund set status='Approved' where cfid='"+cu.getCfid()+"'");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    public String certificatefundreject(Certificatefunduser cu)
    {
        String flag="0";
        try
        {
            st.executeUpdate("update certificate_fund set status='Rejected' where cfid='"+cu.getCfid()+"'");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    
    public ArrayList<Campregistrationmodel> camp_views(Campregistrationmodel cm)
    {
        ArrayList<Campregistrationmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("select * from camp where district='"+cm.getDistrict()+"'");
            while(rs.next())
            {
                Campregistrationmodel ca=new Campregistrationmodel();
                ca.setCname(rs.getString(3));
                ca.setLid(rs.getInt(2));
                ac.add(ca);
            }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    
    
    
    public ArrayList<Campregistrationmodel> coordinatorcamp_views()
    {
        ArrayList<Campregistrationmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT DISTINCT `camp`.* FROM `camp`,`coordinator` WHERE `camp`.`district`=`coordinator`.`district`");
            while(rs.next())
            {
                Campregistrationmodel ca=new Campregistrationmodel();
                ca.setCname(rs.getString(3));
                ca.setLid(rs.getInt(2));
                ac.add(ca);
            }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    
    
    public ArrayList<Campregistrationmodel> collectorcamp_views()
    {
        ArrayList<Campregistrationmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT DISTINCT `camp`.* FROM `camp`,`collector` WHERE `camp`.`district`=`collector`.`district`");
            while(rs.next())
            {
                Campregistrationmodel ca=new Campregistrationmodel();
                ca.setCname(rs.getString(3));
                ca.setLid(rs.getInt(2));
                ac.add(ca);
            }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    
    
    
 
    
    public ArrayList< Victimmodel> victim_view(String cmp)
    {
        ArrayList< Victimmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT * FROM `victim` WHERE status='Approved' and caid='"+cmp+"'");
            while(rs.next())
            {
                Victimmodel vm=new Victimmodel();
                vm.setCaid(rs.getInt(2));
                vm.setVname(rs.getString(3));
                vm.setGender(rs.getString(4));
                vm.setPhone(rs.getString(5));
                vm.setEmail(rs.getString(6));
                vm.setPlace(rs.getString(7));
                vm.setPost(rs.getString(8));
                vm.setCity(rs.getString(9));
                vm.setDistrict(rs.getString(10));
                vm.setPin(rs.getString(11));
                vm.setDate(rs.getString(12));
                vm.setStatus(rs.getString(13));
                vm.setHoname(rs.getString(14));
                ac.add(vm);
                
            }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    
    
    
    
     public ArrayList< Victimmodel> coordinatorcampvictim_view(String cmp)
    {
        ArrayList< Victimmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT DISTINCT `victim`.* FROM `victim`,`coordinator` WHERE `victim`.`district`=`coordinator`.`district` AND `victim`.`caid`='"+cmp+"'");
            while(rs.next())
            {
                Victimmodel vm=new Victimmodel();
                vm.setCaid(rs.getInt(2));
                vm.setVname(rs.getString(3));
                vm.setGender(rs.getString(4));
                vm.setPhone(rs.getString(5));
                vm.setEmail(rs.getString(6));
                vm.setPlace(rs.getString(7));
                vm.setPost(rs.getString(8));
                vm.setCity(rs.getString(9));
                vm.setDistrict(rs.getString(10));
                vm.setPin(rs.getString(11));
                vm.setDate(rs.getString(12));
                vm.setStatus(rs.getString(13));
                vm.setHoname(rs.getString(14));
                ac.add(vm);
                
            }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    
    
    
      public ArrayList< Victimmodel> collectorcampvictim_view(String cmp)
    {
        ArrayList< Victimmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT DISTINCT `victim`.* FROM `victim`,`collector` WHERE `victim`.`district`=`collector`.`district` AND `victim`.`caid`='"+cmp+"'");
            while(rs.next())
            {
                Victimmodel vm=new Victimmodel();
                vm.setCaid(rs.getInt(2));
                vm.setVname(rs.getString(3));
                vm.setGender(rs.getString(4));
                vm.setPhone(rs.getString(5));
                vm.setEmail(rs.getString(6));
                vm.setPlace(rs.getString(7));
                vm.setPost(rs.getString(8));
                vm.setCity(rs.getString(9));
                vm.setDistrict(rs.getString(10));
                vm.setPin(rs.getString(11));
                vm.setDate(rs.getString(12));
                vm.setStatus(rs.getString(13));
                vm.setHoname(rs.getString(14));
                ac.add(vm);
                
            }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    
    
    
    public ArrayList< Victimmodel> uservictim_view()
    {
        ArrayList< Victimmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT `victim`.*,`users`.* FROM `victim`,`users` WHERE `users`.lid=`victim`.caid AND STATUS='Approved'");
            while(rs.next())
            {
                Victimmodel vm=new Victimmodel();
                vm.setCaid(rs.getInt(2));
                vm.setVname(rs.getString(3));
                vm.setGender(rs.getString(4));
                vm.setPhone(rs.getString(5));
                vm.setEmail(rs.getString(6));
                vm.setPlace(rs.getString(7));
                vm.setPost(rs.getString(8));
                vm.setCity(rs.getString(9));
                vm.setDistrict(rs.getString(10));
                vm.setPin(rs.getString(11));
                vm.setDate(rs.getString(12));
                vm.setStatus(rs.getString(13));
                vm.setHoname(rs.getString(14));
                ac.add(vm);
                
            }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    
    
    
    public ArrayList< Victimmodel> coordinatoruservictim_view()
    {
        ArrayList< Victimmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT DISTINCT `victim`.*,`users`.* FROM `victim`,`users`,`coordinator` WHERE `users`.lid=`victim`.caid AND `victim`.`district`=`coordinator`.`district`");
            while(rs.next())
            {
                Victimmodel vm=new Victimmodel();
                vm.setVcid(rs.getInt(1));
                vm.setCaid(rs.getInt(2));
                vm.setVname(rs.getString(3));
                vm.setGender(rs.getString(4));
                vm.setPhone(rs.getString(5));
                vm.setEmail(rs.getString(6));
                vm.setPlace(rs.getString(7));
                vm.setPost(rs.getString(8));
                vm.setCity(rs.getString(9));
                vm.setDistrict(rs.getString(10));
                vm.setPin(rs.getString(11));
                vm.setDate(rs.getString(12));
                vm.setStatus(rs.getString(13));
                vm.setHoname(rs.getString(14));
                ac.add(vm);
                
            }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    
    
    
    
    public ArrayList< Victimmodel> collectoruservictim_view()
    {
        ArrayList< Victimmodel> ac=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT DISTINCT `victim`.*,`users`.* FROM `victim`,`users`,`collector` WHERE `users`.lid=`victim`.caid AND `victim`.`district`=`collector`.`district`");
            while(rs.next())
            {
                Victimmodel vm=new Victimmodel();
                vm.setCaid(rs.getInt(2));
                vm.setVname(rs.getString(3));
                vm.setGender(rs.getString(4));
                vm.setPhone(rs.getString(5));
                vm.setEmail(rs.getString(6));
                vm.setPlace(rs.getString(7));
                vm.setPost(rs.getString(8));
                vm.setCity(rs.getString(9));
                vm.setDistrict(rs.getString(10));
                vm.setPin(rs.getString(11));
                vm.setDate(rs.getString(12));
                vm.setStatus(rs.getString(13));
                vm.setHoname(rs.getString(14));
                ac.add(vm);
                
            }
        }
        catch(Exception ex)
        {
            
        }
        return ac;
    }
    
    
    
    
    public ArrayList<Certificatefunduser> admincerificatefundview()
    {
       ArrayList<Certificatefunduser> ac=new ArrayList<>();
       try
       {
           rs=st.executeQuery("SELECT certificate_fund.*,users.* FROM certificate_fund,users WHERE certificate_fund.uid=users.lid AND certificate_fund.status='Approved'");
           while(rs.next())
           {
               Certificatefunduser cu=new Certificatefunduser();
               cu.setCfid(rs.getInt(1));
               cu.setType(rs.getString(3));
               cu.setDetails(rs.getString(4));
               cu.setFile(rs.getString(5));
               cu.setDate(rs.getString(6));
               cu.setStatus(rs.getString(7));
               cu.setName(rs.getString(12));
               cu.setGender(rs.getString(13));
               cu.setPhone(rs.getString(14));
               cu.setEmail(rs.getString(15));
               cu.setHoname(rs.getString(16));
               cu.setPost(rs.getString(17));
               cu.setCity(rs.getString(18));
               cu.setDistrict(rs.getString(19));
               cu.setPin(rs.getString(20));
               
               ac.add(cu);
           }
       }
       catch(Exception ex)
       {
           
       }
        return ac;

    }
    
    
    
    
    
    
    
    
    
    public String certificatefundreply(Certificatefundmodel cm)
    {
        String flag="0";
        try
        {
            st.executeUpdate("update certificate_fund set reply='"+cm.getReply()+"',rdate=now() where cfid='"+cm.getCfid()+"'");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public String complainforward(Complaintmodel am)
    {
        String flag="0";
        try
        {
            st.executeUpdate("update complaints set status='Forward' where comid='"+am.getComid()+"'");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public String complainreject(Complaintmodel am)
    {
        String flag="0";
        try
        {
            st.executeUpdate("update complaints set status='Rejected' where comid='"+am.getComid()+"'");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    public String helpreply(Helpmodel hm)
    {
        String flag="0";
        try
        {
            st.executeUpdate("update help set reply='"+hm.getStatus()+"',rdate=now() where hid='"+hm.getHid()+"'");
            flag="1";
        }
        catch(Exception ex)
        {
            
        }
        return flag;
    }
    
    
    public ArrayList<Districtnotificationmodel> campdisnotiview(String lid)
    {
        ArrayList<Districtnotificationmodel> ad=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT district_noti.* FROM district_noti,camp WHERE district_noti.district=camp.district AND `camp`.`lid`='"+lid+"'");
            while(rs.next())
            {
                Districtnotificationmodel dm=new Districtnotificationmodel();
                
                dm.setSubject(rs.getString(3));
                dm.setDetails(rs.getString(4));
                dm.setDate(rs.getString(5));
                ad.add(dm);
            }
        }
        catch(Exception ex)
        {
            
        }
        return ad;
    }
    
     public ArrayList<Districtnotificationmodel> rescuedisnotiview(String lid)
    {
        ArrayList<Districtnotificationmodel> ad=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT district_noti.* FROM district_noti,rescue_team WHERE district_noti.district=rescue_team.district AND `rescue_team`.`lid`='"+lid+"'");
            while(rs.next())
            {
                Districtnotificationmodel dm=new Districtnotificationmodel();
                
                dm.setSubject(rs.getString(3));
                dm.setDetails(rs.getString(4));
                dm.setDate(rs.getString(5));
                ad.add(dm);
            }
        }
        catch(Exception ex)
        {
            
        }
        return ad;
    }
     
     public ArrayList<Districtnotificationmodel> districtnotificationcmnview()
    {
        ArrayList<Districtnotificationmodel> ad=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT * from district_noti");
            while(rs.next())
            {
                Districtnotificationmodel dm=new Districtnotificationmodel();
                dm.setDistrict(rs.getString(2));
                dm.setSubject(rs.getString(3));
                dm.setDetails(rs.getString(4));
                dm.setDate(rs.getString(5));
                ad.add(dm);
            }
        }
        catch(Exception ex)
        {
            
        }
        return ad;
    }
     
     
     
     
     public ArrayList<Districtnotificationmodel> coordinatordisnotificationview()
    {
        ArrayList<Districtnotificationmodel> ad=new ArrayList<>();
        try
        {
            rs=st.executeQuery("SELECT `district_noti`.* FROM `district_noti`,`coordinator` WHERE `district_noti`.`district`=`coordinator`.`district`");
            while(rs.next())
            {
                Districtnotificationmodel dm=new Districtnotificationmodel();
                
                dm.setSubject(rs.getString(3));
                dm.setDetails(rs.getString(4));
                dm.setDate(rs.getString(5));
                ad.add(dm);
            }
        }
        catch(Exception ex)
        {
            
        }
        return ad;
    }
     
     
     
     
     
     public String donatefunds(Fundmodel fd)
     {
         String flag="0";
         try
         {
             st.executeUpdate("insert into fund values(null,'"+fd.getName()+"','"+fd.getAmount()+"',now())");
             flag="1";
         }
         catch(Exception ex)
         {
             
         }
        return flag;
     }
     
     public String helprequest(Helpmodel hm,String ips)
     {
         String flag="0";
         try
         {
             st.executeUpdate("insert into help(hid,name,gender,phone,place,no_persons,district,date,details,latitude,longitude,imei)values(null,'"+hm.getName()+"','"+hm.getGender()+"','"+hm.getPhone()+"','"+hm.getPlace()+"','"+hm.getNopersons()+"','"+hm.getDistrict()+"',now(),'"+hm.getDetails()+"','"+hm.getLati()+"','"+hm.getLongi()+"','"+ips+"')");
             flag="1";
         }
         catch(Exception ex)
         {
             
         }
        return flag;
     }
     
     public ArrayList<Helpmodel> webhelpstatus(String ips)
     {
         ArrayList<Helpmodel> ah=new ArrayList<>();
         try
         {
             rs=st.executeQuery("select * from help where imei='"+ips+"'");
             while(rs.next())
             {
                 Helpmodel hm=new Helpmodel();
                 hm.setHid(rs.getInt(1));
                 hm.setReply(rs.getString(12));
                 hm.setRdate(rs.getString(13));
                 ah.add(hm);
             }
         }
         catch(Exception ex)
         {
             
         }
        return ah;
     }
     
     public ArrayList<Disasterviewmodel> publicdisasterview()
     {
         ArrayList<Disasterviewmodel> ad=new ArrayList<>();
         try
         {
             rs=st.executeQuery("SELECT `disaster`.*,`users`.* FROM `disaster`,`users` WHERE `disaster`.`uid`=`users`.`lid`");
             while(rs.next())
             {
                 Disasterviewmodel dm=new Disasterviewmodel();
                 dm.setDsid(rs.getInt(1));
                 dm.setUid(rs.getInt(2));
                 dm.setType(rs.getString(3));
                 dm.setDetails(rs.getString(4));
                 dm.setFile(rs.getString(5));
                 dm.setDate(rs.getString(6));
                 dm.setPlace(rs.getString(7));
                 dm.setDistrict(rs.getString(8));
                 dm.setName(rs.getString(11));
                 dm.setPhone(rs.getString(13));
                 dm.setHoname(rs.getString(15));
                 dm.setPost(rs.getString(16));
                 dm.setCity(rs.getString(17));
                 dm.setPin(rs.getString(19));
                 ad.add(dm);
                 
             }
         }
         catch(Exception ex)
         {
             
         }
        return ad;
     }
     public ResultSet checkcamp(String lid)
     {
         try
         {
             rs=st.executeQuery("SELECT * FROM camp WHERE `lid`='"+lid+"'");
         }
         catch(Exception e)
         {
             
         }
        return rs;
     }
             
}