package com.example.backened.filter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import org.springframework.util.AntPathMatcher;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "LoginCheckFilter",urlPatterns = "/*")

public class LoginCheckFilter implements Filter {
    public static final AntPathMatcher pathMatcher=new AntPathMatcher();
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest r = (HttpServletRequest) request;
        String requestURI = r.getRequestURI();
        String[] urls = new String[]{
                "/user/login",
                "/user/logout"
        };
       boolean check=check(requestURI,urls);
       if(check){
           chain.doFilter(request, response);
           return;
       }
        if(r.getSession().getAttribute("user")!=null){
            chain.doFilter(request, response);
        }
        return;
    }
    public boolean check(String URL,String[] urls)
    {

        for(String url:urls) {
            boolean match = pathMatcher.match(URL, url);
            if (match)
                return true;
        }
return false;
    }


}
