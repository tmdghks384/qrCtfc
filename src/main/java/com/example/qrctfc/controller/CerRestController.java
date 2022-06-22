package com.example.qrctfc.controller;

import com.example.qrctfc.Service.CertificationService;
import com.example.qrctfc.VO.CertificationVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@Log4j2
public class CerRestController {
    private final CertificationService service;

    @PostMapping("/rest/checkIn")
    @ResponseBody
    public ResponseEntity<String> insert(@RequestBody CertificationVO vo) {
        boolean isInserted = service.insertCertification(vo);
        log.info(vo);

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

    @PostMapping("/rest/checkOut")
    public ResponseEntity<String> checkOut(HttpServletRequest request) {
        String phone = request.getParameter("phone");
        boolean isUpdated = service.outCertification(phone);
        log.info(phone);

        try {
            if (isUpdated == true) {
                log.info("수정 완료");
            }
        } catch (DataAccessException e) {
            log.info("데이터 처리 실패");
        } catch (Exception e) {
            log.info("에러 발생");
        }
        return new ResponseEntity<>("수정 완료", HttpStatus.OK);
    }

    @PostMapping("/rest/deleteOut")
    @ResponseBody
    public ResponseEntity<String> deleteOut(HttpServletRequest request) {
        String phone = request.getParameter("phone");
        boolean isDeleted = service.deleteCertification(phone);
        log.info(phone);
        try {
            if (isDeleted == true) {
                log.info("삭제 완료");
            }
        } catch (DataAccessException e) {
            log.info("데이터 처리 실패");
        } catch (Exception e) {
            log.info("에러 발생");
        }
        return new ResponseEntity<>("삭제 완료", HttpStatus.OK);
    }
}
