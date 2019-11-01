//This is the root interface for accessing the Spring container.
//To access the Spring container, we will be using Spring's dependency injection functionality using this BeanFactory 
//interface and its sub-interfaces.

import org.springframework.core.io.ClassPathResource;  
import org.springframework.beans.factory.InitializingBean; 
import org.springframework.beans.factory.xml.XmlBeanFactory; 

public class HelloWorldApp{ 
   public static void main(String[] args) { 
      XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml")); 
      HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");    
      obj.getMessage();    
   }
}