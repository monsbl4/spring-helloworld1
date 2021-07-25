import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat catBean = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getMessage());

        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean1.getMessage());
        boolean b1 = bean == bean1;
        boolean b2 = catBean == catBean1;
        System.out.println(b1);
        System.out.println(b2);
    }
}