package com.example.qrctfc.Service;

import com.example.qrctfc.Mapper.CertificationMapper;
import com.example.qrctfc.VO.CertificationVO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationService {
    @Setter(onMethod_ = @Autowired)
    private CertificationMapper mapper;

    public boolean insertCertification(CertificationVO vo) {
        return mapper.insertCertification(vo) == 1;
    }

    public List<CertificationVO> list(){
        return mapper.list();
    }

    public boolean outCertification(String phone) {
        return mapper.outCertification(phone) == 1;
    }
    public boolean deleteCertification(String phone) {
        return mapper.deleteCertification(phone) == 1;
    }
}
