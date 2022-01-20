package shixunzuoye.sc;

import java.util.Map;

/** 定义学生类 包括学号、姓名、专业、班级、课程集合Map(key课程编号，value成绩) */
public class Student {
  //学号
  private String studentID;
  //姓名
  private String studentName;
  //专业
  private String major;
  //班级
  private int studentClass;
  //课程集合
  private Map<Integer, Integer> courseCollection;

  public Student(
      String studentID,
      String studentName,
      String major,
      int studentClass,
      Map<Integer, Integer> courseCollection) {
    this.studentID = studentID;
    this.studentName = studentName;
    this.major = major;
    this.studentClass = studentClass;
    this.courseCollection = courseCollection;
  }

  public Student() {}

  public String getStudentID() {
    return studentID;
  }

  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public int getStudentClass() {
    return studentClass;
  }

  public void setStudentClass(int studentClass) {
    this.studentClass = studentClass;
  }

  public Map<Integer, Integer> getCourseCollection() {
    return courseCollection;
  }

  public void setCourseCollection(Map<Integer, Integer> courseCollection) {
    this.courseCollection = courseCollection;
  }

  @Override
  public String toString() {
    return "学生信息:"
        + "学号='"
        + studentID
        + '\''
        + ", 姓名='"
        + studentName
        + '\''
        + ", 专业='"
        + major
        + '\''
        + ", 班级="
        + studentClass
        + ", 课程信息："
        + courseCollection.toString()
        + "(等号前为课程编号，等号后为对应分数)";
  }
}
