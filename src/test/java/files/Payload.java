package files;

public class Payload {
	
	public static String UserAccountLogin()
	{
		return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"  <soap:Body>\r\n" + 
				"    <UserAccountLogin xmlns=\"http://tempuri.org/\">\r\n" + 
				"      <account>\r\n" + 
				"        <VendorApiKey>string</VendorApiKey>\r\n" + 
				"        <User>resttest</User>\r\n" + 
				"        <Password>resttest1234</Password>\r\n" + 
				"      </account>\r\n" + 
				"      <additionalInfo>\r\n" + 
				"        <FieldData>\r\n" + 
				"          <FieldId>string</FieldId>\r\n" + 
				"          <FieldValue>string</FieldValue>\r\n" + 
				"        </FieldData>\r\n" + 
				"        <FieldData>\r\n" + 
				"          <FieldId>string</FieldId>\r\n" + 
				"          <FieldValue>string</FieldValue>\r\n" + 
				"        </FieldData>\r\n" + 
				"      </additionalInfo>\r\n" + 
				"    </UserAccountLogin>\r\n" + 
				"  </soap:Body>\r\n" + 
				"</soap:Envelope>";
	}
	
	public static String MemberGetDetails()
	{
		return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"  <soap:Body>\r\n" + 
				"    <MemberGetDetails xmlns=\"http://tempuri.org/\">\r\n" + 
				"      <auth>\r\n" + 
				"        <LoginCode>39007767765456</LoginCode>\r\n" + 
				"        <AuthType>ByUser</AuthType>\r\n" + 
				"        <Terminal>\r\n" + 
				"          <VendorApiKey>string</VendorApiKey>\r\n" + 
				"          <AccountId>5</AccountId>\r\n" + 
				"          <SubNetCode>string</SubNetCode>\r\n" + 
				"          <BranchNetCode>string</BranchNetCode>\r\n" + 
				"          <DeviceNetCode>string</DeviceNetCode>\r\n" + 
				"          <TerminalType>DT_POS</TerminalType>\r\n" + 
				"          <OperatorNumber>string</OperatorNumber>\r\n" + 
				"        </Terminal>\r\n" + 
				"        <Account>\r\n" + 
				"          <VendorApiKey>string</VendorApiKey>\r\n" + 
				"          <User>resttest</User>\r\n" + 
				"          <Password>resttest1234</Password>\r\n" + 
				"        </Account>\r\n" + 
				"      </auth>\r\n" + 
				"      <fieldId>CELL_PHONE</fieldId>\r\n" + 
				"      <fieldValue>0544988256</fieldValue>\r\n" + 
				"      <additionalInfo>\r\n" + 
				"        <FieldData>\r\n" + 
				"          <FieldId>string</FieldId>\r\n" + 
				"          <FieldValue>string</FieldValue>\r\n" + 
				"        </FieldData>\r\n" + 
				"        <FieldData>\r\n" + 
				"          <FieldId>string</FieldId>\r\n" + 
				"          <FieldValue>string</FieldValue>\r\n" + 
				"        </FieldData>\r\n" + 
				"      </additionalInfo>\r\n" + 
				"    </MemberGetDetails>\r\n" + 
				"  </soap:Body>\r\n" + 
				"</soap:Envelope>";
	}

}
