package com.glqdlt.bookstore.api.entity.user;

/**
 * 가입한 형태
 * SELF = 자체 가입
 * OAUTH_* = 해당 도메인으로 가입
 * @author glqdlt
 */
public enum JoinType {
    OAUTH_NAVER,
    OAUTH_GOOGLE,
    SELF
}
