package feign;

import org.springframework.cloud.openfeign.support.SpringMvcContract;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * @author M.khoshnevisan
 * @since 1/17/2022
 */
public class SpringMvcContractImpl extends SpringMvcContract {

    private Set<String> ignoredMethodNames = new HashSet<String>(){{
        add("getObjectMapper");
        add("getRequest");
    }};

    @Override
    public MethodMetadata parseAndValidateMetadata(Class<?> targetType, Method method) {
        if (ignoredMethodNames.contains(method.getName())) {
            MethodMetadata methodMetadata = new MethodMetadata();
            methodMetadata.targetType(targetType);
            methodMetadata.method(method);
            methodMetadata.returnType(Types.resolve(targetType, targetType, method.getGenericReturnType()));
            methodMetadata.configKey(Feign.configKey(targetType, method));
            return methodMetadata;
        }
        return super.parseAndValidateMetadata(targetType, method);
    }
}
