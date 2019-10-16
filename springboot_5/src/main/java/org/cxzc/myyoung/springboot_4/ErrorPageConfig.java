package org.cxzc.myyoung.springboot_4;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ErrorPageConfig implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage error400Page=new ErrorPage(HttpStatus.BAD_REQUEST,"/error400" );
        ErrorPage error401Page=new ErrorPage(HttpStatus.UNAUTHORIZED,"/error401");
        ErrorPage error404Page=new ErrorPage(HttpStatus.NOT_FOUND,"/404" );
        ErrorPage error500Page=new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error500");
        registry.addErrorPages(error400Page,error401Page,error404Page,error500Page);
    }
}
