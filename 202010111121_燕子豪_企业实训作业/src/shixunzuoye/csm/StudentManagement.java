package shixunzuoye.csm;

import shixunzuoye.sc.Course;
import shixunzuoye.sc.Student;

import java.util.*;

/**
 * 定义一个集合管理类，可以完成一下功能的数据管理 管理类操作List集合数据, 1)初始化功能，向List集合中添加若干学生信息。(5 分) 2)查询功能， 根据学号获得学员的相关信息(5 分)
 * 3)统计功能， 根据学号或姓名获得该学生的学分和。(15 分) 4)查询功能，根据班级编号，获取该班级的所有学员数据(5 分) 5)查询功能，
 * 根据课程编号获取选修了该课程的所有学员信息。(10分) 6)统计功能，根据课程编号和班级，获取该班级选修了该课程的学员信息，并按学号从大到小排序(15 分)
 * 7)统计功能，根据专业名称，统计该专业的人数。(5 分) 8)统计功能，根据 课程编号和班级，统计该班级该门课程的及格率。(15 分)
 */
public class StudentManagement {

  private List<Student> studentManagement_1;

  public StudentManagement(List<Student> studentManagement) {
    this.studentManagement_1 = studentManagement;
    Init();
  }

  public StudentManagement() {}

  public void Init() {
    Map<Integer, Integer> courseCollection_1 = new HashMap<>();
    courseCollection_1.put(1, 80);
    courseCollection_1.put(3, 85);
    courseCollection_1.put(4, 77);
    courseCollection_1.put(5, 95);
    Student s1 = new Student("202010111101", "yzh", "软件工程", 1, courseCollection_1);

    Map<Integer, Integer> courseCollection_2 = new HashMap<>();
    courseCollection_2.put(2, 95);
    courseCollection_2.put(3, 85);
    courseCollection_2.put(4, 88);
    courseCollection_2.put(5, 90);
    Student s2 = new Student("202010111102", "ljx", "软件工程", 1, courseCollection_2);

    Map<Integer, Integer> courseCollection_3 = new HashMap<>();
    courseCollection_3.put(1, 78);
    courseCollection_3.put(2, 54);
    courseCollection_3.put(4, 70);
    courseCollection_3.put(5, 40);
    Student s3 = new Student("202010111103", "cy", "软件工程", 2, courseCollection_3);

    Map<Integer, Integer> courseCollection_4 = new HashMap<>();
    courseCollection_4.put(1, 78);
    courseCollection_4.put(2, 59);
    courseCollection_4.put(5, 75);
    courseCollection_4.put(6, 70);
    Student s4 = new Student("202010111104", "zs", "软件工程", 1, courseCollection_4);

    Map<Integer, Integer> courseCollection_5 = new HashMap<>();
    courseCollection_5.put(1, 48);
    courseCollection_5.put(5, 75);
    courseCollection_5.put(6, 70);
    courseCollection_5.put(3, 59);
    Student s5 = new Student("202010111105", "ls", "网络工程", 2, courseCollection_5);

    studentManagement_1.add(s1);
    studentManagement_1.add(s2);
    studentManagement_1.add(s3);
    studentManagement_1.add(s4);
    studentManagement_1.add(s5);
  }
  // 查询功能， 根据学号获得学员的相关信息
  public void find_1(List<Student> studentManagement_1, String id) {
    for (int i = 0; i < studentManagement_1.size(); i++) {
      if (id.equals(studentManagement_1.get(i).getStudentID())) {
        System.out.println(studentManagement_1.get(i));
      }
    }
  }
  // 统计功能，根据学号获得该学生的学分和
  public Double find_2(List<Student> studentManagement_1, String id) {
    Double sum = 0.0;
    Map<Integer, Course> courseManagement_1 = new HashMap<>();
    CourseManagement cm = new CourseManagement(courseManagement_1);

    for (int i = 0; i < studentManagement_1.size(); i++) {
      if (id.equals(studentManagement_1.get(i).getStudentID())) {
        Set<Integer> key = studentManagement_1.get(i).getCourseCollection().keySet();
        for (Integer k : key) {
          if (cm.getCourseManagement_1().get(k).getCourseNo().equals(k)) {
            System.out.println(
                "学课编号为"
                    + cm.getCourseManagement_1().get(k).getCourseNo()
                    + "该课程的学分为："
                    + cm.getCourseManagement_1().get(k).getCourseCredit());
            sum += cm.getCourseManagement_1().get(k).getCourseCredit();
          }
        }
      }
    }
    return sum;
  }

  // 查询功能，根据班级编号,获取该班级的所有学员数据
  public void find_3(List<Student> studentManagement_1, int studentClass) {
    Iterator<Student> it = studentManagement_1.iterator();
    while (it.hasNext()) {
      Student st = it.next();
      if (st.getStudentClass() == studentClass) {
        System.out.println(st);
      }
    }
  }

  // 查询功能，根据课程编号获取选修了该课程的所有学员信息
  public void find_4(List<Student> studentManagement_1, Integer course) {
    for (Student s : studentManagement_1) {
      Set<Integer> t = s.getCourseCollection().keySet();
      for (Integer i : t) {
        if (course.equals(i)) {
          System.out.println(s);
          break;
        }
      }
    }
  }

  // 统计功能，根据课程编号和班级，获取该班级选修了该课程的学员信息，并按学号从大到小排序
  public void find_5(List<Student> studentManagement_1, Integer courseNo, int studentClassNo) {
    for (Student s : studentManagement_1) {
      if (s.getStudentClass() == studentClassNo) {
        Set<Integer> t = s.getCourseCollection().keySet();
        for (Integer i : t) {
          if (courseNo.equals(i)) {
            System.out.println(s);
            break;
          }
        }
      }
    }
  }

  // 统计功能，根据专业名称，统计该专业的人数
  public int find_6(List<Student> studentManagement_1, String major) {
    int num = 0;
    for (Student s : studentManagement_1) {
      if (s.getMajor().equals(major)) {
        num++;
      }
    }
    return num;
  }

  // 统计功能，根据课程编号和班级， 统计该班级该门课程的及格率
  public void find_7(List<Student> studentManagement_1, Integer courseNo, int studentClassNo) {
    double pass = 0.0;
    double sum = 0.0, n = 0.0;
    for (Student s : studentManagement_1) {
      if (s.getStudentClass() == studentClassNo) {
        sum++;
        Set<Integer> t = s.getCourseCollection().keySet();
        for (Integer i : t) {
          if (courseNo.equals(i) && s.getCourseCollection().get(i) >= 60) {
            n++;
            break;
          }
        }
      }
    }
    pass = n / sum;
    System.out.print("该班级该课程及格人数为：");
    System.out.println(n);
    System.out.print("该班级该课程总人数为：");
    System.out.println(sum);
    System.out.print("该课程的及格率为:");
    System.out.println(pass);
  }
}
