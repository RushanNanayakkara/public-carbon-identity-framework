/*
 * Copyright (c) 2024, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.core.util;

import org.wso2.carbon.core.RegistryResources;

import javax.xml.namespace.QName;

/**
 * Utility methods for IdentityKeyStoreManager.
 */
public class IdentityKeyStoreResolverUtil {

    public static String buildTenantKeyStoreName(String tenantDomain) {

        String ksName = tenantDomain.trim().replace(".", "-");
        return ksName + IdentityKeyStoreResolverConstants.KEY_STORE_EXTENSION;
    }

    public static String buildCustomKeyStoreName(String keyStoreName) {

        return RegistryResources.SecurityManagement.CustomKeyStore.KEYSTORE_PREFIX + keyStoreName;
    }

    public static QName getQNameWithIdentityNameSpace(String localPart) {
        return new QName(IdentityCoreConstants.IDENTITY_DEFAULT_NAMESPACE, localPart);
    }
}
