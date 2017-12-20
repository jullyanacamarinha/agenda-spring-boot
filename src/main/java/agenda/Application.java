package agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

//	@Bean
//	public CommandLineRunner demo(EventoService service) {
//		return (args) -> {
//			// save a couple of customers
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
//
//			service.save(
//					new Evento(sdf.parse("27/07/2006 12:15"), sdf.parse("27/07/2006 12:15"), "saires", "passeios"));
//			service.save(new Evento(sdf.parse("27/07/2006 12:15"), sdf.parse("27/07/2006 12:15"), "sair", "passeio"));
//
//		};
//	}
}
