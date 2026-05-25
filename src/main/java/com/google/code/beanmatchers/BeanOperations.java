package com.google.code.beanmatchers;

import static java.beans.Introspector.getBeanInfo;
import java.beans.BeanInfo;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final class BeanOperations {

    private BeanOperations() {
    }

    public static <T> T instantiateBean(Class<T> beanClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> Constructor<T> noArgsConstructor(Class<T> beanClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static List<String> properties(Class<?> beanType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static List<String> properties(PropertyDescriptor[] descriptors) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> PropertyDescriptor[] propertyDescriptors(T bean) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static PropertyDescriptor[] propertyDescriptors(Class<?> beanType) {
        return beanInfo(beanType).getPropertyDescriptors();
    }

    private static BeanInfo beanInfo(Class targetClass) {
        try {
            return getBeanInfo(targetClass);
        } catch (Exception exception) {
            throw new BeanMatchersException(exception);
        }
    }

    public static Object invokeGetter(Object bean, PropertyDescriptor property) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void invokeSetter(Object bean, PropertyDescriptor property, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Method getDeclaredMethod(Class type, String methodName, Class... argTypes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Object invokeMethod(Object bean, Method method, Object... args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
