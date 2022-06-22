package com.example.qrctfc.controller;

import com.example.qrctfc.Service.AdminService;
import com.example.qrctfc.VO.AdminVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
@Log4j2
public class AdminRestController {
    private final AdminService admin;

    @PostMapping("/rest/joinAdmin")
    @ResponseBody
    public ResponseEntity<String> joinAdmin(@RequestBody AdminVO vo) {
        boolean isInserted = admin.joinAdmin(vo);

        try {
            if (isInserted == true) {
                log.info("등록 완료");
            }
        } catch (DataAccessException e) {
            log.info("데이터 처리 실패");
        } catch (Exception e) {
            log.info("에러 발생");
        }
        return new ResponseEntity<>("등록 완료", HttpStatus.OK);
    }
}
