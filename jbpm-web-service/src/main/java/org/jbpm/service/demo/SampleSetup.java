/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.service.demo;

import java.util.HashMap;
import java.util.Map;

import org.jbpm.task.Group;
import org.jbpm.task.User;
import org.jbpm.task.service.TaskService;
import org.jbpm.task.service.TaskServiceSession;

public class SampleSetup {

    private TaskService service;
    Map<String, User> users = new HashMap<String, User>() {{
        put("darth", new User("Darth Vader"));
        put("bobba", new User("Bobba Fet"));
        put("jabba", new User("Jabba Hutt"));
        put("dalai", new User("Dalai Lama"));
        put("christoper", new User("Christoper Columbus"));
        put("stuart", new User("Stuart Little"));
        put("jane", new User("Jane Austin"));
        put("peter", new User("Peter Parker"));
        put("steve", new User("Steve Rogers"));
        put("sly", new User("Sly Stalone"));
        put("liz", new User("Elizabeth Windsor"));
        put("bruce", new User("Bruce Wayne"));
        put("tony", new User("Tony Stark"));
        put("luke", new User("Luke Cage"));
        put("Administrator", new User("Administrator"));
        put("krisv", new User("krisv"));
        put("john", new User("john"));
        put("mary", new User("mary"));
        put("sales", new User("sales-rep"));
        put("doctor", new User("doctor"));
        put("frontDesk", new User("frontDesk"));
        put("manager", new User("manager"));
    }};

    Map<String, Group> groups = new HashMap<String, Group>() {{
        put("GroupA", new Group("GroupA"));
        put("GroupB", new Group("GroupB"));
    }};

    public SampleSetup(final TaskService service) {
        this.service = service;
    }

    public void init() {
        service.setUserinfo(new MockUserInfo());
        final TaskServiceSession session = service.createSession();
        try {
            for (User user : users.values()) {
                session.addUser(user);
            }

            for (Group group : groups.values()) {
                session.addGroup(group);
            }
        } catch (Exception ex) {
        }
    }

}
