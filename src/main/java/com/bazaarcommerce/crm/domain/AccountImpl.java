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

import org.broadleafcommerce.common.admin.domain.AdminMainEntity;
import org.broadleafcommerce.common.audit.Auditable;
import org.broadleafcommerce.common.copy.CreateResponse;
import org.broadleafcommerce.common.copy.MultiTenantCopyContext;
import org.broadleafcommerce.common.persistence.PreviewStatus;
import org.broadleafcommerce.common.persistence.Previewable;
import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.broadleafcommerce.common.presentation.client.VisibilityEnum;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;

/**
 * Created by ar366m on 4/27/2015.
 *
 * @author ar366m
 */
public class AccountImpl implements Account, AdminMainEntity, Previewable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CUSTOMER_ID")
    @AdminPresentation(friendlyName = "CustomerImpl_Customer_Id", group = "CustomerImpl_Primary_Key",
            visibility = VisibilityEnum.HIDDEN_ALL)
    protected Long id;

    @Column(name = "NAME")
    @AdminPresentation(friendlyName = "AccountImpl_Name", order = 4000, group = "CustomerImpl_Customer",
            visibility = VisibilityEnum.HIDDEN_ALL)
    protected String name;

    @Embedded
    protected Auditable auditable = new Auditable();

    @Embedded
    protected PreviewStatus previewable = new PreviewStatus();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMainEntityName() {
        return null;
    }

    @Override
    public <G extends Account> CreateResponse<G> createOrRetrieveCopyInstance(MultiTenantCopyContext context) throws CloneNotSupportedException {
        return null;
    }

    @Override
    public Boolean getPreview() {
        return null;
    }

    @Override
    public void setPreview(Boolean preview) {
    }
}
