package hello;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Grade {
	private static final Log LOGGER = LogFactory.getLog(Grade.class);
	private int gradeId;
	private String gradeName;
    public Grade(int gradeId, String gradeName) {
        LOGGER.info("正在执行 Grade 的有参构造方法，参数分别为：gradeId=" + gradeId + ",gradeName=" + gradeName);
        this.gradeId = gradeId;
        this.gradeName = gradeName;
    }
    public Grade() {
    	LOGGER.info("正在执行 Grade 的wu参构造方法");
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
}
