package org.sid;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.sid.dao.TaskRepository;
import org.sid.dao.UserRepository;
import org.sid.entities.AppRole;
import org.sid.entities.AppUser;
import org.sid.entities.Task;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class JwtSpringSecurityApplication implements CommandLineRunner {

	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private AccountService accountService;
	@Autowired
	private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(JwtSpringSecurityApplication.class, args);
	}
	@Bean
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Stream.of("T1","T2","T3","T1","T2","T3","T1","T2","T3","T1","T2","T3","T1","T2","T3","T1","T2","T3","T1","T2","T3","T1","T2","T3","T1","T2","T3").forEach(t ->{taskRepository.save(new Task(t));});
		taskRepository.findAll().forEach(t->{System.out.println(t.getName());});
		accountService.saveRole(new AppRole("ADMIN"));
		accountService.saveRole(new AppRole("USER"));
		accountService.saveUser(new AppUser("user","user",null));
		accountService.saveUser(new AppUser("admin","admin",null));
		accountService.addRoleToUser("admin", "ADMIN");
		accountService.addRoleToUser("admin", "USER");
		accountService.addRoleToUser("user", "USER");
		accountService.findUserByUsername("admin").getRoles().forEach(i->{System.out.println(i.getRoleName());});
		
		int[] a = { 1, 2, 3, 4 };

		boolean z = IntStream.of(a).anyMatch(x -> x == 4);

		String[] q = { "d", "c", "b", "a" };
		String w = "";

		for (int i = 0; i < q.length; i++) {
			w = w + q[i];
		}

		System.out.println(w);
		System.out.println(z);
		char[] qsd;
		char[] dsq;
		String str = "HouSsem";
		String abc = "SsHouem";
		System.out.println(str);
		str = str.toLowerCase();
		qsd = str.toCharArray();
		abc = abc.toLowerCase();
		dsq = abc.toCharArray();
		Arrays.sort(dsq);
		Arrays.sort(qsd);
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		String aa = bufferRead.readLine();
		List m = new ArrayList();
		m.add("aze");
		m.add("zzz");
		m.add("zea");
		m.add(aa);
		m.forEach(System.out::println);

		System.out.println("here we go " + Arrays.equals(qsd, dsq));
		Stream.of(qsd).forEach(x -> System.out.println(x));

		for (int i = 0; i < qsd.length; i++) {
			System.out.println(qsd[i]);
		}
		String st = str.substring(0, str.length() - 1) + "m";
		System.out.println(st);
		int x = 27;
		String s = Integer.toString(x);
		x = Integer.parseInt(s.substring(s.length() - 1));
		System.out.println(x + 3);
		m.forEach(n -> {
			n = n + "zzz";
			System.out.println(n);

		});

		System.out.println(m.get(0));

		System.out.println(m.get(1));

		System.out.println("PLZ WRITE AN ARABIC LETTER :");

		String xx = bufferRead.readLine();
		qsd = xx.toCharArray();
		ArrayList<Integer> ascii = new ArrayList<Integer>();	
		*/

		
		}
}
