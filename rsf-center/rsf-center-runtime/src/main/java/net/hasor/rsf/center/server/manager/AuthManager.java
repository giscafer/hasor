/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.rsf.center.server.manager;
import net.hasor.core.Inject;
import net.hasor.core.Singleton;
import net.hasor.rsf.RsfBindInfo;
import net.hasor.rsf.center.server.AuthQuery;
import net.hasor.rsf.center.server.domain.AuthInfo;
import net.hasor.rsf.center.server.domain.RsfCenterSettings;

import java.lang.reflect.Method;
/**
 *
 * @version : 2016年2月22日
 * @author 赵永春(zyc@hasor.net)
 */
@Singleton
public class AuthManager {
    @Inject
    private RsfCenterSettings rsfCenterCfg;
    @Inject
    private AuthQuery         authQuery;
    //
    public boolean checkAuth(AuthInfo requestAuthInfo, RsfBindInfo<?> bindInfo, Method method) {
        // TODO Auto-generated method stub
        System.out.println("checkAuth -> appCode=" + requestAuthInfo.getAppKey() + " ,authCode=" + requestAuthInfo.getAppKeySecret());
        return true;
    }
}