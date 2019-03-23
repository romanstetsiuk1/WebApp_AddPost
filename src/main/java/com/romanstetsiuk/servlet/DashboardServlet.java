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
import java.util.List;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

    private final PostDao postDao = new PostDaoImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Post> posts = postDao.findAll();

        if (posts.isEmpty()) {
            Post post = new Post();
            post.setTitle("Servlets and JSP");
            post.setContent("Jelly chocolate tootsie roll marshmallow. Candy caramels muffin. " +
                    "Pastry toffee");
            post.setCreatedAt(LocalDateTime.now());
            postDao.create(post);
        }
    }
}
