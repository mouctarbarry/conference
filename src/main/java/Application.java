import com.mouctar.service.SpeakerService;
import com.mouctar.service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] arg){
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstname());
    }
}
