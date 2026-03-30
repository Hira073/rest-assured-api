package com.zain.api.portfolio.utils;

import com.zain.api.portfolio.models.CreateUserRequest;
import com.zain.api.portfolio.models.LoginRequest;

public final class TestDataFactory {

    private TestDataFactory() {
    }

    public static CreateUserRequest newUser() {
        return new CreateUserRequest("Zain Portfolio", "QA Automation Engineer");
    }

    public static CreateUserRequest updatedUser() {
        return new CreateUserRequest("Zain Portfolio", "Senior QA Automation Engineer");
    }

    public static LoginRequest invalidLoginWithoutPassword() {
        return new LoginRequest("peter@klaven", null);
    }
}
