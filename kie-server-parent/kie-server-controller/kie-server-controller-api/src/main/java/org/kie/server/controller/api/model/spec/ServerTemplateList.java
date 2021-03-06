/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.server.controller.api.model.spec;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "server-template-list")
public class ServerTemplateList {

    @XmlElement(name="server-template")
    private ServerTemplate[] serverTemplates;

    public ServerTemplateList() {
    }

    public ServerTemplateList(ServerTemplate[] serverTemplates) {
        this.serverTemplates = serverTemplates;
    }

    public ServerTemplateList(Collection<ServerTemplate> serverTemplates) {
        this.serverTemplates = serverTemplates.toArray(new ServerTemplate[serverTemplates.size()]);
    }

    public ServerTemplate[] getServerTemplates() {
        return serverTemplates;
    }

    public void setServerTemplates(ServerTemplate[] KieServerInstances) {
        this.serverTemplates = KieServerInstances;
    }
}
