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

package bear.context;

import bear.session.DynamicVariable;

/**
 * @author Andrey Chaschev chaschev@gmail.com
 */
public abstract class VarFun<T, CONTEXT extends AbstractContext> implements Fun<CONTEXT, T> {
    protected DynamicVariable<T> var;

    public VarFun() {
    }


    public void setVar(DynamicVariable<T> var) {
        this.var = var;
    }

    public static <T> T undefined(){
        return (T)UNDEFINED;
    }
}
