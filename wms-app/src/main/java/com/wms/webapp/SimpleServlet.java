package com.wms.webapp;

import com.wms.core.SimpleService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 简单的webapp
 *
 * @author zhenhua.zhang
 * @since 15 六月 2019
 */
public class SimpleServlet extends HttpServlet {

    private static final long serialVersionUID = -3555713675444123382L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        String msg = SimpleService.getServiceDesc();
        out.println(msg);
        out.flush();
        out.close();
    }

}
