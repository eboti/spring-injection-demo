package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.jpa.CustomerRepository;
import com.example.jpa.InstrumentRepository;

@SpringBootApplication
public class SpringTestApplication {

	private int next = 0;
	private int counter = 1;

	private int counter2 = 1;
	private List<Integer> original = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
	private List<Integer> reverse = new ArrayList<Integer>();

	int originalSize = original.size();

	@Autowired
	private MyBeanAsComponent myBeanAsComponent;

	@Autowired
	private List<Car> cars;

	@Autowired
	private MyBean3 myBean3;

	@Autowired
	private MyBean3 myBean3Another;

	@Autowired
	private MyBean4 myBean4;

	@Autowired
	@Qualifier("five")
	private MyBean5 myBeanXXX;

	@Autowired
	private MyService myService;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private InstrumentRepository instrumentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);

		// one way to init bean
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				MyConfiguration.class);
		MyBean2 myBean2 = ctx.getBean(MyBean2.class);
		System.out.println(myBean2);

		MyBean2 myBean2Another = ctx.getBean(MyBean2.class);
		System.out.println(myBean2Another);
		
		ctx.close();
	}

	@PostConstruct
	public void init() {
		// another way to init bean
		System.out.println(myBeanAsComponent);
		// 3rd way to init bean
		System.out.println(myBean3);

		// different instance from myBean3 object
		System.out.println(myBean3Another);

		// consturctor based injection (no need @Autowired annotation)
		System.out.println(myBean4);

		// using qualifiers (needed in both place)
		System.out.println(myBeanXXX);

		// ordered injection into a list
		System.out.println(cars);

		try {
			myService.doSomething();
		} catch (Exception e) {
			System.out.println("szopoka");
		}

		System.out.println(customerRepository.findAll());
		System.out.println(instrumentRepository.findAll());

		getReverseList2();
		// System.out.println(reverse);
	}

	public void getReverseList() {
		next = original.size() - counter;
		while (next > -1) {
			reverse.add(original.get(next));
			counter++;
			getReverseList();
		}

	}

	public void getReverseList2() {
		if (counter2 != original.size()) {
			original.add(original.size() - 1);
			original.remove(original.size() - counter2);
			counter2++;
			getReverseList2();
		}

		System.out.println(original);
	}

}
