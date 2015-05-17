package CAMT.SE331.TermProject.Entity;

import org.springframework.cglib.core.Local;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by Taro on 3/18/2015.
 */
public class SerializableResourceBundleMessageSource extends ReloadableResourceBundleMessageSource {
    public Properties getAllProperties(Locale locale){
        clearCacheIncludingAncestors();
        PropertiesHolder propertiesHolder = getMergedProperties(locale);
        Properties properties = propertiesHolder.getProperties();

        return properties;
    }
}

