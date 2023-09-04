package feign;

import org.springframework.cloud.openfeign.AnnotatedParameterProcessor;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.core.convert.ConversionService;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
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

    public SpringMvcContractImpl(ConversionService feignConversionService, List<AnnotatedParameterProcessor> processors) {
        super(processors, feignConversionService);
    }

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
