/*
 * #%L
 * BroadleafCommerce Framework
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
package org.broadleafcommerce.core.offer.dao;

import org.broadleafcommerce.core.offer.domain.CustomerOffer;
import org.broadleafcommerce.profile.core.domain.Customer;

import java.util.List;

public interface CustomerOfferDao {

    public CustomerOffer readCustomerOfferById(Long customerOfferId);

    public List<CustomerOffer> readCustomerOffersByCustomer(Customer customer);

    public CustomerOffer save(CustomerOffer customerOffer);

    public void delete(CustomerOffer customerOffer);

    public CustomerOffer create();
}
