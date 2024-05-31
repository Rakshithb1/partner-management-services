package io.mosip.pms.partner.service;

import io.mosip.pms.partner.dto.CertificateDto;
import io.mosip.pms.partner.dto.PartnerTypesDto;
import io.mosip.pms.partner.dto.PolicyDto;

import java.util.List;

public interface MultiPartnerService {

    public List<CertificateDto> getAllCertificateDetails();

    public List<PolicyDto> getAllPolicies();

    public List<PartnerTypesDto> getDetailsForAllPartnerTypes();
}
