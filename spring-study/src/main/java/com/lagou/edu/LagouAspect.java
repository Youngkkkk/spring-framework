package com.lagou.edu;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author km_yang
 * @create 2022/3/27 21:12
 */
@Component
@Aspect
public class LagouAspect {
	@Pointcut("execution(* com.lagou.*.*(..))")
	public void pointcut(){
		System.out.println("pointcut");
	}
	@Before("pointcut()")
	public void before() {
		System.out.println("before method ......");
	}
}