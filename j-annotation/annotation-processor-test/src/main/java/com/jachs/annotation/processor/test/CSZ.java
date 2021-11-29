package com.jachs.annotation.processor.test;

import java.lang.annotation.Annotation;

import com.jachs.annotation.part3.CreateFile;

public class CSZ {
	@CreateFile(fileName = "a.txt", filePath = "e:\\")
	public class s{};
	
	public static void main(String[] args) {
		Annotation [] an=s.class.getAnnotations();
		
		for (Annotation annotation : an) {
			System.out.println(annotation.annotationType().getSimpleName());
		}
		
	}
}
