/*
 * #%L
 * ACS AEM Tools Bundle
 * %%
 * Copyright (C) 2014 Adobe
 * %%
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
 * #L%
 */
package com.adobe.acs.tools.util;

import javax.jcr.RepositoryException;

public interface AEMCapabilityHelper {

    /**
     * Determines if the AEM installation is running on an Apache Jackrabbit Oak-based repository.
     * @return true is running on Oak
     * @throws RepositoryException
     */
    boolean isOak() throws RepositoryException;
}
