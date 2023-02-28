package calls;
import io.restassured.RestAssured;
import static org.joox.JOOX.*;
import org.joox.Match;

import static io.restassured.RestAssured.*;
import files.Payload;

public class UserAccountLogin {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://test.api.system.simplyclub.co.il";
		
		String response = given().queryParam("op", "UserAccountLogin")
		.header("Content-Type", "text/xml")
		.body(Payload.UserAccountLogin()).when().post("TerminalService.asmx")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
		
		Match match = $(response);
		
		String loginCode = match.find("LoginCode").text();
		
		System.out.println("LoginCode value: " + loginCode);
	}
}
