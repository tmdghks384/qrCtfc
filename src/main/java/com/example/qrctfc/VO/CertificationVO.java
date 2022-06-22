package com.example.qrctfc.VO;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class CertificationVO {
    private String name;
    private String phone;
    private String company;
    private Timestamp regDate;
    private Timestamp outDate;
}
