package xmu.crms.coursemanagesystem.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.coursemanagesystem.vo.UrlVO;

import javax.servlet.http.HttpServletResponse;

@RestController
public class UploadController {

    @PostMapping("/upload/avatar")
    public UrlVO uploadAvatar(HttpServletResponse response) {
        response.setStatus(201);
        UrlVO url = new UrlVO();
        url.setUrl("/avatar/3486.png");
        return url;
    }
}
