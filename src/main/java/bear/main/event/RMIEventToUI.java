/*
 * Copyright (C) 2013 Andrey Chaschev.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package bear.main.event;

import chaschev.json.JacksonMapper;
import chaschev.json.Mapper;
import com.google.common.collect.Lists;

import javax.annotation.Nullable;

/**
 * @author Andrey Chaschev chaschev@gmail.com
 */
public class RMIEventToUI extends EventToUI {
    @Nullable
    public String bean;
    public String method;
    public String jsonArrayOfParams;

    final Mapper mapper = new JacksonMapper();

    public RMIEventToUI(String bean, String method, Object... params) {
        super("rmi", "rootCtrl");
        this.bean = bean;
        this.method = method;

        jsonArrayOfParams = mapper.toJSON(Lists.newArrayList(params));
    }

    @Override
    public String getFormattedMessage() {
        return "ui: RMI call to " + bean + "." + method + "(" + jsonArrayOfParams + ")";
    }
}
