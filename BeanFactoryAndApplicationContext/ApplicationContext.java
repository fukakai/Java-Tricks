//The ApplicationContext is the central interface within a Spring application that is used for providing configuration 
//information to the application.
//It implements the BeanFactory interface. 
//Hence, the ApplicationContext includes all functionality of the BeanFactory and much more! 
//Its main function is to support the creation of big business applications.

import org.springframework.core.io.ClassPathResource;  
import org.springframework.beans.factory.InitializingBean; 
import org.springframework.beans.factory.xml.XmlBeanFactory; 

public class HelloWorldApp{ 
   public static void main(String[] args) { 
      ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml"); 
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");    
      obj.getMessage();    
   }
}