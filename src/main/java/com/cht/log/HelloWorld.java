package com.cht.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld { // naming convention, coding style for java
	 public static void main(String[] args) {
		    Logger logger = LoggerFactory.getLogger(HelloWorld.class);
		    logger.info("Hello World!!");
		  }
}
//compile group: 'org.slf4j', name: 'slf4j-simple', version: '1.7.21'