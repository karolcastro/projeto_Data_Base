package com.pessoal.courseCoder;

import com.pessoal.courseCoder.Data.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseCoderApplication {

	public static void main(String[] args) {

		SpringApplication.run(CourseCoderApplication.class, args);

		Data data1 = new Data();

		Data data2 = new Data(31,12,1984);

		String dataFormatada1 = data1.obterDataFormatada();

		System.out.println(dataFormatada1);
		System.out.println(data2.obterDataFormatada());

		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}

}
