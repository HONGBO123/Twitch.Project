package com.example.twitch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

@Controller
public class GameController {
    // game?game_name=war%20xxx
    // 前段是发game_name request
    //requestparam get the URL
    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public void getGame(@RequestParam("game_name ") String gameName, HttpServletResponse response) {

    }
}
