package br.com.gilvansfilho.spi.resource;

import javax.ws.rs.GET;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.keycloak.models.KeycloakSession;
import org.keycloak.services.managers.AppAuthManager;
import org.keycloak.services.managers.AuthenticationManager.AuthResult;

public class CustomResource {

    private final KeycloakSession session;
    
    public CustomResource(KeycloakSession session) {
        this.session = session;
    }

    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String authHello() {
        AuthResult auth = new AppAuthManager.BearerTokenAuthenticator(session).authenticate();
        if (auth == null || auth.getToken() == null) {
            throw new NotAuthorizedException("Bearer");
        }
        return "hello authenticated user!";
    }

    @GET
    @Path("hello-anonymous")
    @Produces(MediaType.APPLICATION_JSON)
    public String anonymousHello() {
        return "hello anonymous user!";
    }
    
}