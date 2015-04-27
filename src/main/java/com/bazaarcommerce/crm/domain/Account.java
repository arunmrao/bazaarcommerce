/*
 * #%L
 * crm
 * %%
 * Copyright (C) 2014 - 2015 Bazaar Commerce
 * %%
 * NOTICE:  All information contained herein is, and remains
 * the property of Bazaar Commerce, LLC
 * The intellectual and technical concepts contained
 * herein are proprietary to Bazaar Commerce, LLC
 * and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Bazaar Commerce, LLC.
 * #L%
 */
package com.bazaarcommerce.crm.domain;

import org.broadleafcommerce.common.copy.MultiTenantCloneable;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by ar366m on 4/27/2015.
 *
 * @author ar366m
 */
public interface Account extends Serializable, MultiTenantCloneable<Account> {
    public String getName();
    public void setName(String name);
}
