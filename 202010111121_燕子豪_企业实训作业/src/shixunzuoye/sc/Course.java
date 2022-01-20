package shixunzuoye.sc;

/** 定义课程类,包括课程编号、课程名称、课程阶段、课程学分 */
public class Course {
  //课程编号
  private Integer courseNo;
  //课程名称
  private String courseTitle;
  //课程阶段
  private char coursePhase;
  //课程学分
  private double courseCredit;

  public Course() {}

  public Course(Integer courseNo, String courseTitle, char coursePhase, double courseCredit) {
    this.courseNo = courseNo;
    this.courseTitle = courseTitle;
    this.coursePhase = coursePhase;
    this.courseCredit = courseCredit;
  }

  public Integer getCourseNo() {
    return courseNo;
  }

  public void setCourseNo(int courseNo) {
    this.courseNo = courseNo;
  }

  public String getCourseTitle() {
    return courseTitle;
  }

  public void setCourseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
  }

  public char getCoursePhase() {
    return coursePhase;
  }

  public void setCoursePhase(char coursePhase) {
    this.coursePhase = coursePhase;
  }

  public double getCourseCredit() {
    return courseCredit;
  }

  public void setCourseCredit(double courseCredit) {
    this.courseCredit = courseCredit;
  }

  @Override
  public String toString() {
    return "课程信息:"
        + "课程编号="
        + courseNo
        + ", 课程名称="
        + courseTitle
        + ", 课程阶段="
        + coursePhase
        + "(1为结束，0为未结束), 课程学分="
        + courseCredit;
  }
}
