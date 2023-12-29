# Custom Realm Resurce for Keycloak

A custom base realm resource for keycloak.

To test make a curl like below:

```
# anonymous request 
curl -X GET http://127.0.0.1:8080/auth/realms/master/custom-resource/hello-anonymous
```

or

```
# authenticated request (need a token)
curl -X GET -H "Authorization: Bearer {YOUR_TOKE}" \
http://127.0.0.1:8080/auth/realms/master/custom-resource/hello
```
