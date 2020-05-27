package functionalTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

public class GetRequestAutomation {

	@Test

	public void getRequestAutomation()

	{

		RestAssured.baseURI = "http://apiqa4.shopclues.com/api/v11/atom/CluesWallet/getBalance";

		Response response = RestAssured.given()
				.param("key", "d42121c70dda5edfgd1df6633fdb36c0")
				.param("platform", "D")
				.param("wallet_id", "4842").when().get();
		if (response.getStatusCode() == 200) {
			System.out.println(response.getBody().asString());
			System.out.println("getStatusCode " + response.getStatusCode());
			System.out.println("contentType " + response.contentType());
			System.out.println("responseTime " + response.getTime());
			response.prettyPrint();
		}
		elseif(all(response.getStatusCode() == 411));
		{
			Response response1 = RestAssured.given().param("key", "d42121c70dda5edfgd1df6633fdb36c0")
					.param("wallet_id", "4842").when().get();
			System.out.println(response1.getBody().asString());
			System.out.println("getStatusCode " + response1.getStatusCode());
			System.out.println("contentType " + response1.contentType());
			System.out.println("responseTime " + response1.getTime());
			response1.prettyPrint();

		}

	}

	private boolean all(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	private void elseif(boolean b) {
		// TODO Auto-generated method stub

	}

}