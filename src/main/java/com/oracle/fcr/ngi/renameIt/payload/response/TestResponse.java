package com.oracle.fcr.ngi.renameIt.payload.response;

import com.oracle.fcr.ngi.payload.response.Response;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class TestResponse implements Response, Serializable {

	private static final long serialVersionUID = 7984978975120510419L;

	private String refTxnNo;
	private String responseMessage;
	private String responseCode;

	public TestResponse(String refTxnNo, String responseMessage, String responseCode) {
		this.refTxnNo = refTxnNo;
		this.responseMessage = responseMessage;
		this.responseCode = responseCode;
	}

	@Override
	public String toString() {
		return "TestResponse [refTxnNo=" + refTxnNo + ", responseMessage=" + responseMessage + ", responseCode="
				+ responseCode + "]";
	}

}
