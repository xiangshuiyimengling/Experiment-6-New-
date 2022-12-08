package Testing;

import Xuanke.*;

import java.io.*;

public class XuankeSystem implements Serializable{
    public static void main(String[] args) throws IOException{
        Course gdsx=new Course("001","高等数学","教101","周一8：00——9：40");
        Course xxds=new Course("002","线性代数","教102","周二8：00——9：40");
        Course java=new Course("003","Java","教201","周三1：30——3：10");
        Course cyy=new Course("004","C语言","教202","周四1：30——3：10");
        Course dxwl=new Course("005","大学物理","教203","周五8：00——9：40");
        Course tiyu=new Course("006","体育","体育馆","周五10：00——11：40");

        Teacher wang=new Teacher("0001","王老师",'男', new Course[]{gdsx,xxds});
        Teacher zhang=new Teacher("0002","张老师",'男',new Course[]{java,cyy});
        Teacher li=new Teacher("0003","李老师",'女',new Course[]{dxwl});
        Teacher shi=new Teacher("004","石老师",'男',new Course[]{tiyu});

        gdsx.setTeacher(wang);
        xxds.setTeacher(wang);
        java.setTeacher(zhang);
        cyy.setTeacher(zhang);
        dxwl.setTeacher(li);
        tiyu.setTeacher(shi);

        Course sIn1[]=new Course[]{gdsx,xxds,cyy,java,dxwl};
        Course sIn2[]=new Course[]{xxds,java,cyy,dxwl,tiyu,gdsx};
        Student sOut1=new Student();
        Student sOut2=new Student();

        Student liu=new Student("202001","刘同学",'男',sIn1,2020);
        Student zhao=new Student("202002","赵同学",'女',sIn2,2018);

        FileOutputStream in = new FileOutputStream("C:\\Users\\70757\\Desktop\\shiyanliu\\shiyan6.txt");
        ObjectOutputStream inin = new ObjectOutputStream(in);
        inin.writeObject(liu);
        inin.writeObject(zhao);

        FileInputStream out=new FileInputStream("C:\\Users\\70757\\Desktop\\shiyanliu\\shiyan6.txt");
        ObjectInputStream otot = new ObjectInputStream(out);
        try {
            sOut1= (Student)otot.readObject();
            sOut2= (Student)otot.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        sOut1.tuike(cyy);
        sOut2.tuike(java);
        sOut2.tuike(gdsx);

        System.out.println(sOut1.toString());
        for(int i = 0; i<sOut1.course.length; i++){
            System.out.println(sOut1.course[i].toString());
        }

        System.out.println("\n"+sOut2.toString());
        for(int i = 0; i<sOut2.course.length; i++){
            System.out.println(sOut2.course[i].toString());
        }
    }
}