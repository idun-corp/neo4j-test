package com.proptechos.neo4j.security;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class UserPrincipal {

    private String uuid;

    private List<String> roles;

    public static UserPrincipal authenticated() {
        UserPrincipal principal = new UserPrincipal();
        principal.uuid = UUID.randomUUID().toString();
        principal.roles = List.of("SOME_ROLE_UUID");
        return principal;
    }

}
