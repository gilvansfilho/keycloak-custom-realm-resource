package br.com.gilvansfilho.spi.resource;

import org.keycloak.Config.Scope;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.services.resource.RealmResourceProvider;
import org.keycloak.services.resource.RealmResourceProviderFactory;

public class CustomResourceFactory implements RealmResourceProviderFactory {

    private static final String PROVIDER_ID = "custom-resource";

    @Override
    public void close() {
    }

    @Override
    public RealmResourceProvider create(KeycloakSession session) {
        return new CustomResourceProvider(session);
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }

    @Override
    public void init(Scope config) {
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
    }

}