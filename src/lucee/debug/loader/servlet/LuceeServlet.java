package lucee.debug.loader.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public final class LuceeServlet extends LuceeDebugServlet  {

    @Override
    protected void service( HttpServletRequest req, HttpServletResponse rsp ) throws ServletException, IOException {
        System.out.println("Lucee Servlet received service request : " + this.getClass().getSimpleName() );

    	engine.service( this, req, rsp );
    }
}