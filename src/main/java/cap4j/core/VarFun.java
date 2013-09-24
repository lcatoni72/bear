package cap4j.core;

import cap4j.session.DynamicVariable;
import cap4j.session.VariableUtils;

/**
 * User: chaschev
 * Date: 8/30/13
 */
public abstract class VarFun <T> {
    protected DynamicVariable<T> var;

    protected SessionContext $;

    public abstract T apply();

    protected String concat(Object... varsAndStrings){
        return VariableUtils.concat($, varsAndStrings);
    }

    public void setVar(DynamicVariable<T> var) {
        this.var = var;
    }

    public VarFun<T> set$(SessionContext $) {
        this.$ = $;
        return this;
    }
}
