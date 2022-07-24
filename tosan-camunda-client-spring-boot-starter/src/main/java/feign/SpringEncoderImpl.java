package feign;

import com.tosan.camunda.camundaclient.CamundaEngineClientConfig;
import feign.codec.EncodeException;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.entity.ContentType;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;

import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Map;

/**
 * @author M.khoshnevisan
 * @since 2/16/2022
 */
@Slf4j
public class SpringEncoderImpl extends SpringEncoder {

    public SpringEncoderImpl(ObjectFactory<HttpMessageConverters> messageConverters) {
        super(messageConverters);
    }

    @Override
    public void encode(Object object, Type bodyType, RequestTemplate template) throws EncodeException {
        Map<String, Collection<String>> headers = template.headers();
        Collection<String> contentType = headers.get("Content-Type");
        if (contentType != null && contentType.contains(ContentType.MULTIPART_FORM_DATA.getMimeType())) {
            if (MAP_STRING_WILDCARD.equals(bodyType)) {
                Map<String, Object> objectMap = (Map) object;
                for (Map.Entry<String, Object> entry : objectMap.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof OffsetDateTime) {
                        OffsetDateTime value1 = (OffsetDateTime) value;
                        String formatted = value1.format(DateTimeFormatter.ofPattern(CamundaEngineClientConfig.DATE_PATTERN));
                        objectMap.put(entry.getKey(), formatted);
                    }
                }
            }
        }
        super.encode(object, bodyType, template);
    }
}