import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld FirstBean  =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(FirstBean.getMessage());
        HelloWorld SecondBean  =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(SecondBean.getMessage());

        Cat ThirdBean  =
                (Cat) applicationContext.getBean("cat");
        System.out.println(ThirdBean.getMessage());
        Cat FourthBean  =
                (Cat) applicationContext.getBean("cat");
        System.out.println(FourthBean.getMessage());

        System.out.println(FirstBean==SecondBean);
        System.out.println(ThirdBean==FourthBean);
    }
}