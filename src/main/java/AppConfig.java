import com.mouctar.repository.HibernateSpeakerRepositoryImpl;
import com.mouctar.repository.SpeakerRepository;
import com.mouctar.service.SpeakerService;
import com.mouctar.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        //service.setRepository(getSpeakerRepository());
        return new SpeakerServiceImpl(getSpeakerRepository());
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
