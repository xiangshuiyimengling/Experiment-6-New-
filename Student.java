package Xuanke;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Student extends People implements Serializable {
    public int grade;
    public int quntity;
    public Student(){
    }
    public Student(String a,String b,char c,Course[] d,int e){
        number=a;
        name=b;
        sex=c;
        course=d;
        grade=e;
        quntity=course.length;
    }
    public String toString(){
        return "学生编号:"+number+
                "\n学生姓名:"+name+
                "\n学生性别:"+sex+
                "\n学生年级:"+grade+
                "\n所选课程门数:"+quntity;
    }
    //退课
    public void tuike(Course t) {
        for (int i = 0; i < this.course.length; i++) {
            if (Objects.equals(t.name, course[i].name)) {
                for (int j = 1; j < this.course.length - i; j++) {
                    course[i + j - 1] = course[i + j];
                }
                course = Arrays.copyOf(course, course.length - 1);
                quntity= course.length;
            }
        }
    }
}