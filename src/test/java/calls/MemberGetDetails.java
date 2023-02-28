package calls;
import io.restassured.RestAssured;
import static org.joox.JOOX.*;
import org.joox.Match;

import static io.restassured.RestAssured.*;
import files.Payload;

public class MemberGetDetails {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://test.api.system.simplyclub.co.il";
		
		String response = given().queryParam("op", "MemberGetDetails")
		.header("Content-Type", "text/xml")
		.body(Payload.MemberGetDetails()).when().post("TerminalService.asmx")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
		
		Match match = $(response);
		
		String clubName = match.find("ClubName").text();
		
		System.out.println("ClubName value: " + clubName);
	}
}
