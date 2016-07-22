package by.grouk.callhandler.utils.template;

import javax.annotation.Resource;

import by.grouk.callhandler.utils.template.generator.TemplateCode;
import by.grouk.callhandler.utils.template.generator.TemplateGenerator;

/**
 * Created by Alena_Grouk on 7/22/2016.
 */
public class TemplateGeneratorFactory {

    @Resource
    @TemplateCode(1)
    TemplateGenerator templateGenerator;

    public TemplateGenerator getTemplateGenerator(){
        return templateGenerator;
    }
}