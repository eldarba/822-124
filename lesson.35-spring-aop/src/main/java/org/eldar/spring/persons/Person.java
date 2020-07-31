package org.eldar.spring.persons;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Person {

	@Autowired
//	@Resource
	@Qualifier("name1")
	private String name;
	
	@Autowired
//	@Resource
	private int name1;
	
	@Value("Tel Aviv") // usually the value will be in a property file
	private String address;
	
	@Value("123456")
	private long x;
	
	@Value("${prop.y: 15}")
	private long y;
	
}
