package com.example.functionexecutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class FunctionExecutorApplication {


	@Bean
	Function<Flux<String>,Flux<String>> uppercase(){
		return influx ->
		influx.map(String::toUpperCase);
	}

//	@Bean
//	Function<String,String> uppercase(){
//		return String::toUpperCase;
//	}


//	@Bean
//	Function <Flux<String>,Flux<Map<String,Object>>> aggregator(){
//		return  functinProcessor;
//	}
//
//	public Function <Flux<String>,Flux<Map<String,Object>>> functinProcessor = new Function<Flux<String>, Flux<Map<String, Object>>>() {
//		@Override
//		public Flux<Map<String, Object>> apply(Flux<String> stringFlux) {
//			return stringFlux.groupBy(str -> str.toCharArray()[0]);
//		}
//
//
//	};

	public static void main(String[] args) {
		SpringApplication.run(FunctionExecutorApplication.class, args);
	}
}
