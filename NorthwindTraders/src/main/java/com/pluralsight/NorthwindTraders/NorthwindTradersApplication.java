package com.pluralsight.NorthwindTraders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class  NorthwindTradersApplication implements CommandLineRunner {
@Autowired
	ProductDAO spd;

	public static void main(String[] args) {
		SpringApplication.run(NorthwindTradersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			System.out.println("I'm prompting you to do something \n 1. get all products \n 2. add a product");
			Scanner scanner = new Scanner(System.in);
			int userInput = scanner.nextInt();
			if (userInput == 1 ){
				System.out.println(spd.getAll());
			} else if (userInput == 2) {
				System.out.println("to add product: id, name, category, price");
				spd.addProduct(new Product());
			}
	}

}
