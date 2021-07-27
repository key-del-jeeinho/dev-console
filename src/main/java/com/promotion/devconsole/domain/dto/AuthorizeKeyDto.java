package com.promotion.devconsole.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@EqualsAndHashCode
@ToString
public class AuthorizeKeyDto {
    private String authorizeKey;
    private ApiDto api;
    private PermissionDto permission;
}
