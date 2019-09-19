import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: V1Spring
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/6/2520:44
 */
public class V1Spring {
	@Test
   public void test(){

        // 1.基于注解方式实现启动
        ApplicationContext annotationApplicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

        String[] beanDefinitionNames = annotationApplicationContext.getBeanDefinitionNames();
//        for (int i = 0; i < beanDefinitionNames.length; i++) {
//            System.out.println(beanDefinitionNames[i]);
//        }
        // 1.配置文件类也注入到springioc容器中

        // 如何生成类图 ctrl+atl+u
        //ApplicationContext
        //>>>>>>AnnotationConfigApplicationContext
        //>>>>>>ClassPathXmlApplicationContext
        // ApplicationContext继承BeanFactory实现扩展的功能
//        AnnotatedGenericBeanDefinition  表示为注解方式启动注入配置类 BeanDefinitionHolder
//        new RootBeanDefinition()   表示传统往ioc容器注入的bean对象
        // new RootBeanDefinition()


    }
}
