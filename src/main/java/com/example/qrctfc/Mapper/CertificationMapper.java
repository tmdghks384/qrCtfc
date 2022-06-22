package com.example.qrctfc.Mapper;

import com.example.qrctfc.VO.CertificationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CertificationMapper {
    public int insertCertification(CertificationVO vo);

    public List<CertificationVO> list();

    public int outCertification(String phone);

    public int deleteCertification(String phone);
}
