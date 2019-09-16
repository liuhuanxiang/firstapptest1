package com.hx.app.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Description：
 *
 * @author: liu.hx
 * @date: 2019-07-31  10:56
 */
@Getter
@Setter
public class User {

    private String userCode;
    private String userName;

    public User(String userCode, String userName) {
        this.userCode = userCode;
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!userCode.equals(user.userCode)) return false;
        return userName.equals(user.userName);
    }

    @Override
    public int hashCode() {
        int result = userCode.hashCode();
        result = 31 * result + userName.hashCode();
        return result;
    }
}
