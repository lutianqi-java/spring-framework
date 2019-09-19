import org.springframework.context.annotation.Configuration;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: MyConfig
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/6/2520:42
 */

@Configuration

public class MyConfig {
    //@DependsOn bean的加载吮吸
//    /**
//     * Import作用主要将外部的jar包注入到springioc容器中 @Import(Win7Entity.class) 等于与@Bean
//     * Import注册的bean对象 id为当前类全路径
//     */
////    @Bean
////    @Conditional(MyCondition.class)
////    public Win7Entity win7Entity() {
////        return new Win7Entity();
////    }
//
//
//    // 为什么要使用@Import注解呢？
//    // @bean注解应用场景是什么？ 注册加载外部的jar包
//
//    // 总结一下：@Import注解与@Bean注解区别
//    // bean注解注册的 bean的id是以方法名称 @Import以当前类完整路径地址注册 相比来说@Import注入类更加简单
//    // go 都是引入外部的jar包
//    @Bean
//    public MyFactoryBean myFactoryBean() {
//        return new MyFactoryBean();
//    }
}

