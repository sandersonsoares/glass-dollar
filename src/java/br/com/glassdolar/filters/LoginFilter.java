/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.filters;

import br.com.glassdolar.model.Perfil;
import java.io.IOException;
import javax.faces.application.ResourceHandler;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author marce
 */
@WebFilter(servletNames = {"Faces Servlet"})
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String loginURL = request.getContextPath() + "/faces/index.xhtml";

        HttpSession session = request.getSession();
        Perfil perfil = (Perfil) session.getAttribute("user");
        
        boolean loginRequest = request.getRequestURI().startsWith(loginURL);
        boolean resourceRequest = request.getRequestURI().startsWith(request.getContextPath() + "/faces" + ResourceHandler.RESOURCE_IDENTIFIER);

        if (perfil != null || loginRequest || resourceRequest) {
            if (!resourceRequest) { // Prevent restricted pages from being cached.
                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
                response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
                response.setDateHeader("Expires", 0); // Proxies.
            }
            chain.doFilter(request, response);
        }else {
            response.sendRedirect(loginURL);
        }
    }

    @Override
    public void destroy() {
    }

}
