/*
 * #%L
 * BroadleafCommerce Admin Module
 * %%
 * Copyright (C) 2009 - 2013 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.admin.web.rulebuilder.service.options;

import org.broadleafcommerce.common.BroadleafEnumerationType;
import org.broadleafcommerce.common.time.DayOfMonthType;
import org.broadleafcommerce.common.time.DayOfWeekType;
import org.broadleafcommerce.common.time.HourOfDayType;
import org.broadleafcommerce.common.time.MinuteType;
import org.broadleafcommerce.common.time.MonthType;
import org.broadleafcommerce.openadmin.web.rulebuilder.enums.AbstractRuleBuilderEnumOptionsExtensionListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Rule Builder enum options provider for {@link HourOfDayType}
 * 
 * @author Andre Azzolini (apazzolini)
 */
@Component("blTimeOptionsExtensionListener")
public class TimeEnumOptionsExtensionListener extends AbstractRuleBuilderEnumOptionsExtensionListener {

    @Override
    protected Map<String, Class<? extends BroadleafEnumerationType>> getValuesToGenerate() {
        Map<String, Class<? extends BroadleafEnumerationType>> map = 
                new HashMap<String, Class<? extends BroadleafEnumerationType>>();
        
        map.put("blcOptions_HourOfDay", HourOfDayType.class);
        map.put("blcOptions_DayOfWeek", DayOfWeekType.class);
        map.put("blcOptions_Month", MonthType.class);
        map.put("blcOptions_DayOfMonth", DayOfMonthType.class);
        map.put("blcOptions_Minute", MinuteType.class);
        
        return map;
    }

}
