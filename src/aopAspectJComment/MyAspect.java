package aopAspectJComment;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Before("execution(* aopAspectJComment.dao.UserDao.add(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置增强……" + joinPoint);
    }
    @After("execution(* aopAspectJComment.dao.UserDao.get(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("最终增强……" + joinPoint);
    }
    /**
     * 将 aopAspectJComment.dao包下的 UserDao 类中的 get() 方法 定义为一个切点
     */
    @Pointcut(value = "execution(* aopAspectJComment.dao.UserDao.get(..))")
    public void pointCut1() {
    	System.out.println("pointCut1有没有执行？");
    }
    /**
     * 将 aopAspectJComment.dao包下的 UserDao 类中的 delete() 方法 定义为一个切点
     */
    @Pointcut(value = "execution(* aopAspectJComment.dao.UserDao.delete(..))")
    public void pointCut2() {
    	System.out.println("pointCut2有没有执行？");
    }
    //使用切入点引用
    @Around("MyAspect.pointCut2()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕增强……1");
        proceedingJoinPoint.proceed();
        System.out.println("环绕增强……2");
    }
    //使用切入点表达式
    @AfterReturning(value = "execution(* aopAspectJComment.dao.UserDao.modify(..))", returning = "returnValue")
    public void afterReturning(Object returnValue) {
        System.out.println("后置返回增强……,方法返回值为：" + returnValue);
    }
}
