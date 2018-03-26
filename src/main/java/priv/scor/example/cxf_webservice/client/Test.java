package priv.scor.example.cxf_webservice.client;

import java.lang.reflect.Method;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.fasterxml.jackson.databind.introspect.ClassIntrospector;

import priv.scor.example.cxf_webservice.service.User;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args ) throws Exception
    {
        c2();
    }
    
    public static void c2() {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/soap/user?wsdl");
        Object[] objects = null;
        try {
            objects = client.invoke("getUser", 10002L);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        User user = (User) objects[0];
        System.err.println(user.getUserId());
        System.out.println(objects[0].getClass());
        System.out.println(objects[0].toString());
    }
}
