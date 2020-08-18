package org.eldar.spring.aspects;

import org.aspectj.lang.annotation.Pointcut;

//import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

	// pointcut declarations are done in special declaration methods
	@Pointcut("execution(* org.eldar.spring.beans.*.*(..))")
	public void allBeansPackage() {

	}

	// pointcut declarations are done in special declaration methods
	@Pointcut("execution(* org.eldar.spring.dao.*.*(..))")
	public void allDaoPackage() {

	}

	@Pointcut("execution(* get*(..))")
	public void allGetters() {

	}

	@Pointcut("execution(* set*(..))")
	public void allSetters() {

	}

	@Pointcut("allBeansPackage() && !(allGetters() || allSetters())")
	public void allBeansPackageExcludeGetSet() {

	}

	@Pointcut("allDaoPackage() && !(allGetters() || allSetters())")
	public void allDaoPackageExcludeGetSet() {

	}

}
