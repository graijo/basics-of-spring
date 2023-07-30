package com.SDET.SpringSelenium;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringSeleniumApplicationTests {

    /*
    make the class @Component if you want it to @Autowired
     */
	@Autowired
	private User user;



    @Test
    void printDetailsConventional() {
		/*
    Create Address and Salary class ,
    define constructor to pass parm from it and also add getter method
    Create User class and define variable for Address and Salary class
    define constructor for above
    write method to print address and salary pass from their constructors
    In main test class ,inside @test -
    Create objects of Address,salary and then User
    Call print method from user
    */
        //commented below as we using @autowired annotation for setter method.Setter methods were added in place of Constructor
//        Address address = new Address();
//        Salary salary = new Salary();
//        User user = new User(address, salary);
//        user.printDetails();
    }

	@Test
	public void printDetailsSpring(){
		/*
		Add @Component above every class
		Add @autoWired in test class where you want to use those class's method
		@autoWired--your saying to spring to inject the object /Give me instance of object
		@component means manage objects for me
		 */
		user.printDetails();

	}


    /*VALUE INJECTION
 @Value :-to get environment values OR values from property files
 print system path(an environment variable using @Value
  */
    @Value("${path}")
    String path;
    @Value("${companyRoles}")
    String role;
    @Value("${companyRoles}")
    List<String> roleList;
    //How to add default value directly inside @Value
    @Value("${propertyNotInPropertyFile:www.google.com}")
    String webPathDefaultValue;

    @Test
    public void printVariable(){
        System.out.println(path);
        System.out.println(role);
        System.out.println(roleList);
        System.out.println(webPathDefaultValue);
    }

    /*
    HOW TO AUTOWIRE 3rd PART CLASSES
    Create config class in the level of main application class
    com/SDET/SpringSelenium/Config/SpringConfig.java
    Add @Configuration for config class
    Add @Bean above 3rd party class object getter
     */
    @Autowired
    private Faker faker;

    @Test
    public void printFakeFirstname(){
        System.out.println(faker.name().firstName());
    }

}
