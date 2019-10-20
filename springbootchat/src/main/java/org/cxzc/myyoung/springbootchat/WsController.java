package org.cxzc.myyoung.springbootchat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class WsController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
        if (principal.getName().equals("andy")) {
            messagingTemplate.convertAndSendToUser("chen", "/queue/notifications", principal.getName() + "的消息=：" + msg);
        }else{
            messagingTemplate.convertAndSendToUser("andy", "/queue/notifications", principal.getName() + "的消息：" + msg);
        }
    }
}
