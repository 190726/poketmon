package com.sk.poket.adapter.out;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

//https://namu.wiki/w/%ED%8F%AC%EC%BC%93%EB%AA%AC%EC%8A%A4%ED%84%B0/%EB%AA%A9%EB%A1%9D/9%EC%84%B8%EB%8C%80
public class PoketFetchApi {
	
	@Test
	void test1() throws Exception {
		RestAssured.given().log().all()
		.when()
		.get("https://pokeapi.co/api/v2/language/3/")
		.then().log().all();
	}
}