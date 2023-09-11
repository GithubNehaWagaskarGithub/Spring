package com.StudentApp.StudentInfo.Service;

import com.StudentApp.StudentInfo.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Component
@Service
public class StudService
{
    @Autowired
    private StudentModel studentModel;

    List<StudentModel> studList=new ArrayList<>();
    {
        StudentModel s1=new StudentModel(101,"Nikita",12346,"Pune",50,50,50);
        StudentModel s2=new StudentModel(102,"Rahul",67890,"Bangalore",70,65,80);
        StudentModel s3=new StudentModel(103,"Ashish",24680,"Pune",55,35,89);
        StudentModel s4=new StudentModel(104,"Mohan",56778,"Mumbai",78,76,56);
        StudentModel s5=new StudentModel(105,"Jagdish",76543,"Nagpur",87,65,90);
        studList.add(s1);
        studList.add(s2);
        studList.add(s3);
        studList.add(s4);
        studList.add(s5);
    }

    public List<StudentModel> DisplayAllData()
    {
        return studList;
    }
    //--------------------------------------------------------------------------------------------

    public String addData(StudentModel s)
    {
        int rollNos=studList.get((studList.size()-1)).getRollNo();
        if(studList.add(new StudentModel(rollNos+1,"Neha",45678,"Pune",76,89,76)))
        {
            return "Data Added";
        }
        else {
            return "Data Not Added";
        }
    }
    //-------------------------------------------------------------------------------------------

    public List<StudentModel> displayMaxMarksInPerSub(String sub)
    {
        //Set<String> names=new HashSet<>();
        double temp=0.0;
        for(StudentModel s:studList)
        {
            if("javaMarks".equalsIgnoreCase(sub))
            {
                double max=0.0;
                for(int i=0;i<studList.size();i++)
                {
                    if(max<s.getJavaMarks())
                    {
                        temp=max;
                        max=s.getJavaMarks();
                    }
                }
            } else if ("sqlMarks".equalsIgnoreCase(sub))
            {
                double max=0.0;
                for(int i=0;i<studList.size();i++)
                {
                    if(max<s.getSqlMarks())
                    {
                        temp=max;
                        max=s.getSqlMarks();
                    }
                }
            }
            else if("webTechMarks".equalsIgnoreCase(sub))
            {
                double max=0.0;
                for(int i=0;i<studList.size();i++)
                {
                    if(max<s.getWebTechMarks())
                    {
                        temp=max;
                        max=s.getWebTechMarks();
                    }
                }
            }
        }
        return studList;
    }
    //-------------------------------------------------------------------------------------------------------

    public String displayPercentage(int rollNo, long contNo)
    {
        double per=0.0;
        for(StudentModel s:studList)
        {
            if(s.getRollNo()==rollNo && s.getContactNo()==contNo)
            {
                per=((s.getJavaMarks()+s.getSqlMarks()+s.getWebTechMarks())/3);
            }
        }
        if(per>0)
        {
            return "Percentage is :"+per;
        }
        else
        {
            return "Something Went Wrong";
        }
    }

    //------------------------------------------------------------------------------------------------------

    public Set<String> displayNamesStartWithAAndEndWithH(String sCh1, String sCh2)
    {
        char ch1=sCh1.charAt(0);
        char ch2=sCh2.charAt(0);
        Set<String> names=new HashSet();
        for(StudentModel s:studList)
        {
            if((s.getName().charAt(0)==ch1) && (s.getName().charAt(s.getName().length()-1)==ch2))
            {
                names.add(s.getName());
            }
        }
        return names;
    }
    //-----------------------------------------------------------------------------------------------------

    public String give10MarksExtraToThoseStudWhoHasMarksBetween35T045(String sub)
    {
        double temp = 0.0;
        for (StudentModel s : studList) {
            double extraMarks = 10.0;
            if (("javaMarks".equalsIgnoreCase(sub)) && (s.getJavaMarks() >= 35 && s.getJavaMarks() <= 45)) {

                temp = s.getJavaMarks() + extraMarks;
            } else if (("sqlMarks".equalsIgnoreCase(sub)) && (s.getSqlMarks() >= 35 && s.getSqlMarks() <= 45)) {
                //double extraMarks = 10.0;
                temp = s.getSqlMarks() + extraMarks;
            } else if (("webTechMarks".equalsIgnoreCase(sub)) && (s.getWebTechMarks() >= 35 && s.getWebTechMarks() <= 45)) {
                //double extraMarks = 10.0;
                temp = s.getWebTechMarks() + extraMarks;
            }
        }
        return "Data Updated";
    }
}
