import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import springfox.documentation.schema.ModelRef;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@ConfigurationProperties("swagger")
public class SwaggerProperties {

    /**是否开启swagger**/
    private Boolean enabled;

    /**标题**/
    private String title = "";
    /**描述**/
    private String description = "";
    /**版本**/
    private String version = "";
    /**许可证**/
    private String license = "";
    /**许可证URL**/
    private String licenseUrl = "";
    /**服务条款URL**/
    private String termsOfServiceUrl = "";

    private Contact contact = new Contact();

    /**swagger会解析的包路径**/
    private String basePackage = "";

    /**swagger会解析的url规则**/
    private List<String> basePath = new ArrayList<>();
    /**在basePath基础上需要排除的url规则**/
    private List<String> excludePath = new ArrayList<>();

    /**分组文档**/
    private Map<String, DocketInfo> docket = new LinkedHashMap<>();

    /**host信息**/
    private String host = "";

    /**全局参数配置**/
    private List<GlobalOperationParameter> globalOperationParameters;

}