package com.example.qrctfc.Service;

import com.example.qrctfc.Mapper.AdminMapper;
import com.example.qrctfc.VO.AdminVO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Setter(onMethod_ = @Autowired)
    private AdminMapper mapper;

    public boolean joinAdmin(AdminVO vo) {
        return mapper.joinAdmin(vo) == 1;
    }

    public AdminVO loginAdmin(AdminVO vo) {
        return mapper.loginAdmin(vo);
    }
}
