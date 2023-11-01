import com.mouctar.service.SpeakerService;
import com.mouctar.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){
        //SpeakerService service = new SpeakerServiceImpl();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = context.getBean("speakerService", SpeakerServiceImpl.class);
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
