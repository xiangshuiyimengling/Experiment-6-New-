package Xuanke;

import java.io.Serializable;

public class Teacher extends People implements Serializable {
    public Teacher(String a,String b,char c,Course[] d){
        number=a;
        name=b;
        sex=c;
        course=d;
    }
}