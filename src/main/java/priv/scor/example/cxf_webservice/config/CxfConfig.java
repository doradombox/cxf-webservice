package priv.scor.example.cxf_webservice.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import priv.scor.example.cxf_webservice.service.IUserService;
import priv.scor.example.cxf_webservice.service.UserServiceImp;

@Configuration
public class CxfConfig {
    
    @Bean
    public ServletRegistrationBean dispatcherServlet1() {
        return new ServletRegistrationBean(new CXFServlet(), "/soap/*");
    }
  
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
    @Bean
    public IUserService userService() {
        return new UserServiceImp();
    }
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userService());
        endpoint.publish("/user");
        return endpoint;
    }

}
