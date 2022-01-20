package shixunzuoye.csm;

import java.util.Map;
import shixunzuoye.sc.*;

/**
 * 定义一个课程管理类，可以完成一下功能的数据管理 管理类操作Map集合数据, key为课程编号 value课程对象 1)初始化功能，向Map集合中添加若干课程信息
 * 2)根据课程编号,获取对应的课程信息 3)根据课程名称关键字，获取包含该关键字的课程对应的课程信息
 */
public class CourseManagement {

  private Map<Integer, Course> courseManagement_1;

  public CourseManagement(Map<Integer, Course> courseManagement_1) {
    this.courseManagement_1 = courseManagement_1;
    Init();
  }

  public CourseManagement() {
    Init();
  }

  public Map<Integer, Course> getCourseManagement_1() {
    return courseManagement_1;
  }

  public void setCourseManagement_1(Map<Integer, Course> courseManagement_1) {
    this.courseManagement_1 = courseManagement_1;
  }

  public void Init() {
    Course c1 = new Course(1, "数据结构", '1', 4);
    Course c2 = new Course(2, "操作系统", '0', 3.5);
    Course c3 = new Course(3, "计算机组成原理", '1', 3.5);
    Course c4 = new Course(4, "计算机网络", '0', 3);
    Course c5 = new Course(5, "高数", '1', 4);
    Course c6 = new Course(6, "体育", '0', 1);
    courseManagement_1.put(c1.getCourseNo(), c1);
    courseManagement_1.put(c2.getCourseNo(), c2);
    courseManagement_1.put(c3.getCourseNo(), c3);
    courseManagement_1.put(c4.getCourseNo(), c4);
    courseManagement_1.put(c5.getCourseNo(), c5);
    courseManagement_1.put(c6.getCourseNo(), c6);
  }

  // 根据课程编号,获取对应的课程信息
  public void find(Map<Integer, Course> courseManagement_1, Integer k) {
    System.out.println(courseManagement_1.get(k));
  }

  // 3)根据课程名称关键字，获取包含该关键字的课程对应的课程信息
  public void search(Map<Integer, Course> courseManagement_1, String name) {
    for (Map.Entry<Integer, Course> entry : courseManagement_1.entrySet()) {
      Integer mapKey = entry.getKey();
      if (courseManagement_1.get(mapKey).getCourseTitle().equals(name)) {
        System.out.println(courseManagement_1.get(mapKey));
      }
    }
  }

  @Override
  public String toString() {
    return "CourseManagement{" + "courseManagement_1=" + courseManagement_1 + '}';
  }
}
