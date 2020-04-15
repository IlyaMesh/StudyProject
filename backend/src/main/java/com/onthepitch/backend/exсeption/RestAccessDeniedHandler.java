package com.onthepitch.backend.exсeption;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.onthepitch.shared.model.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@Component
public class RestAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
//        ResponseEntity<MessageResponse> forbidden = new ResponseEntity<>(new MessageResponse("You have no rights to do that"), HttpStatus.FORBIDDEN);
//        OutputStream out = httpServletResponse.getOutputStream();
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(out, forbidden);
//        out.flush();
       httpServletResponse.sendError(HttpServletResponse.SC_FORBIDDEN, "Error: Forbidden");

    }
}
