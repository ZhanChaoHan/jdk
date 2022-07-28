package com.jachs.annotation.processor;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;

import com.google.auto.service.AutoService;
import com.jachs.annotation.part3.CreateClass;
import com.jachs.annotation.part3.CreateFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/***
 * ProcessingEnvironment:是一个注解处理工具的集合</br>
 * Element,是一个接口，表示一个程序元素，它可以是包、类、方法或者一个变量。Element已知的子接口有：</br>
 * PackageElement:表示一个包程序元素。提供对有关包及其成员的信息的访问。 </br>
 * ExecutableElement:表示某个类或接口的方法、构造方法或初始化程序（静态或实例），包括注释类型元素。 </br>
 * TypeElement:表示一个类或接口程序元素。提供对有关类型及其成员的信息的访问。注意，枚举类型是一种类，而注解类型是一种接口。</br>
 * VariableElement:表示一个字段、enum 常量、方法或构造方法参数、局部变量或异常参数。</br>
 * 
 * @author zhanchaohan
 *
 */
//@AutoService(Processor.class)

@SupportedAnnotationTypes("com.jachs.annotation.part2.ExecuteSQL")//指定该注解处理器可以解决的类型，需要完整的包名+类命
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class CreateFileProcessor extends AbstractProcessor {
	private final static Logger log = LoggerFactory.getLogger(CreateFileProcessor.class);
	
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		log.info("ok im in CreateFileProcessor");
		for (TypeElement annotatedElement : annotations) {
				Name qualifiedName = annotatedElement.getQualifiedName();
				
				if (qualifiedName.contentEquals("com.jachs.annotation.part3.CreateFile")) {
					log.info("CreateFile");
				}
				if (qualifiedName.contentEquals("com.jachs.annotation.part3.CreateClass")) {
					log.info("CreateClass");
				}
		}

		// 返回ture表示该注解已经被处理, 后续不会再有其他处理器处理; 返回false表示仍可被其他处理器处理.
		return true;
	}


	// 集合中指定支持的注解类型的名称（这里必须时完整的包名+类名)
	@Override
	public Set<String> getSupportedAnnotationTypes() {
		Set<String> annotataions = new LinkedHashSet<String>();
		annotataions.add(CreateFile.class.getCanonicalName());
		annotataions.add(CreateClass.class.getCanonicalName());
		return annotataions;
	}

	// 指定当前正在使用的Java版本
	@Override
	public SourceVersion getSupportedSourceVersion() {
		return SourceVersion.latestSupported();
	}

	// 初始化处理器
	@Override
	public synchronized void init(ProcessingEnvironment processingEnv) {
		super.init(processingEnv);
	}
}
