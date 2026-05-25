package com.google.code.beanmatchers;

import static com.google.code.beanmatchers.BeanOperations.getDeclaredMethod;
import static com.google.code.beanmatchers.BeanOperations.invokeMethod;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.hamcrest.Description;
import org.hamcrest.DiagnosingMatcher;

abstract class AbstractBeanAccessorMatcher<T> extends DiagnosingMatcher<T> {

    final TypeBasedValueGenerator valueGenerator;

    AbstractBeanAccessorMatcher(TypeBasedValueGenerator valueGenerator) {
        this.valueGenerator = valueGenerator;
    }

    protected boolean beanHasValidGetterAndSetterForProperties(JavaBean bean, List<String> properties, Description mismatchDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected boolean beanDoesNotHaveValidGetterAndSetterForProperty(JavaBean bean, String property) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean arraysEqual(Class<?> arrayType, Object testValue, Object result) {
        Class<?> argumentType = arrayType.getComponentType().isPrimitive() ? arrayType : Object[].class;
        Method method = getDeclaredMethod(Arrays.class, "equals", argumentType, argumentType);
        return (boolean) invokeMethod(null, method, testValue, result);
    }
}
