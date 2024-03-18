package com.oracle.fcr.ngi.renameIt.payload.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TestRequest {

    private Integer msgTyp;
    private String transactionID;
    private String orgRefTxnNo;
    private String txnDate;
    private String channelID;
    private String userNo;
    private Double fromAmount;
    private Integer fromAccountCcy;
    private String fromAccountNo;
    private Integer fromAccountBranch;
    private Integer fromLob;
    private Integer toAccountCcy;
    private String toAccountNo;
    private Integer toAccountBranch;
    private Integer toLob;
    private String narrative;
    private String userRefNo;
    private String refNo;

    @Override
    public String toString() {
        return "ApOlGlTxnLogWrapperReq [msgTyp=" + msgTyp + ", transactionID=" + transactionID + ", orgRefTxnNo="
                + orgRefTxnNo + ", txnDate=" + txnDate + ", channelID=" + channelID + ", userNo=" + userNo
                + ", fromAmount=" + fromAmount + ", fromAccountCcy=" + fromAccountCcy + ", fromAccountNo="
                + fromAccountNo + ", fromAccountBranch=" + fromAccountBranch + ", fromLob=" + fromLob
                + ", toAccountCcy=" + toAccountCcy + ", toAccountNo=" + toAccountNo + ", toAccountBranch="
                + toAccountBranch + ", toLob=" + toLob + ", narrative=" + narrative + ", userRefNo=" + userRefNo
                + ", refNo=" + refNo + "]";
    }

}
