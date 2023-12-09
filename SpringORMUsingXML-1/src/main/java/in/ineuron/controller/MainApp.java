package in.ineuron.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.dto.Student;
import in.ineuron.service.IStudentService;

public class MainApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("in//ineuron//cfg//ApplicationContext.xml");
        
        IStudentService service=context.getBean(IStudentService.class);
        System.out.println(service);
        
        Student s=new Student();
       
        s.setName("kaira");
        s.setAge(23);
        s.setSaddress("nasik");
        
        int rowAffected=service.insert(s);
        
        System.out.println("ROw Affected: "+rowAffected);
        
        ((AbstractApplicationContext) context).close();
        
        
    }
}
