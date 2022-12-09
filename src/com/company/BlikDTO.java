package com.company;

import java.util.Date;

public class BlikDTO {
    private String code;
    AccountDTO accountDto
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expirationDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AccountDTO getAccountDto() {
        return accountDto;
    }

    public void setAccountDto(AccountDTO accountDto) {
        this.accountDto = accountDto;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
