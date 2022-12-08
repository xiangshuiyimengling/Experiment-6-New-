package Xuanke;

import java.io.Serializable;

public class Course implements Serializable {
    public String number;
    public String name;
    public String place;
    public String time;
    public Teacher teacher;
    public Course(String a,String b,String c,String d){
        number=a;
        name=b;
        place=c;
        time=d;
    }
    public void setTeacher(Teacher t){
        this.teacher=t;
    }
    public String toString(){
        return "课程编号:"+number+"\t课程名称:"+name+"\t上课时间:"+time+"\t上课地点:"+place+"\t教师:"+teacher.name;
    }
}