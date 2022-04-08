package hello;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Student {
    private static final Log LOGGER = LogFactory.getLog(Student.class);
    private int id;
    private String name;
    private Grade grade;
    public Student(int id, String name, Grade grade) {
        LOGGER.info("正在执行 Student 的有参构造方法，参数分别为：id=" + id + ",name=" + name + ",grade=" + grade);
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    public Student() {
    	LOGGER.info("正在执行 Student 的wu参构造方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
}
