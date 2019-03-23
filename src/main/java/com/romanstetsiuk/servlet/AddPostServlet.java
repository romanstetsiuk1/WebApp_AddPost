package com.romanstetsiuk.servlet;

import com.romanstetsiuk.dao.PostDao;
import com.romanstetsiuk.dao.PostDaoImpl;
import com.romanstetsiuk.model.Post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/addPost")
public class AddPostServlet extends HttpServlet {

    private final PostDao postDao = new PostDaoImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titleParam = req.getParameter("title");
        String contentParam = req.getParameter("content");

        Post post = new Post();
        post.setTitle(titleParam);
        post.setContent(contentParam);
        post.setCreatedAt(LocalDateTime.now());

        postDao.create(post);
        resp.sendRedirect("/dashboard");
    }
}
