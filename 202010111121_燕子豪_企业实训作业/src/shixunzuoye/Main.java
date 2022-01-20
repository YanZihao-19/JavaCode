package shixunzuoye;

import shixunzuoye.csm.CourseManagement;
import shixunzuoye.csm.StudentManagement;
import shixunzuoye.sc.Course;
import shixunzuoye.sc.Student;

import java.util.*;

/** 项目名: ${实训作业} 创建者: 燕子豪 创建时间:2022.01.16 描述: 完成了要求 */
public class Main {
  static void showMenu1() {
    System.out.println("\n1 - 查看全部课程信息(优先)");
    System.out.println("2 - 根据课程名称查看课程信息");
    System.out.println("3 - 查看所有学生信息(优先)");
    System.out.println("0 - 退出系统");
    System.out.println("请选择:");
  }

  static void showMenu2() {
    System.out.println("\n根据所有学生信息，有以下功能：");
    System.out.println("a - 根据学号查询学员的信息");
    System.out.println("b - 根据学号查询学员的总学分和");
    System.out.println("c - 根据班级编号获取该班级的学员信息");
    System.out.println("d - 根据课程编号获取选修了该课程的所有学员信息");
    System.out.println("e - 根据课程编号和班级获取该班级选修了该课程的学员信息，并按学号从大到小排序");
    System.out.println("f - 根据专业名称，统计该专业的人数");
    System.out.println("g - 根据课程编号和班级，统计该班级该广课程的及格率");
    System.out.println("z - 返回上级目录");
    System.out.println("请选择:");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Integer, Course> courseManagement = new HashMap<>();
    CourseManagement cm = new CourseManagement(courseManagement);
    List<Student> studentList = new LinkedList<>();
    StudentManagement sm = new StudentManagement(studentList);
    while (true) {
      showMenu1();
      int n1 = sc.nextInt();
      switch (n1) {
        case 0: // 退出系统
          System.out.println("欢迎再次使用！");
          System.exit(0);
          break;
        case 1: // 查看全部课程信息
          Set<Integer> s   = courseManagement.keySet();
          for (Integer i : s) {
            cm.find(courseManagement, i);
          }
          break;
        case 2: // 根据课程名称获取课程信息
          System.out.println("请输入课程名称:");
          String c = sc.next();
          cm.search(courseManagement, c);
          break;
        case 3: // 查看所有学生信息
          for (Student st : studentList) {
            System.out.println(st);
          }
          char c1 = ' ';
          while (true) {
            showMenu2();
            c1 = sc.next().charAt(0);
            switch (c1) {
              case 'a':
                System.out.print("请输入所查询学生信息的学号:");
                String xuehao = sc.next();
                sm.find_1(studentList, xuehao);
                break;
              case 'b':
                System.out.print("请输入查询总学分学生的学号:");
                String xuehao2 = sc.next();
                System.out.println("该学生总的学分为:" + sm.find_2(studentList, xuehao2));
                break;
              case 'c':
                System.out.print("请输入查询班级的编号:");
                int classN = sc.nextInt();
                System.out.println("该班级的成员有:");
                sm.find_3(studentList, classN);
                break;
              case 'd':
                System.out.print("请输入某课程的编号:");
                int courseN = sc.nextInt();
                System.out.println("选择了该课程的学员有:");
                sm.find_4(studentList, courseN);
                break;
              case 'e':
                System.out.print("请输入选修课的编号:");
                int courseN2 = sc.nextInt();
                System.out.print("请输入班级的编号:");
                int classN2 = sc.nextInt();
                System.out.println("该班级选修了该课程的学员有:");
                sm.find_5(studentList, courseN2, classN2);
                break;
              case 'f':
                System.out.print("请输入专业名称:");
                String zhuanye = sc.next();
                System.out.println("该专业共有:" + sm.find_6(studentList, zhuanye) + "个人");
                sm.find_6(studentList, zhuanye);
                break;
              case 'g':
                System.out.print("请输入课程编号:");
                int courseN3 = sc.nextInt();
                System.out.print("请输入班级的编号:");
                int classN3 = sc.nextInt();
                sm.find_7(studentList, courseN3, classN3);
                break;
              case 'z':
                break;
              default:
                System.out.println("输入有误！");
            }
            if (c1 == 'z') {
              break;
            }
          }
          break;
        default:
          System.out.println("输入有误！\n");
      }
    }
  }
}
