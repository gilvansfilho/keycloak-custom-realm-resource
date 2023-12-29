package br.com.gilvansfilho.spi.resource;

import org.keycloak.models.KeycloakSession;
import org.keycloak.services.resource.RealmResourceProvider;

public class CustomResourceProvider implements RealmResourceProvider {

    private KeycloakSession session;

    public CustomResourceProvider(KeycloakSession session) {
        this.session = session;
    }

    @Override
    public void close() {
    }

    @Override
    public Object getResource() {
        return new CustomResource(session);
    }

}