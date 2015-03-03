/*
 * Seldon -- open source prediction engine
 * =======================================
 *
 * Copyright 2011-2015 Seldon Technologies Ltd and Rummble Ltd (http://www.seldon.io/)
 *
 * ********************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ********************************************************************************************
 */

package io.seldon.facebook.exception;

import io.seldon.api.resource.UserBean;

/**
 * Created by: marc on 25/07/2012 at 13:30
 */
public class FacebookTokenException extends Exception {
    private final UserBean userBean;
    private final String problematicToken;

    public FacebookTokenException(UserBean userBean, String fbToken) {
        this.userBean = userBean;
        this.problematicToken = fbToken;
    }

    @Override
    public String getMessage() {
        return "User " + userBean.getId() + ": facebook parameter active but fbToken (" + problematicToken + ") not provided.";
    }

    public String getProblematicToken() {
        return problematicToken;
    }

    public UserBean getUserBean() {
        return userBean;
    }
}