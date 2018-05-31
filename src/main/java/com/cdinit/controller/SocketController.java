package com.cdinit.controller;

import com.cdinit.websocket.MyHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.TextMessage;

import javax.servlet.http.HttpSession;

/**
 * Author: sun_chuan
 * Date: 2018/5/29
 * Time: 10:08
 * Description:
 */
@Controller
public class SocketController {
    @Autowired
    private MyHandler handler;


    @RequestMapping("/login/{userId}")
    public @ResponseBody
    String login(HttpSession session, @PathVariable("userId") Integer userId) {
        System.out.println("登录接口,userId="+userId);
        session.setAttribute("userId", userId);
        System.out.println(session.getAttribute("userId"));

        return "success";
    }

    @RequestMapping("/message")
    public @ResponseBody String sendMessage() {
        boolean hasSend = handler.sendMessageToUser(4, new TextMessage("发送一条小xi"));
        System.out.println(hasSend);
        return "message";
    }
}