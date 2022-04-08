package postProcess;

public class PostProcess {
	private String message;
    public void setMessage(String message) {
        this.message = message;
    }
    public void getMessage() {
        System.out.println("PostProcess Message : " + message);
    }
    public void init() {
        System.out.println("Bean PostProcess 正在初始化");
    }
    public void destroy() {
        System.out.println("Bean PostProcess 将要被销毁");
    }
}
